# a) Se idade é maior que 60, escreva: "Você tem direitos aos benefícios"
# b) Se dano é maior que 10 e escudo é igual a O, escreva: "Você está morto!" 
# c) Se pelo menos uma das variáveis booleanas norte, sul, leste e oeste resultarem em True, escreva: "Você escapou!"


idade = 60
if idade > 60:
    print('Você tem direito aos benefícios') # (não exibe nada)
    
dano = 80
escudo = 0
if dano > 10 and escudo == 0:
    print('Você está morto!') # Você está morto!
    
norte = True
sul = False
leste = False
oeste = True
if norte or sul or leste or oeste == True:
    print('Você escapou!') # Você escapou