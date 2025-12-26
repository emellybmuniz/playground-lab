
    
    # Demonstração de lista referenciada alterando a lista original
lista_original = [5, 7, 9, 11]
lista_referenciada = lista_original  # Ambas as variáveis apontam para a mesma lista

print("Lista Original:", lista_original)
print("Lista Referenciada:", lista_referenciada)

# Lista Original: [5, 7, 9, 11]
# Lista Referenciada: [5, 7, 9, 11]

# Alterando a lista referenciada
lista_referenciada[0] = 2

print("\nApós alteração:")
print("Lista Original:", lista_original)
print("Lista Referenciada:", lista_referenciada)

# Após alteração:
# Lista Original: [2, 7, 9, 11]
# Lista Referenciada: [2, 7, 9, 11]

mochila = []  
mochila.append('Ovos')  


1 
2 
3 
4 
5 
6 
7 
8 
mercado = []
for i in range(3): 
    nome = input( 'Digite o nome do item: ') 
    qtd = int(input('Digite a quantidade: '))
    Valor = int(input('Digite o valor: '))
    mercado .append( [nome, qtd, valor]) 
print (mercado) 

