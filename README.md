# Projeto: Exemplos de Polimorfismo em Java

Este projeto contém diversos exemplos práticos dos conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java, com foco em **polimorfismo**, incluindo:

* Sobrescrita de métodos (Override)
* Sobrecarga de métodos (Overload)
* Sobrecarga de construtores

Cada exemplo está acompanhado de uma explicação clara para facilitar o aprendizado.

---

## 1. Sobrescrita de Métodos: Hierarquia de Veículos

### Arquivos:

* `Veiculo.java`
* `Carro.java`
* `Bicicleta.java`
* `Principal.java`

### Descrição:

A classe base `Veiculo` possui o método `mover()`, que é sobrescrito pelas classes `Carro` e `Bicicleta` para comportamentos específicos.

### Objetivo:

Demonstrar como objetos de subclasses podem ter comportamentos diferentes ao sobrescrever um método da superclasse.

---

## 2. Sobrecarga de Métodos: Classe Calculadora

### Arquivo:

* `Calculadora.java`

### Descrição:

A classe `Calculadora` tem três versões do método `somar()`, variando em tipo e quantidade de parâmetros (int e double).

### Objetivo:

Exibir como a sobrecarga permite que um mesmo nome de método realize tarefas diferentes com base nos parâmetros.

---

## 3. Sobrecarga de Construtores: Classe Produto

### Arquivo:

* `Produto.java`

### Descrição:

A classe `Produto` possui três construtores sobrecarregados que permitem criar objetos com diferentes combinações de nome, preço e quantidade.

### Objetivo:

Mostrar como a sobrecarga de construtores facilita a instanciação de objetos com diferentes conjuntos de informações.

---

## 4. Sobrecarga de Métodos: Classe Conversor

### Arquivo:

* `Conversor.java`

### Descrição:

A classe `Conversor` tem três versões do método `converter()` para:

* Celsius → Fahrenheit
* Km → Milhas
* Texto → Maiúsculo

### Objetivo:

Demonstrar como a sobrecarga permite reutilizar o nome do método com lógicas totalmente diferentes, mantendo a coesão.

---

## 5. Formatação de Saída

Para exibir valores `double` com duas casas decimais, utilizamos:

* `String.format("%.2f", valor)`
* ou `DecimalFormat df = new DecimalFormat("#.00")`

### Objetivo:

Garantir que os resultados numéricos fiquem mais apresentáveis na saída.

---

## Objetivos Pedagógicos

* Compreender e aplicar **polimorfismo por sobrescrita** e **por sobrecarga**.
* Entender diferenças entre **sobrecarga de métodos** e **sobrescrita**.
* Criar **códigos reutilizáveis e extensíveis**, respeitando os princípios da POO.

---
