def factorial(number):
    """
    Calcula o fatorial de um número passado como parâmetro.
    
    Parâmetros:
    number (int): O número para o qual o fatorial será calculado.
    
    Retorna:
    int: O fatorial do número fornecido.
    """
    result = 1
    for i in range(1, number + 1):
        result *= i
    return result

def validate_number(message):
    """
    Valida se a entrada do usuário é um número inteiro e positivo.
    Se for válido, calcula e exibe o fatorial do número.
    
    Parâmetros:
    message (str): A mensagem exibida para solicitar a entrada do usuário.
    """
    while True:
        try:
            num = int(input(message))
            
            if num < 0:
                print('Entrada inválida. Insira números positivos.')
                continue
            elif num > 0:
                result = factorial(num)
                print(f"O fatorial de {num} é {result}")
            break
        except:
            print('Entrada inválida. Insira um número inteiro.')
            continue

# Rodando o programa:
validate_number('Digite um número: ')

#help(validate_number)
#help(factorial)
