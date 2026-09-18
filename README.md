# Cadastro de Veículos 

## Colaboradores

- Lucas Ribas Corso
- Mateus Rigon

Sistema de cadastro, listagem e consulta de veículos desenvolvido em Java, aplicando conceitos de Programação Orientada a Objetos (POO): classes, atributos, métodos, encapsulamento, instanciação de objetos e uso de coleções.

## Objetivo

Praticar os fundamentos de POO em Java através da implementação de um sistema simples de cadastro de veículos, com armazenamento de dados em memória (sem uso de banco de dados externo).

## Funcionalidades

O sistema apresenta um menu interativo com as seguintes opções:

```
======= Cadastro de Veículos OO =======
1 - Cadastrar Veículo
2 - Listar Veículos
3 - Consultar Veículo
0 - Sair
```

- **Cadastrar Veículo**: registra um novo veículo, validando:
  - Placa duplicada (não permite cadastro de veículos com placas repetidas)
  - Ano de fabricação (deve estar entre 1900 e o ano atual + 1)
- **Listar Veículos**: exibe marca, modelo, ano e placa de todos os veículos cadastrados
- **Consultar Veículo**: busca um veículo pela placa e exibe seus dados
- **Sair**: encerra a execução do programa

## Estrutura do Projeto

- `Veiculo.java` — classe que representa um veículo, com atributos privados, construtor e getters (encapsulamento)
- `Main.java` — classe principal com o menu, o loop de execução e os métodos de cadastro, listagem e consulta

## Armazenamento dos Dados

Os veículos são armazenados em uma `List<Veiculo>` em memória, durante a execução do programa. Os dados são perdidos ao encerrar o sistema — a persistência em banco de dados será implementada em uma etapa futura.

## Tecnologias Utilizadas

- Java
- Coleções Java (`ArrayList`, `List`)
- `Scanner` para entrada de dados
- `LocalDate` para obtenção do ano atual

## Como Executar

1. Compile os arquivos `.java`:
   ```
   javac Veiculo.java Main.java
   ```
2. Execute a classe principal:
   ```
   java Main
   ```