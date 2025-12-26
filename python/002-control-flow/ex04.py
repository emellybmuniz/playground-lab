#phrase = ''

#while phrase != 'Sair':
#    phrase = input('Insira uma frase ou palavra. Digite "Sair" para encerrar o programa: ')
#    if not 'Sair':
#        print(phrase)
    
#print('Programa Finalizado!')

# Jeito do professor
print('Digite uma mensagem que eu irei repetir para você')
print('Digite sair para encerrar o programa')

while True:
    msg = input()
    print(msg)
    if msg == 'Sair':
        break
    
print('Finalizando o Programa!')