def menu():
    print('\n' + '+' + '=' * 25 + '+')
    print('|' + ' ' * 11 + 'MENU' + ' ' * 10 + '|')
    print('|' + '-' * 25 + '|')
    print('| 1 - ' + 'Cadastrar novo item'.ljust(20) + '|')
    print('| 2 - ' + 'Listar Cadastros'.ljust(20) + '|')
    print('| 3 - ' + 'Sair'.ljust(20) + '|')
    print('+' + '=' * 25 + '+\n')


def validador_msg(msg):
    """Valida entrada de texto, exigindo que o campo não seja vazio."""
    while True:
        entrada = input(msg).strip()
        if entrada == '':
            print('Campo Obrigatório!')
        else:
            return entrada


def existe_arquivo(nome_arquivo):
    try:
        arquivo = open(nome_arquivo, 'rt') # lendo arquivo, se ele existir retorna true
        arquivo.close() # liberando o arquivo para poder ser usado por outros programas
        return True
    except FileNotFoundError:
        return False # caso o arquivo não exista retorna falso


def criar_arquivo(nome_arquivo):
    try:
        arquivo = open(nome_arquivo, 'wt+') # arquivo aberto para manipulação
        arquivo.close()
    except:
        print('Erro na criação do arquivo!')
        return False
    else:
        print(f'Arquivo {nome_arquivo} criado com sucesso!\n')
        return True


def cadastro_de_jogo(nome_arquivo, jogo, videogame):
    """
    Registra os dados do jogo no arquivo.
    """
    try:
        arquivo = open(nome_arquivo, 'a')
        arquivo.write(f'{jogo};{videogame}\n')
        arquivo.close()
        print('Cadastro realizado com sucesso!')
    except:
        print('Erro ao cadastrar o jogo!')


def iniciar_cadastro():
    arquivo = 'game.txt'
    # Verifica se o arquivo existe, caso contrário cria um novo
    if existe_arquivo(arquivo):
        print('Arquivo localizado no computador.')
    else:
        print('Arquivo de registro Inexistente. Criando um novo...')
        criar_arquivo(arquivo)

    jogo = validador_msg('\nPor favor, insira o nome do jogo: ')
    videogame = validador_msg('Qual video-game ele pertence: ')
    cadastro_de_jogo(arquivo, jogo, videogame)


def listar_cadastro(nome_arquivo):
    try:
        arquivo = open(nome_arquivo, 'rt')
        print("\nJogos Cadastrados:")
        print("=" * 40)
        for linha in arquivo:
            # formato: jogo;videogame
            dados = linha.strip().split(';')
            if len(dados) >= 2:
                jogo = dados[0]
                videogame = dados[1]
                print("Jogo: {} | Video-game: {}".format(jogo, videogame))
            else:
                print(linha.strip())
        print("=" * 40)
        arquivo.close()
    except FileNotFoundError:
        print("Arquivo '{}' não encontrado. Cadastre algum jogo primeiro!".format(nome_arquivo))


def main():
    arquivo = 'game.txt'
    while True:
        try:
            menu()
            resposta = int(input('Escolha uma das opções acima: '))
            if resposta == 1:
                print('Bem vindo ao Cadastro de jogos :) \n')
                iniciar_cadastro()
                break
            elif resposta == 2:
                listar_cadastro(arquivo)
                break
            elif resposta == 3:
                print('Encerrando o Programa...')
                break
            else:
                print('Escolha inválida. Por favor, tente novamente.')
        except ValueError:
            print('Entrada inválida! Digite um número correspondente à opção.')


if __name__ == '__main__':
    main()
