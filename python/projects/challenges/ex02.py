import tkinter as tk
from tkinter import messagebox

# --- Estrutura de Dados para Preços ---
PRECOS = {
    'CP': {'P': 9.00, 'M': 14.00, 'G': 18.00},
    'AC': {'P': 11.00, 'M': 16.00, 'G': 20.00}
}

NOMES_SABORES = {'CP': 'Cupuaçu', 'AC': 'Açai'}

# --- Variáveis Globais para o estado do pedido ---
pedidos = []
valor_total = 0.0

# --- Funções de Lógica do Pedido ---

def adicionar_pedido():
    global valor_total

    sabor_cod = sabor_var.get()
    tamanho = tamanho_var.get()
    sabor_nome = NOMES_SABORES[sabor_cod]

    # Calcula o valor do item selecionado
    valor_item = PRECOS[sabor_cod][tamanho]
    valor_total += valor_item

    # Verifica se o item já existe no pedido para agrupar
    pedido_existente = None
    for p in pedidos:
        if p['sabor'] == sabor_nome and p['tamanho'] == tamanho:
            pedido_existente = p
            break
    
    if pedido_existente:
        pedido_existente['quantidade'] += 1
    else:
        pedidos.append({'sabor': sabor_nome, 'tamanho': tamanho, 'quantidade': 1})
    
    atualizar_resumo_pedido()

def remover_item():
    global valor_total

    # Pega o índice do item selecionado na Listbox
    indices_selecionados = lista_pedidos_box.curselection()
    if not indices_selecionados:
        messagebox.showwarning("Nenhum item selecionado", "Por favor, selecione um item da lista para remover.")
        return
    
    indice_selecionado = indices_selecionados[0]

    # Acessa o dicionário do item a ser removido
    item_a_remover = pedidos[indice_selecionado]
    sabor_nome = item_a_remover['sabor']
    tamanho = item_a_remover['tamanho']

    # Encontra o código do sabor para buscar o preço (
    sabor_cod = [cod for cod, nome in NOMES_SABORES.items() if nome == sabor_nome][0]
    
    # Subtrai o valor do item do total
    valor_item = PRECOS[sabor_cod][tamanho]
    valor_total -= valor_item

    # Diminui a quantidade ou remove o item da lista se a quantidade for zero
    item_a_remover['quantidade'] -= 1
    if item_a_remover['quantidade'] == 0:
        pedidos.pop(indice_selecionado)

    atualizar_resumo_pedido()

def atualizar_resumo_pedido():
    # Limpa a lista de pedidos na tela
    lista_pedidos_box.delete(0, tk.END)
    
    # Adiciona os itens atualizados
    for p in pedidos:
        lista_pedidos_box.insert(tk.END, f"{p['quantidade']}x {p['sabor']} ({p['tamanho']})")
    
    # Atualiza o label do valor total
    label_valor_total.config(text=f"Valor Total: R$ {valor_total:.2f}")

def finalizar_pedido():
    if not pedidos:
        messagebox.showwarning("Pedido Vazio", "Nenhum item foi adicionado ao pedido.")
        return

    resumo = "Resumo do Pedido:\n\n"
    for p in pedidos:
        resumo += f"{p['quantidade']}x {p['sabor']} ({p['tamanho']})\n"
    
    resumo += f"\nValor Total: R$ {valor_total:.2f}"

    messagebox.showinfo("Pedido Finalizado", resumo)
    root.destroy() # Fecha a janela

# --- Configuração da Janela Principal (GUI) ---
root = tk.Tk()
root.title("Loja de Gelados da Emelly Beatriz")
root.geometry("500x550")

# --- Widgets da Interface ---

# Mensagem de boas-vindas
tk.Label(root, text="Bem-vindo(a) à Loja de Gelados da Emelly Beatriz Pereira!", font=("Arial", 14, "bold")).pack(pady=10)

# Cardápio (usando um Label com fonte monoespaçada para alinhar)
cardapio_texto = """
=================+ Cardápio +==================
--------------------------------------------------
---| Tamanhos | Cupuaçu (CP) |   Açai (AC)   |---
---|    P     |   R$  9.00   |   R$ 11.00  |---
---|    M     |   R$ 14.00   |   R$ 16.00  |---
---|    G     |   R$ 18.00   |   R$ 20.00  |---
--------------------------------------------------
"""
tk.Label(root, text=cardapio_texto, font=("Courier", 10), justify=tk.LEFT).pack(pady=5)

# Frame para as opções
frame_opcoes = tk.Frame(root)
frame_opcoes.pack(pady=10)

# Variáveis para os Radiobuttons
sabor_var = tk.StringVar(value="AC") 
tamanho_var = tk.StringVar(value="P")

# Opções de Sabor
tk.Label(frame_opcoes, text="Sabor:", font=("Arial", 12, "bold")).grid(row=0, column=0, padx=10, sticky="w")
tk.Radiobutton(frame_opcoes, text="Açai (AC)", variable=sabor_var, value="AC", font=("Arial", 11)).grid(row=1, column=0, sticky="w")
tk.Radiobutton(frame_opcoes, text="Cupuaçu (CP)", variable=sabor_var, value="CP", font=("Arial", 11)).grid(row=2, column=0, sticky="w")

# Opções de Tamanho
tk.Label(frame_opcoes, text="Tamanho:", font=("Arial", 12, "bold")).grid(row=0, column=1, padx=20, sticky="w")
tk.Radiobutton(frame_opcoes, text="Pequeno (P)", variable=tamanho_var, value="P", font=("Arial", 11)).grid(row=1, column=1, sticky="w")
tk.Radiobutton(frame_opcoes, text="Médio (M)", variable=tamanho_var, value="M", font=("Arial", 11)).grid(row=2, column=1, sticky="w")
tk.Radiobutton(frame_opcoes, text="Grande (G)", variable=tamanho_var, value="G", font=("Arial", 11)).grid(row=3, column=1, sticky="w")

# Botão para adicionar item
tk.Button(root, text="Adicionar ao Pedido", command=adicionar_pedido, font=("Arial", 12, "bold"), bg="lightblue").pack(pady=10)

# --- Resumo do Pedido em Tempo Real ---
tk.Label(root, text="Itens do Pedido:", font=("Arial", 12, "bold")).pack()

lista_pedidos_box = tk.Listbox(root, height=5, width=40, font=("Arial", 11))
lista_pedidos_box.pack(pady=5)

tk.Button(root, text="Remover Item Selecionado", command=remover_item, font=("Arial", 12), bg="lightcoral").pack(pady=(0, 10))

label_valor_total = tk.Label(root, text="Valor Total: R$ 0.00", font=("Arial", 12, "bold"))
label_valor_total.pack(pady=10)

# Botão para finalizar
tk.Button(root, text="Finalizar Pedido", command=finalizar_pedido, font=("Arial", 12, "bold"), bg="lightgreen").pack(pady=20)

# --- Iniciar o Loop da Interface Gráfica ---
root.mainloop()
