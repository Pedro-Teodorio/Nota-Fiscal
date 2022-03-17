
<h1 align="center">Cadastro de Notas Fiscais e seus Itens</h1>
<p id="sobre" align="center">
Projeto Java feito utilizando a framework Spring JDBC. O projeto foi feito para um trabalho do meu curso de Desenvolvimento de Sistemas no SENAI-SP, o seu objetivo era criar uma REST API de Cadastro de Notas Fiscais e seus Itens, utilizando a framework Spring JDBC. 
</p>



<h4 align="center"> 
  🔹 Status: Concluído ✅
</h4>

<p align="center">
 <a href="#sobre">Sobre</a> •
 <a href="#roadmap">Como usar</a> • 
 <a href="#tecnologias">Tecnologias</a> • 
 <a href="https://github.com/Pedro-Teodorio/Nota-Fiscal/blob/main/LICENSE">Licença</a> • 
 <a href="https://github.com/Pedro-Teodorio/">Autor</a>
</p>


***

<h3 align="center" id="roadmap">Como Usar</h3>


<br>
<p align="center">1) Antes de qualquer outra coisa, vamos clonar o projeto:</p>

```
git clone https://github.com/Pedro-Teodorio/Nota-Fiscal.git
```
<p align="center">Ou</p>

<div align="center">
     <img src="./assets/clone.png" />
</div>

<br>

***

<p align="center">2) Para que você possa rodar o programa na sua máquina primeiro confira se você possui as seguintes ferramentas instaladas no seu computador:</p>

<br>
<div align="center">
  
 <p align="center"><strong>✔️ <a href="https://www.oracle.com/java/technologies/downloads/">JDK</a> (Java Virtual Machine).</strong></p>
  
  <p align="center"><strong>✔️ Uma <a href="https://www.redhat.com/pt-br/topics/middleware/what-is-ide#:~:text=IDE%2C%20ou%20ambiente%20de%20desenvolvimento,facilitando%20o%20desenvolvimento%20de%20aplica%C3%A7%C3%B5es.">IDE</a> como a <a href="https://www.eclipse.org/downloads/">Eclipse</a> para rodar o seu projeto Java.</strong></p>
  
  <p align="center"><strong>✔️ Um <a href="https://www.oracle.com/br/database/what-is-a-relational-database/">Banco de Dados Relacional</a> como o <a href="https://dev.mysql.com/downloads/">MySQL</a> e um </strong></p>
  
  <p align="center"><strong>✔️ <a href="https://dicasdeprogramacao.com.br/o-que-e-um-sgbd/">SGDB</a> (Sistema Gerenciador de Banco de Dados) como o <a href="https://dev.mysql.com/downloads/workbench/"> MySQL Workbench</a>.</strong></p>
</div>


***

<br>

<p align="center">3) A seguir você irá abrir o arquivo NotaFiscal.sql no seu MySQL Workbench e em seguida clicar no botão de raio para que ele crie o banco de dados e as tabelas respectivamente.</p>

<div align="center">
  <img src="./assets/criacaobanco.png" />
</div>

***

<br>

<p align="center">4) A seguir vamos importar o projeto em nossa IDE. Lembrando que nesse caso o projeto está sendo importado na  IDE IntelliJ IDEA, então o passo a passo de importação aqui descritos se aplicam a essa IDE, caso você utilize outra IDE o passo a passo podem variar.</p>

<div align="center">
  <img src="./assets/import.png" />
</div>

***

<br>

<p align="center">5) A seguir na pasta <strong><i>src/main/resources</i></strong>, clique no arquivo de nome <strong><i>application.properties</i></strong>:</p>

<br>

<div align="center">
  <img src="./assets/pastas.png" />
</div>

***

<br>

<p align="center">6) Em <strong><i>application.properties</i></strong> você irá trocar ambos os campos <strong><i>spring.datasource.username</i></strong> e <strong><i>spring.datasource.password</strong></i>, e colocar o seu <strong><i>nome de usuario</strong></i> e <strong><i>senha</strong></i> do seu MySQL para que assim o programa possa reconhecer o seu banco de dados e as tabelas criadas neles.</p>

```
spring.datasource.username = nomeDeUsuario
spring.datasource.password = senhaDeUsuario
```
<div align="center">
  <img src="./assets/props.png" />
</div>

***

<br>

<p align="center">6) A seguir na pasta <strong><i>src/main/java</i></strong>, clique no arquivo de nome <strong><i>NotaFiscalApplication</i></strong>e Execute-o</p>

<br>

<div align="center">
  <img src="./assets/apllication.png" />
</div>


<h3 align="center">Tecnologias</h3>

<div align="center">
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-20B2AA?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white" />
  <img src="https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white" />
</div>
