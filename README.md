# Controle de Fornecedores - Projeto Spring Boot

Este é um projeto de exemplo para um sistema de controle de fornecedores desenvolvido com o Spring Boot e integrado ao SQL Server.

## Pré-requisitos

1. **Java Development Kit (JDK)**:
   Certifique-se de ter o JDK 8 ou superior instalado em seu sistema. Você pode verificar isso executando o comando `java -version` no seu terminal.

2. **Ferramenta de Gerenciamento de Dependências**:
   Você pode usar o Maven ou o Gradle como ferramenta de gerenciamento de dependências.

3. **SQL Server**:
   Tenha acesso a um servidor SQL Server e as credenciais necessárias para criar e acessar bancos de dados.

## Passos de Configuração e Execução

1. **Clone o Projeto**:
   Clone este repositório para o seu ambiente local.

2. **Configurar as Credenciais do Banco de Dados**:
   Abra o arquivo `src/main/resources/application.properties` e atualize as informações de conexão do banco de dados de acordo com o seu ambiente.

   ```properties
   spring.datasource.url=jdbc:sqlserver://seu_servidor:porta;databaseName=seu_banco_de_dados
   spring.datasource.username=seu_usuario
   spring.datasource.password=sua_senha
   spring.datasource.driver-class-name=com.microsoft.sqlserver.jdbc.SQLServerDriver
   spring.jpa.hibernate.ddl-auto=update

3. **Acessar a API**:
   A API pode ser acessada em `http://localhost:8080/api/v1/fornecedores` faça uma requisição POST no formato JSON os seguintes campos:
```.
{
  "endereco": "Endereço do Fornecedor",
  "razaoSocial": "LAVANDERIA SEMPRE LIMPA LTDA",
  "contatos": [
    {
      "nomeContato": "João Silva",
      "emailContato": "joao@lavanderiasl.com.br"
    },
    {
      "nomeContato": "Ana Moraes",
      "emailContato": "ana@lavanderiasl.com.br"
    }
  ]
}
```
3. **Executar o Projeto**:
   Você pode executar o projeto usando o comando `mvn spring-boot:run` ou `gradle bootRun` no seu terminal.

4. **Acessar o Projeto**:
   O projeto pode ser acessado em `http://localhost:8080`.
