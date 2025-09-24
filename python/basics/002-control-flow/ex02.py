counter = 1
acumulator = 0

while counter < 6:
    acumulator += float(input(f'Digite a {counter}o nota: '))
    counter += 1
    
grade = acumulator / 5
print(grade)

# Digite a 1o nota: 10
# Digite a 2o nota: 9
# Digite a 3o nota: 8
# Digite a 4o nota: 4
# Digite a 5o nota: 1
# 6.4