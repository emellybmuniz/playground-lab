import tkinter as tk
from tkinter import messagebox

def calcular_desconto():
    """
    Esta função é chamada quando o botão 'Calcular' é pressionado.
    Ela lê os valores de entrada, calcula o total e o desconto,
    e exibe o resultado na interface.
    """
    try:
        # 1. Receber os valores dos campos de entrada
        valor_unit = float(entry_valor_unit.get())
        qnt_produto = int(entry_qnt_produto.get())

        # 2. Calcular o valor total (lógica corrigida para quantidade 0)
        valor_total = valor_unit * qnt_produto

        # 3. Implementar a lógica de desconto
        if valor_total >= 10000:
            desconto = 11
        elif 6000 <= valor_total < 10000:
            desconto = 7
        elif 2500 <= valor_total < 6000:
            desconto = 4
        else:
            desconto = 0

        # 4. Calcular o valor final com desconto
        valor_com_desconto = valor_total * (1 - desconto / 100)

        # 5. Montar a mensagem de resultado
        resultado = f'Valor total sem desconto: R$ {valor_total:.2f}\n'
        if desconto > 0:
            resultado += f'Desconto aplicado: {desconto}%\n'
            resultado += f'Valor final com desconto: R$ {valor_com_desconto:.2f}'
        else:
            resultado += 'Nenhum desconto foi aplicado.'

        # 6. Atualizar o label de resultado
        label_resultado.config(text=resultado)

    except ValueError:
        # Exibir uma mensagem de erro se a entrada for inválida
        messagebox.showerror("Erro de Entrada", "Por favor, insira valores numéricos válidos.")
        label_resultado.config(text="") # Limpa o resultado anterior

# --- Configuração da Interface Gráfica (GUI) ---

# 1. Criar a janela principal
janela = tk.Tk()
janela.title("Cálculo de Desconto - Loja da Emelly Beatriz Pereira")
janela.geometry("450x300")

# 2. Mensagem de boas-vindas
nome, sobrenome = 'Emelly Beatriz', 'Pereira'
label_boas_vindas = tk.Label(janela, text=f"Bem-vindo(a) à loja da {nome} {sobrenome}!", font=("Helvetica", 12, "bold"))
label_boas_vindas.pack(pady=10)

# 3. Frame para os campos de entrada
frame_inputs = tk.Frame(janela)
frame_inputs.pack(pady=10, padx=20)

tk.Label(frame_inputs, text="Valor Unitário do Produto:").grid(row=0, column=0, padx=5, pady=5, sticky="w")
entry_valor_unit = tk.Entry(frame_inputs)
entry_valor_unit.grid(row=0, column=1, padx=5, pady=5)

tk.Label(frame_inputs, text="Quantidade do Produto:").grid(row=1, column=0, padx=5, pady=5, sticky="w")
entry_qnt_produto = tk.Entry(frame_inputs)
entry_qnt_produto.grid(row=1, column=1, padx=5, pady=5)

# 4. Botão para calcular
botao_calcular = tk.Button(janela, text="Calcular Valor Final", command=calcular_desconto, font=("Helvetica", 10, "bold"))
botao_calcular.pack(pady=10)

# 5. Label para exibir o resultado
label_resultado = tk.Label(janela, text="", font=("Helvetica", 10), justify="left", wraplength=400)
label_resultado.pack(pady=10, padx=20)

# 6. Iniciar o loop principal da interface
janela.mainloop()
