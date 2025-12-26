"""
Exercício 2: 
    Crie um jogo de pedra, papel ou tesoura (Jokenpô).
    Você deverá jogar contra o computador.
    Você irá sempre escolher uma das opções: 
        1 — pedra, 
        2 — papel, 
        3 — tesoura
    O computador irá sempre sortear um número de 1 até 3 para jogar
    Armazene todos os resultados em uma lista e, no final, apresente o vencedor
    Encerre o programa ao digitar zero
"""
import random

def display_menu():
    try:
        print('1 - Pedra')
        print('2 - Papel')
        print('3 - Tesoura')
        print('4 - Sair.')
        choice = int(input('\nPor favor, escolha uma das Opções: '))
        print()
        return choice 
    except ValueError:
        print('')
    

def jokenpo_logic(computer_choice, player_choice): 
    options = {1: 'Pedra', 2: 'Papel', 3: 'Tesoura'}
    if computer_choice == player_choice:
        print(f'Empate!\n')
        return 'Empate'
    
    elif (player_choice == 1 and computer_choice == 3) or (player_choice == 3 and computer_choice == 2) or (player_choice == 2 and computer_choice == 1):
        print(f'O jogador ganhou!\nEscolha do jogador: {options[player_choice]},\nEscolha da máquina: {options[computer_choice]}\n')
        return 'Vitória'
    
    else:
        print(f'A máquina ganhou!\nEscolha do jogador: {options[player_choice]},\nEscolha da máquina: {options[computer_choice]}\n')
        return 'Derrota'


print('Bem vindo ao Jokenpô!\n')
quit_option = 4
matches = []
while True:
    player_choice = display_menu()  
    if player_choice == quit_option:
        break
    elif player_choice in [1, 2, 3]:
        round_result = jokenpo_logic(random.choice([1, 2, 3]), player_choice)
        matches.append(round_result)
    else:
        print('Entrada Inválida!')
        continue

for i, result in enumerate(matches):
    matches[i] = f'Partida {i+1}: {result}'
    
print(matches)

        