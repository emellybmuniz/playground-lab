# Leia dois valores e uma operação (+, -, *, /) e exiba o resultado da operação escolhida usando elif.

try:
    num1 = float(input('Digite um número: ')) # 15
    num2 = float(input('Digite o segundo número: ')) # 5
    operator = input('Digite um Operador (+, -, /, *): ') # /
    
    if operator == '+':
        result = num1 + num2
    elif operator == '-':
        result = num1 - num2
    elif operator == '/' or ':':
        result = num1 / num2
    elif operator == '*' or 'x':
        result = num1 * num2
    else:
        print('Operador Inválido')
        
except ValueError:
    print('Entrada Inválida')
    
print(round(result)) # 3


