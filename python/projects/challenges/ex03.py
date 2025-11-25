# Mensagem de Boas-Vindas
print('\nBem vindo(a) a Copiadora da Emelly Beatriz Pereira')
nome_usuario = input('Para começar, digite o seu nome: ')  
print(f'\nOlá {nome_usuario}! Entre com o tipo de serviço desejado.')

def menu_serviços():
    '''
    Lista os serviços disponíveis na copiadora, exibindo os códigos de identificação, suas descrições e preços unitários
    '''
    print('DIG - Digitalização - R$ 1.10')
    print('ICO - Impressão Colorida - R$ 1.00')
    print('IPB - Impressão Preto e Branco - R$ 0.40')
    print('FOT - Fotocópia - R$ 0.20 ')


def servico_extra():
    '''
    Oferece serviços adicionais ou permite finalizar sem extras. 
    Valida a entrada do usuário e retorna o valor adicional
    '''
    print('\nDeseja adicionar algum serviço? ')
    print('1 - Encadernação Simples - R$ 15.00')
    print('2 - Encadernação Capa Dura - R$ 40.00')
    print('3 - Não desejo mais nada')
    adicional_escolhido = int(input('>> '))
    while True:
        try: # validando o serviço extra escolhido
            match(adicional_escolhido):
                case 1:
                    print('Encadernação Simples escolhida: R$ 15.00')
                    valor_adicional = 15.00
                case 2:
                    print('Encadernação Capa Dura escolhida: R$ 40.00')
                    valor_adicional = 40.00
                case 3:
                    valor_adicional = 0
                    break    
                case _:
                    print('Opção Inválida! Por favor, tente novamente.')
                    continue
        except ValueError:
            print('Opção Inválida! Por favor, tente novamente.')
            continue
        return valor_adicional
    

def num_paginas():
    '''
    Solicita e valida o número de páginas para o serviço, no range de 1 e 2000. 
    Calcula o desconto com base na quantidade
    '''
    max_paginas = 2000
    min_paginas =  1
    desconto = 0
    
    # Validação do número de páginas
    numero_paginas = int(input('Entre com o número de páginas: '))     
    while min_paginas < numero_paginas > max_paginas:
        print('Não aceitamos tantas páginas de uma vez. \nPor favor, tente novamente. ')
        numero_paginas = 0
        numero_paginas = int(input('\nEntre com o número de páginas: '))  
        
        if numero_paginas <  20:
            desconto = 0
        elif  20 <= numero_paginas < 200:
            desconto = 0.15
        elif  200 <= numero_paginas < 2000:
            desconto = 0.20
        elif 2000 <= numero_paginas > max_paginas:
            desconto = 0.25
        
    return numero_paginas, desconto 

def escolha_serviço():
    '''
    Exibe o menu de serviços via menu_serviços() e valida a escolha do usuário. 
    Retorna o valor unitário do serviço selecionado
    '''
    while True:
        menu_serviços()
        servico_escolhido = input('>> ').upper()
        
        match(servico_escolhido):
            case 'DIG':
                valor_servico = 1.10
            case 'ICO':
                valor_servico = 1.00
            case 'IPB':
                valor_servico = 0.40
            case 'FOT':
                valor_servico = 0.20
            case _:
                print('\nEscolha Inválida, entre com o tipo de serviço novamente.')
                continue
        
        return valor_servico
                
# Chamando funções
valor_servico = escolha_serviço()
num_paginas_escolhidas, desconto = num_paginas()
valor_extra = servico_extra()

# Calculando total e aplicando desconto
custo_servico = valor_servico * num_paginas_escolhidas
total_sem_desconto = custo_servico + valor_extra
valor_desconto = custo_servico * desconto  # Descontando  apenas no custo do serviço
paginas_descontadas = num_paginas_escolhidas - (num_paginas_escolhidas * desconto)

total = total_sem_desconto - valor_desconto  # Total final com desconto aplicado
print(f'Total a pagar: R$ {total:.2f} (Serviço: R$ {valor_servico:.2f} * Páginas: {round(paginas_descontadas)} + Extra: R$ {valor_extra:.2f})')