# Java Bank

![GitHub License](https://img.shields.io/github/license/emellybmuniz/TransactionControlPOO)
![GitHub language count](https://img.shields.io/github/languages/count/emellybmuniz/TransactionControlPOO)
![GitHub last commit](https://img.shields.io/github/last-commit/emellybmuniz/TransactionControlPOO)
![Project Status](https://img.shields.io/badge/Status%20-%20em%20desenvolvimento%20-%20%23EB3731 )
![GitHub Stars](https://img.shields.io/github/stars/emellybmuniz/TransactionControlPOO?style=social)

Sistema bancário em Java para controle de contas, carteiras e investimentos. Permite criar contas, realizar transferências, investir, consultar saldo e histórico de operações. Focado em boas práticas de POO, tratamento de exceções e arquitetura modular.
---
### 📋 Índice
- [Visão Geral do Projeto](#-visão-geral-do-projeto)
- [Estrutura de Diretórios](#-estrutura-de-diretórios)
- [Destaques & Funcionalidades](#-destaques--funcionalidades)
- [Tecnologias Utilizadas](#-tecnologias-utilizadas)
- [Pré-requisitos](#-pré-requisitos)
- [Instalação](#-instalação)
- [Como Usar](#-como-usar)
- [Validação e Tratamento de Erros](#-validação-e-tratamento-de-erros)
- [API/Funcionalidades Avançadas](#-apifuncionalidades-avançadas)
- [Contribuição](#-contribuição)
- [Licença](#-licença)
- [Autora](#-autora)
---
## 🚀 Visão Geral do Projeto
Sistema bancário orientado a objetos, com suporte a múltiplas carteiras, contas e investimentos. Demonstra encapsulamento, herança, polimorfismo, tratamento de exceções customizadas e persistência em memória. Público-alvo: estudantes e desenvolvedores interessados em arquitetura Java e POO.
## 📂 Estrutura de Diretórios
```bash
📦 java-bank/
├── src/
│   └── main/
│       └── java/
│           └── br/com/dio/
│               ├── Main.java                # Ponto de entrada do sistema
│               ├── exception/               # Exceções customizadas
│               ├── model/                   # Modelos de domínio (Conta, Carteira, Investimento)
│               └── repository/              # Repositórios de dados
├── build.gradle.kts                        # Configuração do Gradle
├── README.md                               # Documentação
└── ...
```
## ✨ Destaques & Funcionalidades
### 🎯 **Gestão de Contas e Carteiras**
- Criação, consulta e remoção de contas e carteiras
- Transferências entre contas
- Investimentos e auditoria de operações
- Benefícios: organização financeira, histórico detalhado
- Utiliza: Java, Gradle, POO
### 🎨 **Design/Interface**
- Estrutura modular e clara
- Código bem comentado e organizado
- Foco em usabilidade via linha de comando
### 📱 **Compatibilidade/Responsividade**
- Suporte multiplataforma (Windows, Linux, Mac)
- Projeto console, sem interface gráfica
### ✅ **Validação/Segurança**
- Validação de saldo, existência de contas/carteiras
- Tratamento de exceções customizadas
- Segurança básica via encapsulamento
### 🔄 **Experiência do Usuário**
- Mensagens claras de erro e sucesso
- Operações rápidas e intuitivas
## 🛠️ Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![Gradle](https://img.shields.io/badge/Gradle-%2302303A.svg?style=for-the-badge&logo=gradle&logoColor=white)
### Detalhes Técnicos:
- **Java**: Lógica principal, POO, exceções
- **Gradle**: Gerenciamento de dependências e build
## ⚙️ Pré-requisitos
**Ambiente de desenvolvimento:**
- Java 11+
- Gradle 7+
## 📦 Instalação
```bash
# 1. Clone este repositório
$ git clone https://github.com/emellybmuniz/java-bank.git
# 2. Navegue até o diretório do projeto
$ cd java-bank
# 3. Compile o projeto
$ gradlew build
# 4. Execute o sistema
$ gradlew run
```
## 💡 Como Usar
1. Execute o sistema via terminal
2. Siga o menu interativo para criar contas, carteiras e investimentos
3. Realize transferências e consulte saldos
4. Verifique o histórico de operações
### Exemplos de Uso:
```java
// Criação de conta
AccountWallet conta = new AccountWallet("Emelly", ...);
// Transferência
bankService.transfer(contaOrigem, contaDestino, valor);
```
## 🛡️ Validação e Tratamento de Erros
### Validações Implementadas:
- Existência de conta/carteira
- Saldo suficiente
- Investimento válido
### Tratamento de Erros:
- Exceções customizadas (ex: AccountNotFoundException, NoFundsEnoughException)
- Mensagens claras ao usuário
## 🔌 API/Funcionalidades Avançadas
### Métodos Disponíveis:
| Método | Descrição | Parâmetros |
|--------|-----------|------------|
| criarConta | Cria nova conta | nome, dados |
| transferir | Transfere entre contas | origem, destino, valor |
| investir | Realiza investimento | conta, valor |
| consultarSaldo | Consulta saldo | conta |
### Funcionalidades Especiais:
- Auditoria de operações financeiras
- Suporte a múltiplos tipos de carteira
## 🤝 Contribuição
Contribuições são sempre bem-vindas e **muito apreciadas!** Sinta-se à vontade para abrir uma _issue_ ou enviar um _pull request_.
### Como contribuir:
1. **Fork** este repositório
2. **Clone** seu fork: `git clone https://github.com/seu-usuario/java-bank.git`
3. **Crie uma branch** para sua feature: `git checkout -b feature/nova-funcionalidade`
4. **Faça suas alterações** e teste completamente
5. **Commit** suas mudanças: `git commit -m 'Adiciona nova funcionalidade'`
6. **Push** para a branch: `git push origin feature/nova-funcionalidade`
7. **Abra um Pull Request** com descrição detalhada das mudanças
### Diretrizes para Contribuição:
- Mantenha o código limpo e bem comentado
- Siga boas práticas de POO
- Adicione testes para novas funcionalidades
## 🔑 Licença
Este projeto está licenciado sob a **Licença MIT** - consulte o arquivo [LICENSE](LICENSE) para obter mais detalhes.
Permite uso, modificação e distribuição livre, com atribuição.
## ✍️ Autora
Desenvolvido por **Emelly Beatriz** com ❤️

📬 Entre em contato:
📧 emellybmuniz@gmail.com |
💼 [Linkedin](https://www.linkedin.com/in/emellybmuniz ) |
🐙 [Github](https://github.com/emellybmuniz )
---
⭐ **Gostou do projeto?** Deixe uma estrela no repositório para apoiar o desenvolvimento!

