# Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário,
# assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o preço a pagar,
# sabendo que o carro custa R$ 60 por dia e R$ 0,15 por km rodado

quilometros_percorridos = float(input(f'Escreva a quantidade de Km percorridos: ')) # 100
dias_alugados = int(input(f'Escreva a quantidade de dias que o carro foi alugado: ')) #3

preco_a_pagar = (60 * dias_alugados) + (0.15 * quilometros_percorridos) 
print(f'O valor a ser pago é de: {preco_a_pagar}') # 195.0