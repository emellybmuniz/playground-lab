print('Feirinha Virtual :)')
print('1. Maçãs')
print('2. Laranjas')
print('3. Bananas')
print('4. Cancelar')

try:
    user_choice = int(input('\nEscolha uma das opções para comprar: '))
    qntd = 0

    match user_choice:
        case 1:
            fruta, preco = "Maçã", 2.30
        case 2:
            fruta, preco = "Laranja", 3.60
        case 3:
            fruta, preco = "Banana", 1.85
        case 4:
            print('Operação cancelada!')
            exit()
        case _:
            print('Opção inválida!')
            exit()
    
    while qntd <= 0:
        try:
            qntd = int(input('Escolha a quantidade: '))
            if qntd <= 0:
                print('Por favor, insira um número positivo.')
        except ValueError:
            print('Entrada inválida! Insira um número inteiro.')
            qntd = 0
    
    value = qntd * preco
    if qntd == 1:
        print(f'{qntd} {fruta} foi adicionada com sucesso ao carrinho! TOTAL DA COMPRA: R$ {value:.2f}')
    else:
        print(f'{qntd} {fruta}s foram adicionadas com sucesso ao carrinho! TOTAL DA COMPRA: R$ {value:.2f}')

except ValueError:
    print('Entrada inválida! Insira um número inteiro.')