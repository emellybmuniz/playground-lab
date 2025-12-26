def checagem_tipo(dado):
    match dado:
        case str(dado):
            print("String:", dado)
        case int(dado):
            print("Inteiro:", dado)
        case float(dado):
            print("Float:", dado)
        case _:
            print("Tipo desconhecido de dado.")

dados = ['Python', 42, 3.14, 23, 'C']

for dado in dados:
    checagem_tipo(dado)
