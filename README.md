# Compilador para Subconjunto da Linguagem C

## **Descrição do Projeto**

Este projeto implementa um **compilador** para um subconjunto da linguagem C, desenvolvido como trabalho final da 
disciplina de Compiladores do curso de Bacharelado em Ciência da Computação da Universidade Estadual do Norte do Paraná. 
O objetivo é demonstrar, de maneira prática, como as diferentes etapas de um compilador trabalham juntas para processar 
uma linguagem de programação.

O compilador é capaz de processar programas escritos em uma versão simplificada de C, oferecendo suporte às principais 
construções da linguagem, como estruturas de controle, declarações de variáveis, funções, structs, unions e diretivas de 
pré-processador. 
Ele também inclui funcionalidades básicas de entrada e saída padrão, como `printf` e `scanf`.

---

## **Funcionamento**

### **Gramática**
A gramática utilizada para este compilador foi desenvolvida com base no formato EBNF e implementada em ANTLR-4. 
Ela cobre os seguintes aspectos da linguagem C:

1. **Diretivas de Pré-processamento**:
   - Suporte a inclusão de bibliotecas padrão, como `#include <stdio.h>`.
   - Uso de constantes com `#define`.

2. **Função `main`**:
   - Todo programa deve conter uma função principal com a estrutura:
     ```c
     int main() {
         // Código aqui
     }
     ```

3. **Declarações**:
   - Variáveis de tipos primitivos (`int`, `float`, `char`, `double`, etc.).
   - Arrays unidimensionais.
   - Estruturas (`struct`) e uniões (`union`).

4. **Funções**:
   - Declaração e definição de funções, com suporte a passagem de parâmetros.

5. **Instruções**:
   - Estruturas de controle (`if`, `else`, `switch`, `for`, `while`, `do-while`).
   - Entrada e saída padrão com `scanf` e `printf`.
   - Retorno de valores com `return`.

6. **Operadores**:
   - Suporte a operadores aritméticos, lógicos e relacionais.

7. **Comentários**:
   - Comentários de linha (`//`) e de bloco (`/* ... */`).

8. **Expressões**:
   - Expressões aritméticas, lógicas e condicionais.

---

## **Características da Implementação**

### **Estrutura da Gramática**
A gramática foi organizada para ser modular, facilitando a manutenção e extensibilidade. Aqui estão os 
principais componentes:

- **`program`**: Ponto de entrada da gramática, define a estrutura geral do código C.
- **`declaration`**: Lida com declarações de variáveis, structs, unions e funções.
- **`statement`**: Define as instruções executáveis, como expressões, blocos de código e estruturas de controle.
- **`expression`**: Gerencia expressões matemáticas, lógicas e de atribuição.

### **Processamento**
O compilador utiliza ANTLR-4 para gerar analisadores léxico e sintático. 
Ele pode ser configurado para interpretar ou compilar o código fonte para
um formato executável, de acordo com os seguintes comandos:

- **Para compilação**:
  ```bash
  ferramenta.exe codigo_fonte.c executavel.exe
  ```
- **Para interpretação**:
  ```bash
  codigo_fonte.c ou codigo_fonte.tianex
  ```

### **Requisitos**
- **Linguagem**: A ferramenta foi desenvolvida em C#.
- **Dependências**: ANTLR-4.

---

### **Instalação do ANTLR 4**

Siga os passos abaixo para instalar e configurar o ANTLR 4 no Windows:

## 1. Download
- Baixe o arquivo `antlr-4.x.x-complete.jar` do site oficial: [https://www.antlr.org/download.html](https://www.antlr.org/download.html).
- Salve em uma pasta, como `C:\antlr`.

## 2. Configuração
### Variáveis de Ambiente
1. **Adicionar o ANTLR ao `CLASSPATH`:**
   - Vá em **Configurações Avançadas do Sistema** > **Variáveis de Ambiente**.
   - Crie ou edite a variável `CLASSPATH` e adicione:
     ```
     .;C:\antlr\antlr-4.x.x-complete.jar;
     ```

2. **Adicionar o Java ao `Path` (se necessário):**
   - Na variável `Path`, adicione o caminho para o executável do Java, por exemplo:
     ```
     C:\Program Files\Java\jdk-xx\bin
     ```

## 3. Testar Instalação
- Abra o terminal e execute:
  ```bash
  java -jar C:\antlr\antlr-4.x.x-complete.jar

---

## **Como Executar**

1. Clone este repositório:
   ```bash
   https://github.com/WeslemCristiano/TrabalhoFinalDeCompilador
   ```

2. Gere os analisadores com o ANTLR-4:
   ```bash
    java -jar C:\Users\User\Documents\ANTLR-4\antlr-4.13.2-complete.jar -Dlanguage=CSharp -visitor -o Grammar ExprC.g4
   ```

3. Compile e execute o compilador:
   ```bash
    tianex.bat funçãoSoma.c
   ```

---

## **Exemplo de Código Suportado**

Aqui está um exemplo de programa válido para o compilador:

```c
#include <stdio.h>

void soma(int a, int b) {
    int soma = a + b;
    printf("Soma: ", soma);
}

int main() {
    int a, b;
    printf("Digite o primeiro numero: ");
    scanf("%d", &a);
    printf("Digite o segundo numero: ");
    scanf("%d", &b);
    soma(a, b);
    return 0;
}
```

---

## **Autores**
- **Aluno:** Weslem Cristiano de Oliveira
- **Aluno:** Giovanni
