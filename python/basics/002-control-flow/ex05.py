# nome: Emelly
# senha: 1234

while True: 
    name = input('Digite seu nome: ') # Emelly
    if name != "Emelly":
        print('Usuário não encontrado!') 
        continue
    
    password = int(input('Digite sua senha: ')) # 1234
    
    if password != 1234:
        print('Senha incorreta!')
        continue
    print(f'Bem vinda de volta {name}!') # Bem vinda de volta Emelly!
    break