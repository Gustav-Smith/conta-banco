# ContaBanco

Um projeto Java simples que implementa um sistema de abertura de conta bancária via terminal.

## 📋 Descrição

Este projeto foi desenvolvido como exercício prático de Sintaxe Java, abordando conceitos como:
- Declaração de variáveis com tipos apropriados
- Uso da classe `Scanner` para entrada de dados via terminal
- Manipulação de strings e concatenação
- Conversão de tipos com `Integer.parseInt()` e `Double.parseDouble()`

## 🏦 Funcionalidades

O programa solicita as seguintes informações do usuário:
- **Agência**: Texto (ex: 067-8)
- **Número da Conta**: Inteiro (ex: 1021)
- **Nome do Cliente**: Texto (ex: MARIO ANDRADE)
- **Saldo**: Decimal (ex: 237.48)

Após inserir todas as informações, o sistema exibe uma mensagem de confirmação formatada com os dados inseridos.

## 📁 Estrutura do Projeto

```
conta-banco/
├── src/
│   └── ContaTerminal.java    # Classe principal do programa
├── bin/                       # Arquivos compilados
├── lib/                       # Dependências (se houver)
└── README.md                  # Este arquivo
```

## 🚀 Como Usar

### Compilação
```bash
javac -encoding UTF-8 -d bin src/ContaTerminal.java
```

### Execução
```bash
java -cp bin ContaTerminal
```

### Exemplo de Uso
```
Por favor, digite o número da Agência !
067-8
Por favor, digite o número da Conta !
1021
Por favor, digite o nome do Cliente !
MARIO ANDRADE
Por favor, digite o saldo da Conta !
237.48

Olá MARIO ANDRADE, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque
```

## 📚 Conceitos Abordados

- Variáveis e tipos de dados primitivos
- Classe `Scanner` para leitura de entrada
- Manipulação de strings
- Conversão de tipos
- Concatenação de strings
- Método `main` com `throws Exception`
