import random
import os


script_dir = os.path.dirname(os.path.abspath(__file__))
words_file_path = os.path.join(script_dir, 'words.txt')
score_file_path = os.path.join(script_dir, 'score.txt')

# Função para exibir o menu
def menu():
    print('=== MENU ===')
    print('1. JOGAR')
    print('2. SCORE')
    print('3. SAIR\n')
    
    user_choice = int(input('Escolha uma das opções acima: '))
    match user_choice:
        case 1:
            play()
        case 2: 
            mostrar_score()
        case 3:
            print('Encerrando o programa...')
            exit()

# Função para mostrar o score
def mostrar_score():
    try:
        with open(score_file_path, 'r') as show_score:
            print("Scores:")
            for linha in show_score:
                print(linha.strip())  # Imprime cada linha removendo espaços em branco
    except FileNotFoundError:
        print("Ainda não há pontuações registradas.")

words_list = [] 
try:
    with open(words_file_path, 'r') as words:
        words_list = [linha.strip() for linha in words.readlines()]
except FileNotFoundError:
    print(f"ERRO: O arquivo de palavras '{os.path.basename(words_file_path)}' não foi encontrado.")
    print("Certifique-se de que ele está na mesma pasta do jogo.")

def aleatorizar_palavra():
    if words_list:
        return random.choice(words_list)
    return None

rounds = []
name = input('Como devo chamá-lo(a)? ')

def score(situacao):
    if situacao in ['derrota', 'vitoria']: 
        rounds.append({'Nome': name, 'Situação': situacao})
        with open(score_file_path, 'a') as score_partida:  
            score_partida.write(f"{name}: {situacao}\n")

# Função principal do jogo
def play():
    tentativa = 10 
    letras_usadas = []

    palavra_aleatoria = aleatorizar_palavra()
    if not palavra_aleatoria:
        print("\nNão há palavras no arquivo para jogar. Encerrando o jogo.")
        return

    random_word_ref = palavra_aleatoria.lower()
    random_word_ref_list = list(random_word_ref)
    palavra_escondida = ['_'] * len(random_word_ref)
    print(f'A palavra tem {len(random_word_ref)} letras')

    while tentativa > 0:
        letter_input = input('Teste uma letra: ').lower()
        
        if letter_input in letras_usadas:
            print("\nVocê já tentou essa letra.")
            continue
        
        letras_usadas.append(letter_input)
        
        if letter_input not in random_word_ref:
            print(f'\n-1 tentativa, você tem {tentativa} restantes.')
            print(f"\nLetras tentadas: {letras_usadas}")
            tentativa -= 1
            if tentativa == 0:
                score('derrota')
                print("Fim de jogo! Você perdeu.")
                print(f'\nA palavra era {random_word_ref}')
        else:
            print("Você adivinhou uma letra correta!")
            for index, letra in enumerate(random_word_ref_list):
                if letra == letter_input:
                    palavra_escondida[index] = letra 
            
            print(' '.join(palavra_escondida)) 
            print(f"\nLetras tentadas: {letras_usadas}")

            if '_' not in palavra_escondida:  
                score('vitoria')
                print("Parabéns! Você adivinhou a palavra!")
                break

if __name__ == "__main__":
    print(f'Bem-vindo(a) {name} ao jogo da forca!')
    while True:
        menu()