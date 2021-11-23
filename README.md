<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-4/Images%20Sprint%204/Cards%20Sprint%204.png?w=400"height="400" width="700" />

</p>
<h1 align="center"> Story Card  </h1>  

![Badge](https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow)


## Tabela de Conteúdos  


 * [Descrição](#descrição)
 * [User story](#user-story)  
 * [Funcionalidades a serem desenvolvidas](#funcionalidades-a-serem-desenvolvidas)
 * [Ilustração das funcionalidades](#ilustração-das-funcionalidades)
 * [Benefícios](#benefícios)
 * [Gráfico de Burndown](#gráfico-de-burndown)  



## Descrição  


<p align="justified"> 

  
## User story  
  
 
 | Como | Eu quero | Para que |
 | ------- | ------- | ------- |
 | Diretor da Necto System | que seja gerado relatórios gerais sobre cada servidor  | seja possível monitorar o status do SGBD. |
  
 
## Funcionalidades a serem desenvolvidas  
  
  
 ### 1. Relatório do Servidor 
 - Desenvolver um relatório que informe as 5 queries mais lentas do servidor, comparativo entre o espaço em disco utilizado e o livre, quantidade de queries lentas e o total de queries do servidor, quantidade de indices não utilizados e o total de indices, espaço ocupado pelos indices e o espaço livre, quantidade de rollbacks e o total de transações.
  
 ### 2. Conexão com todos os servidores
 - Se conectar com todos os servidores onde há coleta de estatisticas.
  
 ### 3. Buscar relatórios de todos os servidores
 - Fazer a coleta de todos os relatórios que foram gerados nos servidores onde a conexão foi estabelecida.
  
 ### 4. Relatório geral de todos os servidores
 - Desenvolver um relatório que contenha uma visão geral de todos os servidores conectados.
  
 ### 5. Desenvolver alertas por parâmetro
 - Alertar o usuário caso exista algum erro no servidor e deverá ser possível ajustar o parâmetro via "txt" que irá acionar o alarme.
  
 ### 6. Armazenar parâmetro de conexão
 - Armazenar os parâmetros de conexão que deveram ser informados através do SHELL.
  

  
 ## Ilustração das funcionalidades   
  
  ### Arquivo Parâmetro - Configurações do SGBDHealth    
  
   <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-4/Images%20Sprint%204/PARAMETRO.png"height="700" width="1100" /> 
   
  ### Relatório Diário do Servidor   
  
   <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-4/Images%20Sprint%204/RELATORIO.png"height="700" width="1100" /> 
     
       
 ## Benefícios
  
   Com o relatório é possível obter estatisticas gerais de cada serividor, além de possuir um TOP 5 Queries Lentas. Assim é possível gerar um relatório sobre todos os servidores    que é responsável por indicar entre todos os servidores utilizados qual deles precisa de manutenção.
  
    
 ## Gráfico de Burndown
  
![Badge](https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow)

  
  

  
  
  
  
 
