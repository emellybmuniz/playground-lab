#tuplas

words = ('Casa', 'Amigo', 'Avogo', 'Maçã', 'Espanha', 'Amora', 'Alemanha', 'Aurora', 'Alegria', 'Harmonia')
vogals = []       
for word in words:
    print(f'\n Palavra: {word} \n Vogais:', end=' ')
    for l in word:
       if l.lower() in 'aeiou':
            print(l.lower(), end=' ')
    print()
    
#      Palavra: Casa
#  Vogais: a a

#  Palavra: Amigo
#  Vogais: a i o

#  Palavra: Avogo
#  Vogais: a o o

#  Palavra: Maçã
#  Vogais: a

#  Palavra: Espanha
#  Vogais: e a a

#  Palavra: Amora
#  Vogais: a o a

#  Palavra: Alemanha
#  Vogais: a e a a

#  Palavra: Aurora
#  Vogais: a u o a

#  Palavra: Alegria
#  Vogais: a e i a

#  Palavra: Harmonia
#  Vogais: a o i a


        

