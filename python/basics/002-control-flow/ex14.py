people_counted = 0
total_ticket_price = 0.0
age_sum = 0

while True:
    try:
        # Exibição das opções de preço
        print('Preços dos Ingressos:')
        print('- Menos de 3 anos: ingresso gratuito')
        print('- De 3 a 12 anos: ingresso R$15,00')
        print('- Maior de 12 anos: ingresso R$30,00')
        
        age = int(input(f'\nUsuário {people_counted + 1}: favor, informe sua idade: '))
        
        print('Digite 0 para sair do menu.')
        

        if age == 0:
            print('Programa encerrado!')
            break

        people_counted += 1
        age_sum += age
        
        
        if age < 3:
            total_ticket_price += 0
        elif 3 <= age <= 12:
            total_ticket_price += 15.00
        else:
            total_ticket_price += 30.00
        
    except ValueError:
        print('Idade inválida!')
        break

print('\n----TOTAL----')
if age_sum:
    print(f'Total de pessoas que compraram o ingresso: {people_counted}')
    print(f'Total de dinheiro arrecadado: R${total_ticket_price:.2f}')
    print(f'Média de idade das pessoas: {age_sum / people_counted:.2f} anos')
    









