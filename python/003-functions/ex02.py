
def validate_password(string, min, max):
    result = input(string)
    len_string = len(result)
    
    while (min > len_string) or (len_string > max):
        print(f'Senha inválida. Tente usar uma senha entre {min} e {max} caracteres')
        result = input(string)
        len_string = len(result)
    
    return result

call_validate_password = validate_password('Digite uma senha: ', 10, 30)
print('Você digitou a senha {}. Encerrando o programa...'.format(call_validate_password))


