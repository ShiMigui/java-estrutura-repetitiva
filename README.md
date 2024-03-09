# Curso de Java completo - Estrutura repetitiva

Este repositório foi criado para armazenar os exercícios e projetos desenvolvidos no curso de Java da Udemy. Recomendo que, se quiser ter acesso à experiência completa, inscreva-se no curso. Abaixo estão detalhes sobre o curso:

## Links

Curso: [Java completo - Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/).

Youtube: [Dev Superior](https://www.youtube.com/@DevSuperior).

Github: [Nelio Alves](https://github.com/acenelio).

Site: [Dev Superior](https://devsuperior.com.br).

## Exercícios

- [Exercício 1](#exercício-1)
- [Exercício 2](#exercício-2)
- [Exercício 3](#exercício-3)
- [Exercício 4](#exercício-4)
- [Exercício 5](#exercício-5)
- [Exercício 6](#exercício-6)
- [Exercício 7](#exercício-7)
- [Exercício 8](#exercício-8)
- [Exercício 9](#exercício-9)
- [Exercício 10](#exercício-10)

### Exercício 1

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1114.java)

Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

#### Exercício 1 - Exemplos

```bash
2200
Senha Invalida
```

```bash
1020
Senha Invalida
```

```bash
2022
Senha Invalida
```

```bash
2002
Acesso Permitido
```

### Exercício 2

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1115.java)

Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

#### Exercício 2 - Exemplos

```bash
2 2
primeiro
```

```bash
3 -2
quarto
```

```bash
-8 -1
terceiro
```

```bash
-7 1
segundo
```

```bash
0 2
```

### Exercício 3

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1134.java)

Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.

#### Exercício 3 - Exemplos

```bash
8
1
7
2
2
4

MUITO OBRIGADO
Alcool: 1
Gasolina: 2
Diesel: 0
```

### Exercício 4

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1067.java)

Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o X, se for o caso.

#### Exercício 4 - Exemplos

```bash
X: 8

1
3
5
7
```

### Exercício 5

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java)

Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida. Mostre quantos destes valores X estão dentro do intervalo \[10,20] e quantos estão fora do intervalo, mostrando essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

#### Exercício 5 - Exemplos

```bash
Number: 5
14
123
10
-25
32

2 in
3 out
```

### Exercício 6

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1079.java)

Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem peso 5.

#### Exercício 6 - Exemplos

```bash
Number: 3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0

5.7
6.3
9.3
```

### Exercício 7

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1116.java)

Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

#### Exercício 7 - Exemplos

```bash
Number: 3

3 -2
-8 0
0 8

-1.5
divisao impossivel
0.0
```

### Exercício 8

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1153.java)

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N \* (N-1) \* (N-2) \* (N-3) \* ... \* 1. Lembrando que, por definição, fatorial de 0 é 1.

#### Exercício 8 - Exemplos

```bash
5
120
```

```bash
4
24
```

```bash
1
1
```

```bash
6
1
```

### Exercício 9

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1072.java)

Ler um número inteiro N e calcular todos os seus divisores.

#### Exercício 9 - Exemplos

```bash
Number: 6

1
2
3
6
```

### Exercício 10

Correção: [clique aqui](https://github.com/acenelio/nivelamento-java/blob/master/src/uri1143.java)

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas, começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme exemplo.

#### Exercício 10 - Exemplos

````bash
Number: 5

1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
```
