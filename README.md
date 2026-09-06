# Sistema-Pedidos

Sistema desenvolvido em Java como atividade prática de Programação Orientada a Objetos (POO).

O projeto simula o gerenciamento de pedidos de uma loja, permitindo trabalhar com diferentes modalidades de entrega e calcular automaticamente o frete, o prazo de entrega e o valor total do pedido. O sistema foi desenvolvido com o objetivo de aplicar conceitos fundamentais da Programação Orientada a Objetos, principalmente:

* Classes e objetos
* Encapsulamento
* Herança
* Abstração
* Polimorfismo
* Sobrescrita de métodos

A principal ideia do projeto é permitir que diferentes tipos de entrega possuam seus próprios comportamentos, evitando a necessidade de criar diversos if/else dentro da classe Pedido.

<img width="542" height="354" alt="image" src="https://github.com/user-attachments/assets/a752e419-dc94-431f-b5af-7eda0ceea09d" />

## Estrutura do projeto

```text
Sistema-Pedidos
│
├── src
│   ├── Entrega.java
│   ├── EntregaNormal.java
│   ├── EntregaExpressa.java
│   ├── RetiradaNaLoja.java
│   ├── EntregaAgendada.java
│   ├── Pedido.java
│   └── Main.java
│
├── .gitignore
├── README.md
└── sistemaPedidos.iml
```

### `Entrega`

É a classe abstrata que serve como base para os diferentes tipos de entrega.

Ela define os métodos:

```java
public abstract int calcularPrazo();

public abstract float calcularFrete();
```

Como esses métodos são abstratos, as classes que herdam de Entrega precisam fornecer suas próprias implementações.

### `EntregaNormal`

Representa a modalidade de entrega normal.

```text
calcularPrazo() → 7 dias
calcularFrete() → R$ 21,00
```

### `EntregaExpressa`

Representa a modalidade de entrega expressa.

```text
calcularPrazo() → 2 dias
calcularFrete() → R$ 52,50
```

### `RetiradaNaLoja`

Representa a retirada do pedido diretamente na loja.

```text
calcularPrazo() → 1 dia
calcularFrete() → R$ 0,00
```

### `EntregaAgendada`

Representa uma entrega para uma data específica.

Utiliza:

```java
LocalDate
```

para armazenar a data da entrega e:

```java
ChronoUnit.DAYS.between()
```

para calcular o prazo.

### `Pedido`

Representa o pedido realizado pelo cliente.

A classe possui informações como:

* Número do pedido
* Nome do cliente
* Valor dos produtos
* Peso total
* Modalidade de entrega

O pedido possui uma referência para a classe Entrega, permitindo trabalhar com qualquer uma das modalidades de entrega.

O valor total é calculado através da soma:

```text
Valor total = Valor dos produtos + Frete
```
### `Main`

É a classe responsável pela execução e pelos testes do sistema.

Nela são criados pedidos utilizando as diferentes modalidades de entrega e também é realizado um teste com informações inválidas.

## Conceitos de POO utilizados

### Abstração

A classe Entrega é definida como abstract.

Ela representa uma ideia geral de entrega e determina que toda modalidade de entrega deve possuir métodos para calcular o prazo e o frete.

```java
public abstract class Entrega
```

### Herança

As modalidades de entrega herdam da classe Entrega.

Exemplo:

```java
public class EntregaNormal extends Entrega
```

Isso permite que EntregaNormal utilize a estrutura definida pela classe Entrega.

### Polimorfismo

O atributo entrega da classe Pedido é do tipo Entrega.

```java
private Entrega entrega;
```

Isso permite que ele receba diferentes objetos:

```java
new EntregaNormal()
new EntregaExpressa()
new RetiradaNaLoja()
new EntregaAgendada()
```

O Pedido pode então chamar:

```java
entrega.calcularFrete();
entrega.calcularPrazo();
```

sem precisar saber qual tipo específico de entrega foi utilizado.

Cada classe fornece seu próprio comportamento para esses métodos.

### Sobrescrita (@Override)

As classes filhas sobrescrevem os métodos abstratos definidos em Entrega.

Exemplo:

```java
@Override
public int calcularPrazo() {
    return 7;
}
```

A anotação @Override indica que o método está sobrescrevendo um método herdado da classe pai.

### Encapsulamento

Os principais atributos da classe Pedido são privados:

```java
private int numero;
private String nomeCliente;
private float valor;
private float pesoTotal;
private Entrega entrega;
```

Isso impede que outras classes acessem diretamente esses atributos.

## Validações

O sistema também possui algumas validações no cadastro do pedido.

São verificadas situações como:

* Número do pedido menor ou igual a zero
* Nome do cliente não informado
* Valor dos produtos menor ou igual a zero
* Peso menor ou igual a zero
* Modalidade de entrega não informada

Também existe uma validação específica para a entrega agendada, impedindo que seja escolhida uma data anterior à data atual.

## Como executar

### 1. Clone o repositório

```bash
git clone https://github.com/VitorAlencarAraujo/Sistema-Pedidos.git
```

### 2. Abra o projeto

Abra o projeto em uma IDE compatível com Java, como o **IntelliJ IDEA**.

Execute a classe:

```text
src/Main.java
```

O programa exibirá no console os resultados dos pedidos criados.

```text
Número do pedido: 10
Nome cliente: Vitor
Valor em produtos: R$140.0
Peso: 13.5g
Tipo de entrega: Entrega normal
Frete: R$21.0
Prazo: 7 dias

========== PREÇO FINAL ==========
R$ 161.0
```

O valor final é calculado somando o valor dos produtos ao frete:

```text
R$ 140,00 + R$ 21,00 = R$ 161,00
```

## 🎯 Conclusão

O desenvolvimento deste projeto permitiu aplicar na prática os principais conceitos da Programação Orientada a Objetos em Java, como abstração, herança, encapsulamento, polimorfismo e sobrescrita de métodos. O sistema também demonstra como diferentes modalidades de entrega podem possuir comportamentos próprios, tornando o código mais organizado e preparado para futuras alterações e novas funcionalidades.
