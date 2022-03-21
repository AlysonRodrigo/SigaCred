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
<p align="center">Clientes

<p>/cliente/salvar</p>                             exemplo http://localhost:8080/cliente/salvar
<p>Para salvar um novo cliente      
<p>/cliente/nome/{"nome do cliente"}               exemplo http://localhost:8080/cliente/nome/Alyson
<p>Para pesquisar um nome especifico
<p>/cliente/todos                                  exemplo http://localhost:8080/cliente/todos
<p>Para pesquisar todos os clientes cadastrados
<p>/cliente/atualizar                              exemplo http://localhost:8080/cliente/atualizar
<p>Para atualizar um cliente ja cadastrado é necessario passar o id do cliente
<p>/cliente/deletar/{id do cliente}                exemplo http://localhost:8080/cliente/deletar/2
<p>(o id do cliente aparece quando você pesquisa por todos)
Para excluir um cliente da lista.
  <br>
<p  align="center">Equipamento</p>

<p>/equipamento/salvar
<p>Para salvar um novo equipamento
<p>/equipamento/marca/{"nome da marca"}
<p>Para pesquisar uma marca especifica
<p>/equipamento/todos
<p>Para pesquisar todos os equipamentos cadastrados
<p>/equipamento/atualizar
<p>Para atualizar um equipamento ja cadastrado
<p>/equipamento/deletar/{id do equipamento}
<p>Para excluir um cliente da lista.
