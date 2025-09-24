# Escreva um algoritmo que imprima na tela somente valores dentro de um intervalo especificado pelo usuário e que sejam número pares 

import sys

start = int(input('Digite um número de 1 a 100: '))
end = int(input('Digite outro número no mesmo intervalo: '))

if start < 1 or start > 100 or end < 1 or end > 100:
    print('Entrada inválida. Tente usar números de 1 à 100')
    sys.exit()
  
while start <= end:
    if (start % 2 == 0):
        print(start)
    start += 1