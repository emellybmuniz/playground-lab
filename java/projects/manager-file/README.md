# File Manager - Java I/O Operations
[🇺🇸 English](#english) | [🇧🇷 Português](#português)

q
## English

### 📋 About
A Java application demonstrating file management operations using Java I/O streams. This project implements a complete file persistence system with operations to read, write, search, update, and delete records in CSV files.

### ✨ Features
- **Write Operations**: Add new records to CSV files
- **Read Operations**: Retrieve all records or search for specific data
- **Search Functionality**: Find records by any field
- **Multiple Search**: Find all records matching a criteria
- **Update Records**: Replace content in existing records
- **Delete Records**: Remove records based on search criteria
- **Automatic File Management**: Creates directories and manages file structure automatically

### 🛠️ Technologies Used
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

**Technical Details:**
- **Java I/O**: BufferedReader, BufferedWriter, FileReader, FileWriter
- **Collections**: ArrayList for data manipulation
- **Streams API**: For filtering and processing data
- **Exception Handling**: Comprehensive error handling with logging

### ⚙️ Prerequisites
- Java JDK 8 or higher
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### 📦 Installation
```bash
# 1. Clone this repository
$ git clone https://github.com/emellybmuniz/studies.git

# 2. Navigate to the project directory
$ cd studies/java/projects/manager-file

# 3. Compile the project
$ javac -d bin src/**/*.java

# 4. Run the application
$ java -cp bin Main
```

### 💡 How to Use
The application demonstrates various file operations with a CSV user database:

1. **Write data** to CSV file
2. **Read all records** from the file
3. **Search** for specific records by any field
4. **Find multiple records** matching a criteria
5. **Update records** by replacing content
6. **Delete records** based on search terms

**Example Operations:**
- `findAll()` - Returns all records from the file
- `findBy("ana")` - Finds the first record containing "ana"
- `findAllBy("gmail")` - Finds all records with "gmail"
- `remove("Emelly")` - Removes records containing "Emelly"
- `replace("Ana Maria", "Emelly")` - Replaces content in records

### 📂 Project Structure
```
manager-file/
├── src/
│   ├── Main.java
│   └── br/com/dio/persistence/
│       ├── FilePersistence.java          # Interface defining persistence operations
│       └── IOFilePersistence.java        # Implementation using Java I/O
└── managedFiles/
    └── IO/
        └── user.csv                       # Managed CSV file
```

### 🤝 Contribution
Contributions are welcome! Feel free to open issues or submit pull requests.

---

## Português

### 📋 Sobre
Uma aplicação Java demonstrando operações de gerenciamento de arquivos usando streams Java I/O. Este projeto implementa um sistema completo de persistência de arquivos com operações para ler, escrever, pesquisar, atualizar e deletar registros em arquivos CSV.

### ✨ Funcionalidades
- **Operações de Escrita**: Adicionar novos registros em arquivos CSV
- **Operações de Leitura**: Recuperar todos os registros ou buscar dados específicos
- **Funcionalidade de Busca**: Encontrar registros por qualquer campo 
- **Busca Múltipla**: Encontrar todos os registros que correspondem a um critério
- **Atualização de Registros**: Substituir conteúdo em registros existentes
- **Exclusão de Registros**: Remover registros baseados em critérios de busca
- **Gerenciamento Automático de Arquivos**: Cria diretórios e gerencia estrutura de arquivos automaticamente

### 🛠️ Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

**Detalhes Técnicos:**
- **Java I/O**: BufferedReader, BufferedWriter, FileReader, FileWriter
- **Collections**: ArrayList para manipulação de dados
- **Streams API**: Para filtragem e processamento de dados
- **Tratamento de Exceções**: Tratamento de erros abrangente com logging

### ⚙️ Pré-requisitos
- Java JDK 8 ou superior
- IDE (IntelliJ IDEA, Eclipse, VS Code, etc.)

### 📦 Instalação
```bash
# 1. Clone este repositório
$ git clone https://github.com/emellybmuniz/studies.git

# 2. Navegue até o diretório do projeto
$ cd studies/java/projects/manager-file

# 3. Compile o projeto
$ javac -d bin src/**/*.java

# 4. Execute a aplicação
$ java -cp bin Main
```

### 💡 Como Usar
A aplicação demonstra várias operações de arquivo com um banco de dados CSV de usuários:

1. **Escrever dados** no arquivo CSV
2. **Ler todos os registros** do arquivo
3. **Pesquisar** registros específicos por qualquer campo
4. **Encontrar múltiplos registros** que correspondem a um critério
5. **Atualizar registros** substituindo conteúdo
6. **Deletar registros** baseados em termos de busca

**Exemplo de Operações:**
- `findAll()` - Retorna todos os registros do arquivo
- `findBy("ana")` - Encontra o primeiro registro contendo "ana"
- `findAllBy("gmail")` - Encontra todos os registros com "gmail"
- `remove("Emelly")` - Remove registros contendo "Emelly"
- `replace("Ana Maria", "Emelly")` - Substitui conteúdo nos registros

### 📂 Estrutura do Projeto
```
manager-file/
├── src/
│   ├── Main.java
│   └── br/com/dio/persistence/
│       ├── FilePersistence.java          # Interface definindo operações de persistência
│       └── IOFilePersistence.java        # Implementação usando Java I/O
└── managedFiles/
    └── IO/
        └── user.csv                       # Arquivo CSV gerenciado
```

### 🤝 Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues ou enviar pull requests.

---

### ✍️ Autora
Desenvolvido com ❤️ por **Emelly Beatriz**

📧 emellybmuniz@gmail.com | 💼 [LinkedIn](https://www.linkedin.com/in/emellybmuniz) | 🐙 [GitHub](https://github.com/emellybmuniz)

---

⭐ **Gostou do projeto?** Deixe uma estrela no repositório!