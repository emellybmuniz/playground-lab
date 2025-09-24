# Bem-vindo à loja
print('Bem vindo(a) a minha loja Online :)')
print('')

# Mostrar categorias
print('1. Eletrônicos')
print('2. Vestuário')
print('3. Livros')
categoria_input = int(input('Escolha qual categoria de produtos deseja ver (1, 2 ou 3): '))

# Eletrônicos
if categoria_input == 1:
    print('\nEletrônicos:')
    print('1. Tablet - R$ 600.00')
    print('2. Celular - R$ 800.00')
    print('3. Notebook - R$ 1500.00')
    produto_input = int(input('Escolha o produto (1, 2 ou 3): '))
    
    if produto_input == 1:
        produto_valor = 600.00
    elif produto_input == 2:
        produto_valor = 800.00
    elif produto_input == 3:
        produto_valor = 1500.00
    else:
        print('Produto inválido!')
        produto_valor = 0  # Valor inválido para evitar erros

# Vestuário
elif categoria_input == 2:
    print('\nVestuário:')
    print('1. Camiseta - R$ 100.00')
    print('2. Bermuda - R$ 120.00')
    print('3. Vestido - R$ 200.00')
    produto_input = int(input('Escolha o produto (1, 2 ou 3): '))
    
    if produto_input == 1:
        produto_valor = 100.00
    elif produto_input == 2:
        produto_valor = 120.00
    elif produto_input == 3:
        produto_valor = 200.00
    else:
        print('Produto inválido!')
        produto_valor = 0  # Valor inválido para evitar erros

# Livros
elif categoria_input == 3:
    print('\nLivros:')
    print('1. O retrato de Dorian Gray - R$ 40.00')
    print('2. Harry Potter - R$ 60.00')
    print('3. A revolução dos bichos - R$ 30.00')
    produto_input = int(input('Escolha o produto (1, 2 ou 3): '))
    
    if produto_input == 1:
        produto_valor = 40.00
    elif produto_input == 2:
        produto_valor = 60.00
    elif produto_input == 3:
        produto_valor = 30.00
    else:
        print('Produto inválido!')
        produto_valor = 0  # Valor inválido para evitar erros

# Categoria inválida
else:
    print('Categoria inválida!')
    produto_valor = 0  # Valor inválido para evitar erros

# Cálculo do desconto
if produto_valor > 0:  # Só calcula se o produto for válido
    if categoria_input == 1:  # Eletrônicos
        if produto_valor > 500:
            desconto = produto_valor * 0.10
        elif produto_valor > 200:
            desconto = produto_valor * 0.05
        else:
            desconto = 0
    elif categoria_input == 2:  # Vestuário
        if produto_valor > 300:
            desconto = produto_valor * 0.15
        elif produto_valor > 150:
            desconto = produto_valor * 0.10
        else:
            desconto = 0
    elif categoria_input == 3:  # Livros
        if produto_valor > 100:
            desconto = produto_valor * 0.20
        elif produto_valor > 50:
            desconto = produto_valor * 0.15
        else:
            desconto = 0

    # Valor final
    valor_final = produto_valor - desconto

    # Mostrar resultado
    print(f'\nValor do Produto: R$ {produto_valor:.2f}')
    if desconto > 0:
        print(f'Desconto aplicado: R$ {desconto:.2f}')
    print(f'Valor final: R$ {valor_final:.2f}')
else:
    print('Compra cancelada. Produto ou categoria inválida.')
    
    
    # Exercício 4.1.1
print('Escolha o que deseja comprar:')
print('1 - Maçã')
print('2 - Laranja')
print('3 - Banana')
produto = int(input('Qual sua escolha? '))
qtd = int(input('Quantas unidades? '))

if produto == 1:
    pagar = qtd * 2.3
    print(f'Você comprou {qtd} maçãs. Total à pagar: {pagar:.2f}')
else:
    if produto == 2:
        pagar = qtd * 3.6
        print(f'Você comprou {qtd} laranjas. Total a pagar: {pagar:.2f}')
    else:
        if produto == 3:
            pagar = qtd * 1.85
            print(f'Você comprou {qtd} bananas. Total a pagar: {pagar:.2f}')
        else:
            print('Produto inexistente!')