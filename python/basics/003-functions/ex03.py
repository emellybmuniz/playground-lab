try:
   print('Emelly'[6]) 
except IndexError:
    print('Index inválido')
except: # Tratamento genérico que comtempla todas as possíveis exceções
    print("Algo inesperado ocorreu. Por favor, tente novamente!")

# Saída: Index inválido