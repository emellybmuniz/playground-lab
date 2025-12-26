try:
    value = int(input(f'Digite um número, que eu te direi a quantidade\nde cédulas que são precisas para pagar esse valor: '))
except ValueError:
    print('Estrada inválida!')
 
tot = 0 
qnt100 = 0
qnt50 = 0
qnt20 = 0
qnt10 = 0
qnt5 = 0
qnt1 = 0

while True:
    if value >= 100:
       qnt100 = value // 100
    value -= qnt100 * 100
    
    
    if value >= 50:
       qnt50 = value // 50
    value -= qnt50 * 50
    
    
    if value >= 20:
       qnt20 = value // 20
    value -= qnt20 * 20
    
    
    if value >= 10:
       qnt10 = value // 10
    value -= qnt10 * 10
    
    
    if value >= 5:
       qnt5 = value // 5
    value -= qnt5 * 5
    
    
    if value:
       qnt1 = value 
    
    break

print(f'Notas de R$100: {qnt100:.0f}\nNotas de R$50: {qnt50:.0f}\nNotas de R$20: {qnt20:.0f}\nNotas de R$10: {qnt10:.0f}\nNotas de R$5: {qnt5:.0f}\nNotas de R$1 {qnt1:.0f}')