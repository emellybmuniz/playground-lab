ano = int(input('Digite um ano: ')) # 2024

if ano % 4 == 0:
    print('Pode ser um ano bissexto')
else:
    print('Definitivamente não é um ano bissexto')
    # Pode ser um ano bissexto


cima = False
baixo = True

if cima and baixo == True:
    print('Decida-se!')
elif cima == True:
    print('Você escolheu o caminho de cima!')
elif baixo == True:
    print('Você escolheu o caminho de baixo!')
else:
    print('Você não escolheu caminho nenhum!')
    # Você escolheu o caminho de baixo!