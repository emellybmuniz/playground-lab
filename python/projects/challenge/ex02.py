# Mensagem de boas vindas com meu nome e sobrenome
print(f'\nBem-vindo(a) a Loja de Gelados da Emelly Beatriz Pereira!')
print('=' *19 + '+ Cardápio +' + '=' *20)
print('-' *51)
print('===|  Tamanhos  |  Cupuaçu (CP)  |  Açai (AC)  |===')
print('===|     P      |    R$  9.00    |  R$ 11.00   |===')
print('===|     M      |    R$ 14.00    |  R$ 16.00   |===')
print('===|     G      |    R$ 18.00    |  R$ 20.00   |===')
print('-' *51)

# Inicializando variáveis, lista e contador
pedidos = []
valor_total = 0
contador_de_pedidos = 0
finalizar = 'NÃO'

# Loop de pedidos com while
while finalizar != 'SIM':
    try:
        # Rebendo / Validando sabor
        sabor = input('\nEscolha o sabor (AC/CP): ').lower()
        if sabor not in ['açai', 'capuaçu', 'ac', 'cp']:
            print('Sabor inválido! Tente novamente.')
            continue
        
        # Rebendo / Validando tamanho
        tamanho = input('Escolha o tamanho (P/M/G): ').upper()
        if tamanho not in ['P', 'M', 'G']:
            print('Tamanho inválido! Tente novamente.')
            continue

        # Estrutura aninhada para definir o preço
        if tamanho == 'P':
            if sabor == 'capuaçu' or sabor == 'cp':
                sabor = 'Capuaçu'
                valor = 9.00
            else:
                sabor == 'açai' or sabor == 'ac'
                sabor = 'Açai'
                valor = 11.00
        else:
            if tamanho == 'M':
                if sabor == 'capuaçu' or sabor == 'cp':
                    sabor = 'Capuaçu'
                    valor = 14.00
                else:
                    if sabor == 'açai' or sabor == 'ac':
                        valor = 16.00        
            else:  # tamanho == 'G'
                if sabor == 'capuaçu' or sabor == 'cp':
                    sabor = 'Capuaçu'
                    valor = 18.00
                else:
                    if sabor == 'açai' or sabor == 'ac':
                        sabor = 'Açai'
                        valor = 20.00

        print(f'Você pediu um {sabor} no tamanho {tamanho}: R$ {valor:.2f}')
        
        # Atualizando o valor total
        valor_total += valor
        contador_de_pedidos += 1

        # Verificando se o pedido já existe
        pedido_existente = None
        for pedido in pedidos:
            if pedido['Sabor'] == sabor and pedido['Tamanho'] == tamanho:
                pedido_existente = pedido  
                break  
        if pedido_existente:
            pedido_existente['Quantidade'] += 1
        else:
            pedidos.append({'Sabor': sabor, 'Tamanho': tamanho, 'Quantidade': 1})

        # Finalizando loop
        finalizar = input('\nDeseja finalizar o pedido? (SIM/NÃO) ').upper()

    except ValueError:
        print('Entrada inválida! Certifique-se de digitar apenas letras.')

# Exibindo o resumo do pedido
print('\nPedido Finalizado!')
print('\nRESUMO DO PEDIDO:')
for pedido in pedidos:
    print(f"{pedido['Quantidade']}x {pedido['Sabor'].capitalize()} ({pedido['Tamanho']})")
print(f'\nO valor total do seu pedido é de: R$ {valor_total:.2f}')
