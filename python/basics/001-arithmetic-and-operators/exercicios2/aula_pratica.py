# a) somatório dos 5 primeiros números inteiros e positivos
initial_numbers_sum = 1 + 2 + 3 + 4 + 5
print(initial_numbers_sum) # 15

# b) média entre 23, 19 e 31
values_list = [23, 19, 31]
average_value = sum(values_list) / len(values_list)
print(round(average_value, 2)) # 24.33

# c) Número de vezes que 73 cabe em 403
total_number = 403
divisor_number = 73
times_to_fit = total_number / divisor_number
print(round(times_to_fit, 1)) # 5.5

# d) A sobra quando 403 é dividido por 73
division_remainder = 403 % 73
print(int(division_remainder)) # 38