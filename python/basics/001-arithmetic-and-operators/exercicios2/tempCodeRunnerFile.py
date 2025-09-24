quilometros_percorridos = float(input(f'Escreva a quantidade de Km percorridos:'))
dias_alugados = int(input(f'Escreva a quantidade de dias que o carro foi alugado: '))

preco_a_pagar = (60 * dias_alugados) + (0.15 * quilometros_percorridos)
print(f'O preço a pagar é de: {preco_a_pagar}')