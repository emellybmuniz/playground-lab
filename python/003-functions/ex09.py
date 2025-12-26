notas = []

for i in range(1,6):
    nota =float(input(f'Digite a {i} nota: '))
    notas.append(nota)
    
media = (sum(notas)) / len(notas)
print(media)
    