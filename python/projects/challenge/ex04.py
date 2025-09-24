# Mensagem de Boas-Vindas
print('\nBem vindo(a) a Livraria da Emelly Beatriz')

# Inicializando lista e variável
lista_livro = []
id_global = 0

def cadastrar_livro():
    '''
    Cadastra um novo livro no sistema, atribuindo um ID exclusivo
    '''
    global id_global
    print('\n+======== CADASTRAR LIVRO ========+ ')
    print(f'ID do livro: {id_global + 1}')
    nome_livro = input('Insira o nome do livro: ')
    autor = input('Insira o nome do autor: ')
    editora = input('Insira o nome da editora: ')
    
    livro_existente = False
    
    # Verificando se o livro já existe
    for livro in lista_livro:
        if livro['Nome'] == nome_livro and livro['Autor'] == autor and livro['Editora'] == editora:
            livro_existente = True
            break
    
    if livro_existente:
        print('Erro! O livro já existe.')
    else:
        
        id_global += 1 
        livro_atributo = {'ID': id_global, 'Nome': nome_livro, 'Autor': autor, 'Editora': editora}
        lista_livro.append(livro_atributo)
        print('Livro cadastrado com sucesso!')

def exibindo_livro(livro):
    '''
    Exibe os detalhes de um livro em formato personalizado.
    '''
    print(f"id: {livro['ID']}")
    print(f"nome: {livro['Nome']}")
    print(f"autor: {livro['Autor']}")
    print(f"editora: {livro['Editora']}\n")
    
def consultar_livro():
    '''
    Permite consultar livros por diferentes critérios (escolhidos pelo usuário):
    - Listar todos 
    - Consultar por ID
    - Consultar por Autor
    '''
    print('\n+========= CONSULTAR LIVRO ========= ')
    print('1. Listar todos os livros')
    print('2. Consultar livros por ID')
    print('3. Consultar livro(s) por Autor')
    print('4. Retornar')
    
    input_usuario = input('>> ')
    print('==============')
    
    match(input_usuario):
        case '1':
            # Verificando se existem livros cadastrados
            if not lista_livro:
                print('Nenhum livro cadastrado.')
            else:
                for livro in lista_livro:
                    exibindo_livro(livro)
        case '2':  
            id_consulta = int(input('Insira o ID do livro: '))
            # Verificando se o ID existe
            livro_encontrado = False 
            for livro in lista_livro:
                if livro['ID'] == id_consulta:
                    print('Livro encontrado!')
                    exibindo_livro(livro)
                    livro_encontrado = True
                    break
            
            if not livro_encontrado:
                print('Livro não encontrado!')         
                   
        case '3':
            # Verificando se o autor existe
            autor_consulta = input('Insira o nome do autor: ')
            livros_autor = [livro for livro in lista_livro if livro['Autor'] == autor_consulta]
            if livros_autor:
                for livro in livros_autor:
                    exibindo_livro(livro)
            else:
                print('Nenhum livro encontrado para este autor.')
        case '4':
            return
        case _:
            print('Opção Inválida!')    

def remover_livro():
    '''
    Remove um livro da lista com base no ID fornecido
    '''
    try:
        id_exclusao = int(input('Insira o ID do livro que deseja excluir: '))
        livro_existente = False
        
        # Verificando se o livro existe antes de tentar remover
        for livro in lista_livro:
            if livro['ID'] == id_exclusao:
                livro_existente = True
                lista_livro.remove(livro)  
                print('Livro removido com sucesso!')
                break  
        
        if not livro_existente:
            print('O livro não existe!')
    except ValueError:
        print('ID inválido! Por favor, insira um número.')

# Exibindo Menu principal e validando entradas
while True:
    print('\n+============= MENU =============+')
    print('| Escolha a opção desejada:      |')
    print('| 1. Cadastrar livro             |')
    print('| 2. Consultar livros            |')
    print('| 3. Remover um livro            |')
    print('| 4. Encerrar programa           |')
    print('+--------------------------------+')
    
    try:
        input_usuario = int(input('>> '))
        
        match(input_usuario):
            case 1:
                cadastrar_livro()
            case 2:
                consultar_livro()
            case 3:
                remover_livro()
            case 4: 
                print('Encerrando o programa...')
                exit()
            case _:
                print('Opção Inválida! Tente novamente.')
    except ValueError:
        print('Por favor, insira um número válido.')