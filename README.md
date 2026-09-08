# Boas Práticas de Software

Projeto desenvolvido para a atividade de aplicação de boas práticas de programação e utilização do Git.

## Objetivo

O objetivo deste projeto é analisar um código Java inicialmente desenvolvido sem preocupação com organização e legibilidade, realizar melhorias utilizando boas práticas de programação e registrar todas as alterações utilizando Git.

## Melhorias realizadas

Durante o desenvolvimento foram realizadas as seguintes melhorias:

* Alteração de nomes de variáveis para nomes mais descritivos;
* Modularização do código em métodos com responsabilidades específicas;
* Utilização de código autoexplicativo;
* Criação de uma constante para representar a média mínima de aprovação;
* Padronização de nomes de classes, métodos, variáveis e constantes;
* Organização da indentação e formatação do código;
* Registro das alterações utilizando commits no Git;
* Criação da branch `melhoria-boas-praticas`;
* Criação de Pull Request;
* Merge das melhorias para a branch `main`.

## Questões

### 1. Qual era o principal problema do código original?

O principal problema do código original era a falta de organização e legibilidade. As variáveis possuíam nomes pouco descritivos, como `n`, `a`, `b` e `c`, e todo o processamento estava concentrado dentro do método `main`.

Isso dificultava a compreensão do código, sua manutenção e a possibilidade de reutilizar partes específicas do sistema.

### 2. Quais melhorias você realizou?

Foram realizadas diversas melhorias no código. Os nomes das variáveis foram alterados para nomes mais claros, como `nomeAluno`, `Nota1`, `Nota2` e `media`.

O código também foi modularizado em métodos responsáveis por calcular a média, verificar a situação do aluno e apresentar os resultados.

Além disso, foi criada a constante `media_Minima`, tornando o código mais autoexplicativo. Também foram aplicados padrões de nomenclatura, indentação, formatação e organização do código.

### 3. Como a modularização facilitou a organização do código?

A modularização permitiu dividir o programa em partes menores, onde cada método possui uma responsabilidade específica.

O método `calcularMedia()` é responsável apenas pelo cálculo da média, `verificarSituacao()` verifica se o aluno foi aprovado ou reprovado e `apresentarResultados()` exibe as informações.

Dessa forma, o método `main()` fica responsável apenas por organizar o fluxo principal do programa, tornando o código mais fácil de entender, testar e modificar.

### 4. Como o Git ajudou a controlar as alterações realizadas no sistema?

O Git permitiu registrar cada etapa do desenvolvimento por meio de commits. Dessa forma, foi possível acompanhar o histórico das alterações realizadas no projeto.

Também foi criada a branch `melhoria-boas-praticas`, permitindo realizar as melhorias sem alterar diretamente a versão principal do sistema.

Por meio do Pull Request foi possível revisar as alterações antes de realizar o merge para a branch `main`. Assim, o Git ajudou a manter o histórico do projeto organizado e possibilitou acompanhar a evolução do código.

## Estrutura do projeto

```text
sistema/
│   └── Sistema.java
└── README.md
```

## Tecnologias utilizadas

* Java
* Git
* GitHub

## Branch utilizada

```text
main
```

Branch utilizada para desenvolvimento das melhorias:

```text
melhoria-boas-praticas
```
