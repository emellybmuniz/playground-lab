notas = [9, 7, 7, 10, 3, 9, 6, 6, 2]
notas.sort()
print(notas)

# [2, 3, 6, 6, 7, 7, 9, 9, 10]


count = 0
for i in notas:
    if i == 7:
        count += 1

print(count) # a) 2

notas_antigas = notas[:]
notas[-1] = 4

print(notas_antigas)
print(notas)

maior = 0
i_ref = 9

for i in notas:
    if i > i_ref:
        maior = i
        i_ref = i
        
print(maior) #10


print(max(notas))

print(notas.sort())

acumulador = 0
for i in notas:
    acumulador += i

media = acumulador / len(notas)
print(2, round(media)) #2.6
    

print(2, round(sum(notas) / len(notas))) # 2.6
        

