print('Bem-vindo à nossa lanchonete! \n Cardápo Virtual: \n')
tot = 0

while True:
    print('1. Coxinha - R$ 5,00')
    print('2. Pastel - R$ 7,00')
    print('3. Café - R$ 4,00')
    print('4. Suco - R$ 6,00')
    print('5. Sair\n')
    
    try:
        user_answer = int(input('Escolha uma das opções acima: '))
    except ValueError:
        print('Entrada inválida. Certifique-se de digitar números.')
        break
   
    if user_answer == 1:
        try:
            qnt = int(input('Digite a quantidade desejada: '))
        except ValueError:
            print('Quantidade inválida. Tente inserir números inteiros.')
            break
            
        tot += qnt * 5.00
        print(f'Subtotal: R${tot:.2f}')
        continue
            
    elif user_answer == 2:
        try:
            qnt = int(input('Digite a quantidade desejada: '))
        except ValueError:
            print('Quantidade inválida. Tente inserir números inteiros.')
            break
            
        tot += qnt * 7.00
        print(f'Subtotal: R${tot:.2f}')
        continue

            
    elif user_answer == 3:
        try:
            qnt = int(input('Digite a quantidade desejada: '))
        except ValueError:
            print('Quantidade inválida. Tente inserir números inteiros.')
            break
            
        tot += qnt * 4.00
        print(f'Subtotal: R${tot:.2f}')
        continue
            
    elif user_answer == 4:
        try:
            qnt = int(input('Digite a quantidade desejada: '))
        except ValueError:
            print('Quantidade inválida. Tente inserir números inteiros.')
            break
            
        tot += qnt * 6.00
        print(f'Subtotal: R${tot:.2f}')
        continue
        
    elif user_answer == 5:
        break
    
    else:
        print('Entrada inválida. Tente inserir os números do menu.')
        break

if tot != 0:
    print(f'\nO total do seu pedido é de R${tot:.2f}.')
