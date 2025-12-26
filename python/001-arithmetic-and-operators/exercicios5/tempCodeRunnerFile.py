import sys 

energy_consumed = int(input('Digite a quantidade de KWh consumida: '))
print('')
print('TIPOS DE INSTALAÇÃO')
print('')
print('| R - Residências |')
print('| I - Indústrias  |')
print('| C - Comércios   |')
print('')

installation_type = input('Qual o tipo de instalação? ')
installation_type = installation_type.capitalize()

if installation_type not in ['R', 'I', 'C']:
    sys.exit(1)
else:
    print('')

price = 0

if  500 >= energy_consumed > 0 and installation_type == 'R':
    price = energy_consumed * 0.40
elif energy_consumed > 500 and installation_type == 'R':
    price = energy_consumed * 0.65
elif  0 < energy_consumed <= 1000 and installation_type == 'C':
    price = energy_consumed * 0.55
elif energy_consumed > 1000 and installation_type == 'C':
    price = energy_consumed * 0.60
elif 0 < energy_consumed <= 5000 and installation_type == 'I':
    price = energy_consumed * 0.55
elif energy_consumed > 5000 and installation_type == 'I':
    price = energy_consumed * 0.60
   
print('Resultado do Cálculo') 
print('')
print(f'kWh consumida {energy_consumed}')
print(f'Tipo de Instalação: {installation_type}')
print(f'Valor a pagar: {price:.2f}')
