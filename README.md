
# Repositório Prático JUnit 5

Este repositório contém exemplos de testes unitários utilizando a biblioteca JUnit 5 em Java. O objetivo é praticar a criação de testes automatizados para garantir a qualidade do código. Além disso, utiliza-se o padrão Factory para facilitar a criação de objetos de teste.

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

```
├── src
│   └── main
│       └── java
│           └── entity
│               └── Account.java
└── test
    └── java
        ├── entity
        │   └── AccountTests.java
        └── factory
            └── AccountFactory.java
```
### Descrição dos Diretórios e Arquivos


- **src/main/java/entity/**: Este diretório contém o código-fonte principal da aplicação.
  - **Account.java**: Classe que representa a entidade `Account`.

- **test/java/entity/**:
  - **AccountTests.java**: Este arquivo contém os testes unitários para a classe `Account`. Ele utiliza o framework JUnit 5 para criar e executar testes que validam o comportamento e os métodos da classe `Account`.
  
- **test/java/entity/factory/**: Este diretório contém os testes unitários da aplicação.
  - **AccountFactory.java**: Classe que implementa uma fábrica (`factory`) para criar instâncias de `Account` nos testes.


## Dependências

Para executar os testes unitários, é necessário configurar as seguintes dependências no seu ambiente de desenvolvimento:

### Maven

Para adicionar o JUnit como dependência em um projeto Maven, inclua o seguinte trecho no arquivo `pom.xml`:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-engine</artifactId>
    <version>5.10.2</version>
    <scope>test</scope>
</dependency>
```


## Licença


Este projeto está licenciado sob a [Licença MIT](LICENSE). Veja o arquivo LICENSE para mais detalhes.
