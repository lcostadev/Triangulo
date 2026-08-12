# 📐 TriangleGuard

Uma aplicação em **Java** desenvolvida com foco em **Programação Orientada a Objetos (POO)**, **Clean Code** e **tratamento de exceções resiliente**. 

O programa lê as medidas de diferentes triângulos via terminal, valida o domínio geométrico (Desigualdade Triangular) e calcula os perímetros com tratamento contínuo de entradas inválidas.

---

## 🛠️ Tecnologias e Conceitos Aplicados

- **Java 17+**
- **Encapsulamento e Imutabilidade:** Atributos `private final` garantindo o estado do objeto.
- **Guard Clauses & Fail-Fast:** Validação no construtor impedindo a existência de objetos em estado inválido.
- **Tratamento de Exceções:** Uso de `IllegalArgumentException` para regras de negócio e `InputMismatchException` para validações do `Scanner`.
- **Resiliência na CLI:** Loop de tentativa/erro (`while` com `try-catch`) que impede que o programa quebre por digitação incorreta.

---

## 📐 Regras de Domínio Aplicadas

Um triângulo só é aceito e instanciado se atender rigorosamente às duas condições geométricas:

1. **Lados Positivos:** Todos os lados ($a, b, c$) devem ser maiores que zero ($a > 0, b > 0, c > 0$).
2. **Desigualdade Triangular:** A soma das medidas de dois lados deve ser estritamente maior que a medida do terceiro lado.
   $$a < b + c \quad \land \quad b < a + c \quad \land \quad c < a + b$$

---

## 🚀 Como Executar o Projeto

### Pré-requisitos
- JDK 17 ou superior instalado.
- Terminal / Prompt de Comando.

### Passo a passo

1. **Clone o repositório:**
   ```bash
   git clone https://github.com/CaioBreis/Triangulo.git
   cd Triangulo
   ```
2. **Compile as classes**
   ```bash
   javac -d bin src/entities/Triangle.java src/Main.java
   ```
3. **Execute a aplicação:**
   ```bash
   java -cp bin Main
   ```

## 🖥️ Exemplo de Uso no Terminal

```text
  ---- Triangle Perimeter Calculator ----

Enter 3 measures for triangle A: 1 1 10
[DOMAIN ERROR] Invalid measurements (1.00, 1.00, 10.00). The sum of any two sides must be strictly greater than the third. Please try again.

Enter 3 measures for triangle A: 3 4 5

Enter 3 measures for triangle B: abc
[INPUT ERROR] You must enter numeric values. Please try again.

Enter 3 measures for triangle B: 5 5 5
Enter 3 measures for triangle C: 6 8 10

================ RESULTS ================
Triangle A -> Sides: 3.00 | 4.00 | 5.00
Perimeter: 12.00
----------------------------------------
Triangle B -> Sides: 5.00 | 5.00 | 5.00
Perimeter: 15.00
----------------------------------------
Triangle C -> Sides: 6.00 | 8.00 | 10.00
Perimeter: 24.00
----------------------------------------
```

## 🤝 Contribuição
Projeto refatorado em dupla para consolidação de boas práticas de POO e Clean Code em Java.
