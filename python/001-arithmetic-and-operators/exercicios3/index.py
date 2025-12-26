from datetime import datetime

mes_nascimento = int(input(f'Insira o seu mês de nascimento: ')) # 10
ano_nascimento = int(input(f'Insira o seu ano de nascimento: ')) # 2005
ano_atual = int(datetime.now().year)
mes_atual = int(datetime.now().month)

if mes_atual < mes_nascimento: idade = (ano_atual - ano_nascimento) - 1
else: idade = ano_atual - ano_nascimento


if idade >= 18: print(f'idade: {idade}. Você já pode dirigir!') 
else: print('Você ainda não pode dirigir')

# idade: 19. Você já pode dirigir!