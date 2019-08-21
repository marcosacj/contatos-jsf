# Gerenciador de Contatos JSF

Esta aplicacao consiste em um CRUD de contatos utilizando:

- Java
- PostgreSQL
- JSF e Primefaces.

## Execucao

A aplicacao pode ser testada atraves deste [Heroku App](https://contatos-jsf.herokuapp.com/).

Para executar a aplicacao localmente eh necessario configurar o ambiente e o banco de dados.

A aplicacao deve ser executada em uma Eclipse IDE.

## Configuracao do Ambiente

1. Instalar o PostgreSQL:

```bash
sudo apt install postgresql
```

2. Instalar o pgAdmin3:

```bash
sudo apt install pgadmin3
```

## Configuracao do Banco de Dados

A aplicacao esta preparada para funcionar com o banco `ContatosApplication` do seguinte servidor:

- **Host**: localhost
- **Port**: 5432
- **Username**: postgres
- **Password**: postgres

Duas formas possiveis de configurar sao:

- Criar o banco de dados especificado acima e conecta-lo ah aplicacao
- Conectar um banco de dados ja existente ah aplicacao

### Criando o Banco de Dados

No pgAdmin3:

1. Menu `File > Add Server`
2. De um nome ao servidor e preencha os campos com as informacoes especificadas
3. Clique em `OK`
4. Acesse o servidor recem criado e clique com botao direito em `Databases`
5. Clique em `New Database`
6. De o nome de `ContatosApplication` e clique em `OK`

### Conectando o Banco de Dados

A conexao com o banco deve ser configurada em `src/main/resources/application.properties`.

Para o banco especificado acima, a configuracao eh:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/ContatosApplication
spring.datasource.username=postgres
spring.datasource.password=postgres
```

Para um banco com quaisquer outras configuracoes, basta substituir as informacoes nas linhas acima.

## Executando Localmente

1. Importar o projeto como _Maven Project_ no Eclipse IDE
2. Executar como _Java Application_
3. Acessar atraves da URL `localhost:8081`