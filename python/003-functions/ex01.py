
def msg(text):
    print('+' + '-' * len(text) + '+')
    print(f'|{text}|')
    print('+' + '-' * len(text) + '+')

msg('')

 
def gastos_pessoais():
    saldo = 1000
    despesa = 200
    saldo -= despesa
    print(saldo)

def gastos_profissionais():
    saldo = 500
    despesa = 100
    saldo -= despesa
    print(saldo)

gastos_pessoais()  # 800
gastos_profissionais()  # 400


