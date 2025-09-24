# Equilátero: todos os lados são iguais e todos os ângulos são iguais (60°).
# Isósceles: dois lados são iguais e dois ângulos são iguais.
# Escaleno: todos os lados são diferentes e todos os ângulos são diferentes.
# Triângulo válido: A soma de dois lados é maior que o terceiro lado.

lado1 = int(input('Digite o primeiro lado: '))
lado2 = int(input('Digite o segundo lado: '))
lado3 = int(input('Digite o terceiro lado: '))

triangulo_valido = lado1 + lado2 > lado3 and lado3 + lado1 > lado2 and lado2 + lado3 > lado1

if triangulo_valido == True:
    if lado1 == lado2 == lado3:
        print('O triângulo é equilátero')
    elif lado1 == lado2 or lado2 == lado3 or lado1 == lado3:
        print('Esse triângulo é Isósceles')
    elif lado1 != lado2 != lado3:
        print('Triângulo Escaleno')
else: 
    print('Triângulo Inválido!')