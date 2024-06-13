
# JUnit5 Repositório Prático

Este repositório contém exemplos de testes unitários utilizando a biblioteca JUnit5 em Java. O objetivo é praticar a criação de testes automatizados para garantir a qualidade do código. Além disso, um padrão Factory é utilizado para facilitar a criação de objetos de teste.

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
        └── entity
            └── factory
                └── AccountFactory.java
```
### Descrição dos Diretórios e Arquivos


- **src/main/java/entity/**: Este diretório contém o código-fonte principal da aplicação.
    - **Account.java**: Classe que representa a entidade `Account`.

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