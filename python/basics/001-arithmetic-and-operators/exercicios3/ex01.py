#Criar um algoritmo que verifique se um funcionário tem mais de 5 anos na empresa e aplique um bônus salarial diferente conforme o tempo de serviço.

from datetime import datetime

ano_contratado = int(input('Qual ano você entrou na empresa? '))
mes_contratado = int(input('Qual mês você entrou na empresa? '))
salario = float(input(f'Quanto você recebe? '))

data_atual = datetime.now()
data_contrato = datetime(ano_contratado, mes_contratado, 1)

anos_na_empresa = data_atual.year - data_contrato.year
if data_atual.month < data_contrato.month:
    anos_na_empresa -= 1

if anos_na_empresa <= 5:
    print('Pesquisa concluída. Continue o bom trabalho!')
if anos_na_empresa > 5:
    percentual_reajuste = salario * (15 / 100)
    salario_reajuste = salario + percentual_reajuste
    print('Parabéns, você recebeu um bônus salarial de 15%')
    print(f'Salário Anterior: {salario}')
    print(f'Salário com reajuste: {salario_reajuste}')
    
    
   
   