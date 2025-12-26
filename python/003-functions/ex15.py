# Exercício 3: Crie um programa para ler o nome, ano de nascimento e sexo de diferentes pessoas
# Armazene os dados em um dicionário com listas
# Ao encerrar o cadastro, apresente:
#   - O total de cadastros efetuados
#   - A média das idades das pessoas
#   - Uma lista de mulheres com menos de 30 anos
#   - Uma lista de homens com idade acima da média

import datetime

def create_person():
    name_input = input('Digite seu nome: ')
    birth_year_input = int(input('Digite seu ano de aniversário: '))
    gender_input = input('Digite seu gênero (F/M): ').lower()
    
    while True:
        if gender_input not in ['f', 'm']:
            print('Entrada inválida')
            gender_input = input('Digite seu gênero (F/M): ').lower()
        else:
            break
    
    return {'name': name_input, 'birth_year': birth_year_input, 'gender': gender_input}

registered_persons = []
exit_program = ''
count_person = 0
sum_age = 0
list_womans = []
list_men_above_average = []

print('Cadastro de Pessoas')
while exit_program != 'SAIR':
    persons = create_person()
    registered_persons.append(persons)
    count_person += 1
    age = datetime.date.today().year - persons['birth_year']
    sum_age += age
    if age < 30 and persons['gender'] == 'f':
        list_womans.append(persons['name'])
        
    exit_program = input('Digite SAIR para encerrar o programa, e Enter para continuar: ').upper()

averange = sum_age / count_person

for person in registered_persons:
    age = datetime.date.today().year - person['birth_year']
    if age > averange and person['gender'] == 'm':
        list_men_above_average.append(person['name'])

print(f'PESSOAS REGISTRADAS: {registered_persons}')  
print(f'TOTAL DE PESSOAS REGISTRADAS: {count_person}')
print(f'MÉDIA DE IDADES: {averange:.2f}')
print(f'MULHERES COM MENOS DE 30 ANOS: {list_womans}')
print(f'HOMENS COM IDADE ACIMA DA MÉDIA: {list_men_above_average}')


# PESSOAS REGISTRADAS: [{'name': 'Renata', 'birth_year': 2000, 'gender': 'f'}, {'name': 'João', 'birth_year': 2003, 'gender': 'm'}, {'name': 'Emelly', 'birth_year': 2005, 'gender': 'f'}]   
# TOTAL DE PESSOAS REGISTRADAS: 3
# MÉDIA DE IDADES: 22.333333333333332
# MULHERES COM MENOS DE 30 ANOS: ['Renata', 'Emelly']
# HOMENS COM IDADE ACIMA DA MÉDIA: []
# PS C:\Users\Emelly\Documents\estudos\python> 

