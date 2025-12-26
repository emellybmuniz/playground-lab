#Escreva um algoritmo que calcule a média dos números pares de 1 até 100 (1 e 100 inclusos). Implemente o laço usando for 

total_sum = 0
counter = 0

for i in range(1, 101):
    if i % 2 == 0:
        total_sum += i
        counter += 1
average = total_sum / counter
print(average)  # 51.0