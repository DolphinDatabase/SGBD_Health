<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/Card%20Sprint%201%20(2).png?w=400"height="300" width="600" />
</p>
<h1 align="center"> Story Card  </h1>  

> ![Badge](https://img.shields.io/badge/STATUS-CONCLU%C3%8DDO-green)

## Tabela de Conteúdos

 * [Descrição](#descrição)
 * [User story](#user-story)  
 * [Funcionalidades desenvolvidas](#funcionalidades-desenvolvidas)
 * [Ilustração das funcionalidades](#ilustração-das-funcionalidades)
 * [Benefícios](#benefícios)
 * [Gráfico de Burndown](#gráfico-de-burndown)  



## Descrição

<p align="justified"> Nessa sprint apresentaremos como foi feita a conexão SGBD para realizar a consulta das métricas, assim também como o início da interface permitindo a visualização da conexão (url, usuário e senha) e seleção de métricas.

## User story
 
 | Como | Eu quero | Para que |
 | ------- | ------- | ------- |
 | Diretor da Necto System | Coletar métricas do SGBD sobre o funcionamento do banco de dados | Seja possível visualizar a performance/desempenho influenciando na manutençao periódica, saúde, funcionamento e disponibilidade |
  
 
## Funcionalidades desenvolvidas
  
 | Conexão SGBD | Consulta/Coleta de métricas | Interface inicial |
 | ------- | ------- | ------- |
 | Através do JDBC foi gerada a conexão da aplicação Java com o SGBD, utilizando o driver respectivo para cada gerenciador, possibilidando assim, realizar as coletas das métricas | Utilizar o coletor de estatísticas do PostgreSQL que é um subsistema que suporta coleta e relato de informações sobre o servidor, sobre exatamente o que está acontecendo no sistema no momento. Para posteriormente desenvolver a aplicação que realiza consultas sobre o que o coletor obteve | A interface inicial é composta por 1 frame que permite a seleção de métricas a serem exibidas |  
  
 ## Ilustração das funcionalidades  
  
  ### Seleção de métricas
  
  <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/sele%C3%A7%C3%A3o%20de%20m%C3%A9tricas.jpg?w=400"height="300" width="400" /> <p align="right">
   
  ### Exibição de métricas 
  <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/wireframe%201.jpg?w=400"height="300" width="400" /> 

 ## Benefícios
  
  - O usuário consegue visualizar as métricas  
  

  
  
  
 ## Gráfico de Burndown
  
  ![](https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/Backlog%20Sprint%201.jpg)
  
  
  

  
  
  
  
 
