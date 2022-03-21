<h1 align="center">Siga Cred</h1>

<p align="center">Codigo para construir um sistema de clientes que levam seus equipamentos para uma loja de manutenção </p>

<h4 align="center"> 
	O projeto esta concluido
</h4>

### Pré-requisitos

Antes de começar, você vai precisar ter instalado em sua máquina as seguintes ferramentas:
[Git](https://git-scm.com)para fazer uma copia desse documento, [Postman](https://www.postman.com/) para fazer os testes dos ends points. 
Além disto é bom ter um editor para trabalhar com o código como [eclipse](https://www.eclipse.org/downloads/) e o [MySQL](https://dev.mysql.com/downloads/installer/) para salvar no banco de dados.

### 🎲 Rodando a Aplicação

```bash
# Clone este repositório
$ git clone <https://github.com/AlysonRodrigo/SigaCred.git>
```
```java
Antes de rodar a aplicação deve-se colocar sua senha do MySQL na classe application-propeties
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/db_Manutencao?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=
spring.jpa.show-sql: true

Após isso

# Execute a aplicação no eclipse
 Na classe ManutencaoApplication
 Vai apertar com o botâo direito do mause e clicar em run As Java Application
 # O servidor inciará na porta:8080 - acesse <http://localhost:8080>
```

### End Points
<p >Com a Aplicação rodando abra o postman para testar os end points são eles</p>
<p align="center">Clientes</p>

<p>/cliente/salvar                             exemplo http://localhost:8080/cliente/salvar</p>
<p>Para salvar um novo cliente  </p>    
<p>/cliente/nome/{"nome do cliente"}               exemplo http://localhost:8080/cliente/nome/Alyson</p>
<p>Para pesquisar um nome especifico</p>
<p>/cliente/todos                                  exemplo http://localhost:8080/cliente/todos</p>
<p>Para pesquisar todos os clientes cadastrados</p>
<p>/cliente/atualizar                              exemplo http://localhost:8080/cliente/atualizar</p>
<p>Para atualizar um cliente ja cadastrado é necessario passar o id do cliente</p>
<p>/cliente/deletar/{id do cliente}                exemplo http://localhost:8080/cliente/deletar/2</p>
<p>(o id do cliente aparece quando você pesquisa por todos)
Para excluir um cliente da lista.</p>
  <br>
<p  align="center">Equipamento</p>

<p>/equipamento/salvar</p>
<p>Para salvar um novo equipamento</p>
<p>/equipamento/marca/{"nome da marca"}</p>
<p>Para pesquisar uma marca especifica</p>
<p>/equipamento/todos</p>
<p>Para pesquisar todos os equipamentos cadastrados</p>
<p>/equipamento/atualizar</p>
<p>Para atualizar um equipamento ja cadastrado</p>
<p>/equipamento/deletar/{id do equipamento}</p>
<p>Para excluir um cliente da lista.</p>

<h2 align="center">Atenção</h2>
<h3>São obrigatorios os seguinte itens para criar um usuario </h3>
<p align="center">
 <a>Nome</a> •
 <a>Email</a> • 
 <a>endereço</a> 
</p>
O id não é necessario na criação pois é criado automaticamente

```java
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY)long idCliente;
	private @NotBlank String nome;
	private @NotBlank String email;
	private @NotBlank String endereco;
	private Long telefone;
  ```
<h3>Ja no equipamento são necessarios </h3>
  <p align="center">
 <a>Marca</a> •
 <a>Tipo</a> • 
 <a>Problema</a>  • 
 <a>Tempo</a>
</p>

```java
  	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long idEquipamento;
	private @NotBlank String marca;
	private @NotBlank String tipo;
	private @NotBlank String problema;
	private @NotBlank String tempo;
	private String mensagem;
  ```

  <h2>Agradeço a oportunidade caso tenha aluma duvida estarei disponivel para responder</h2>