# e) 2 elevado à 10 potência
numero_elevado = 2 ** 10
print(numero_elevado) # 1024

# f) O valor absoluto da diferença entre 54 e 57

#com gambiarra
valor_absoluto = 57 - 54
total_string = str(valor_absoluto)
substituir_negativo = total_string.replace('-', '')
substituir_negativo = int(substituir_negativo)
resultado = substituir_negativo
print(resultado) # 3

#com a função abs()
print(abs(57-54))


# g) O menor valor entre 34, 29 e 31
menor_valor = [34, 29, 31]
resultado = min(menor_valor)
print(resultado) # 29
