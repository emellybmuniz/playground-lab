# Desenvolva um algoritmo que solicite ao usuário o preço de um produto e um percentual de desconto a ser aplicado a ele.

# Calcule e exiba o valor do desconto e o preço final do produto

valor_produto = float(input('Digite o valor do produto: ')) # 80
percentual_desconto = int(input('Digite o percentual de desconto: ')) # 25

valor_desconto = valor_produto * (percentual_desconto / 100)
valor_final = valor_produto - valor_desconto

print(f'valor do produto {valor_produto}') # 80.0
print(f'valor do desconto: {float(valor_desconto)}') # 20.0
print(f'valor do produto com o desconto aplicado: {round(valor_final, 3)}') # 60.0


