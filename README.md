<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-3/Images%20Sprint%203/Cards%20Sprint%203.png?w=400"height="400" width="700" />

</p>
<h1 align="center"> Story Card  </h1>  

![Badge](https://img.shields.io/badge/STATUS-CONCLU%C3%8DDO-green)


## Tabela de Conteúdos  


 * [Como executar a aplicação](#como-executar-a-aplicação)
 * [Descrição](#descrição)
 * [User story](#user-story)  
 * [Funcionalidades desenvolvidas](#funcionalidades-desenvolvidas)
 * [Ilustração das funcionalidades](#ilustração-das-funcionalidades)
 * [Benefícios](#benefícios)
 * [Gráfico de Burndown](#gráfico-de-burndown)  
 
 
## Como executar a aplicação

### Para executar a aplicação:
 
 1 - Documentação do tutorial acesse [aqui](https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-3/Documenta%C3%A7%C3%A3o%20sprint%203/Como%20rodar%20a%20API%20-%20sprint%203.pdf)  
 2 - Arquivo executável da aplicação acesse [aqui](https://drive.google.com/file/d/15mTo4FzNMsi9JHQx2P8fIMLaEC3vwdjt/view)  




## Descrição  


<p align="justified"> Nessa sprint através de um arquivo de texto é possível, definir "queries lentas" e ativar/desativar a interface. Além de armazenar as estatisticas em CSV também há um Banco Simples onde são armazenadas.

  
## User story  
  
 
 | Como | Eu quero | Para que |
 | ------- | ------- | ------- |
 | Diretor da Necto Systems | coletar e armazenar métricas em um período configurável | seja possível analisar de maneira geral o crescimento e status do SGBD. |
  
 
## Funcionalidades desenvolvidas  
  
  
 ### 1. Banco Simples (SQlite3) 
 - Modelar e desenvolver um banco simples no SQlite3 que será responsável por armazenar as estatíticas coletadas e armazenar os parâmetros de conexão com o servidor.
  
 ### 2. Queries lentas
 - As queries lentas devem ser parametrizadas através do "arquivo txt parâmetro".
  
 ### 3. Métricas de armazenamento de índices
 - Coletar e armazenar as métricas que indicam o espaço ocupado pelos índices.
  
 ### 4. Configuração de exibição
 - Deverá ser opcional exibir informações no SHELL,  através do "arquivo txt parâmetro".
  
 ### 5. Rotina de coleta e armazenamento de métricas
 - A rotina de coleta e armazenamento de métricas deverá ser feita pelo SO Windows/Linux. Essa funcionalidade depende da interface desativada, quando desativada será possível agendar tanto pelo Windows quanto pelo Linux.
  
 ### 6. Conexão banco simples
 - Se conectar ao banco simples (SQlite3) da aplicação pelo arquivo de texto.
    
 ### 7. Armazenar estatísticas
 - Armazenar no banco sqlite3 conforme a modelagem as estatísticas coletadas de todos os servidores.

  
 ## Ilustração das funcionalidades   
  
  ### Modelagem    
  
   <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/WhatsApp%20Image%202021-11-18%20at%2020.54.45.jpeg"height="400" width="600" /> 
   
   <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-3/Images%20Sprint%203/Modelagem_3.png?w=200"height="430" width="600" />   
     
  ### Arquivo de Configuração
  
   <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-3/Images%20Sprint%203/parametro%20arquivo.png?w=200"height="800" width="800" /> 
     
     
  #### Para acessar o vídeo de apresentação da aplicação clique [aqui](https://youtu.be/BVyXYbi0GmM)
     
    
  
 ## Benefícios
  
   Com o arquivo de texto é possível configurar a API (querys lentas e ativar/desativar) conforme a necessidade do usuário sem precisar da interface, 
   o que torna possível o uso de agendadores de tarefas, responsáveis por rodar a aplicação que coletará estatisticas sempre que acionada. Além de agora possuir um banco simples    para armazenar as estatisticas e futuramente os parametros de conexão com o SGBD.
  
    
 ## Gráfico de Burndown
  
 <p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/Sprint-3/Images%20Sprint%203/Burndown%20sprint%203.png?w=200"height="500" width="1300" /> 

  
  

  
  
  
  
 
