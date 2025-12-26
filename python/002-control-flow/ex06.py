print('Bem vindo ao Somatório de números!')
first_number = int(input('Digite um número para começar: '))
sum = 0

while True:
    value = int(input('Insira outro número. 0 para sair: '))
    if value:
        sum += value
    else:
        print('Encerrando o programa...')
        break
    
print(f'Somatório: {sum + first_number}')

#Bem vindo ao Somatório de números!
#Digite um número para começar: 40
#Insira outro número. 0 para sair: 90
#Insira outro número. 0 para sair: 0
#Encerrando o programa...
#Somatório: 130