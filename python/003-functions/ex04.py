#calc = lambda x, y: (x + 5) * y
#print(calc(5,2)) # 20

#print('Olá mundo', end=' :) ',) #padrão: end=\n
#print('Mesma linha', 'Outro argumento', sep=' - ')


#help(print)


def sum(x=0, y=0, z=0):
    '''
Retorna o somatório de até 3 valores numéricos quaisquer. 
Todos os parâmetros são opcionais
    '''
    return x+y+z 

print(sum(3,2)) # 5
help(sum)

# Help on function sum in module __main__:

# sum(x=0, y=0, z=0)
# Retorna o somatório de até 3 valores numéricos quaisquer. 
# Todos os parâmetros são opcionais