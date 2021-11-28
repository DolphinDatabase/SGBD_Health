<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/LogoPNG.png?raw=true" />
</p>
<h1 align="center"> SGBD Health </h1>  

![Badge](https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow)

## Tabela de Conteúdos

 * [Descrição](#descrição)
 * [Pré-requisitos e como executar a aplicação](#Pré-requisitos-e-como-executar-a-aplicação)
 * [Backlog Product](#backlog-product) 
 * [Backlog em Story cards](#backlog-em-story-cards)   
 * [Coletor de Estatísticas](#Coletor-de-Estatísticas)
 * [Escopo de Recursos](#escopo-de-recursos)
 * [Roadmap](#roadmap)
 * [Tecnologias](#Tecnologias)
 * [Cronograma do API](#cronograma-do-api)
 * [Dev Team](#dev-team)
 * [Autor](#Autor)
 * [Licença](#Licença)



## Descrição

<p align="justify">É uma aplicação de monitoramento voltada somente à SGBDs, focada na performance e desempenho. Através da coleta de dados do SGBD (memória, tempo de consultas, espaço em disco, transações, evolução da memória, caches e registros) que influenciam na saúde e manutenção periódica.

  
## Pré-requisitos e como executar a aplicação
  
 #### **Pré-requisitos** 
  
  1. Instalação do **JDK** ou no mínimo **JRE versão 1.8** acesse [aqui](https://www.oracle.com/java/technologies/downloads/).
  2. Instalação do DB Browser (SQlite) acesse [aqui] (https://sqlitebrowser.org/dl/).
  3. Download da aplicação acesse [aqui](https://drive.google.com/file/d/1A1-pADaB350oxTsHmCnbaGrH6kgtUnUb/view?usp=sharing).
 
 #### **Como executar** 
  
  1. Documentação do passo a passo do tutorial [aqui](https://github.com/DolphinDatabase/SGBD_Health/blob/main/Documenta%C3%A7%C3%A3o/Como%20rodar%20a%20API%20-%20sprint%203.pdf).
  2. Para o vídeo do tutorial clique [aqui](https://www.youtube.com/watch?v=BVyXYbi0GmM).
  
  
## Product Backlog 
 
 - Conexão SGBD;
 - Coleta de métricas de um ou mais SGBDs (PostgreSQL) remoto;
 - Tratamento das métricas (histórico, registro, relatórios, disponibilidade, alertas e valores atingidos durante a operação):
   - Tratamento de métricas de forma tabular;  
   - Salvar consultas em CSV;
   - Tabular métricas;
   - Coleta periódica de métricas;
   - Histórico de métricas;
   - Relatórios de métricas;
   - Alertas por email;
   - Funcionamento do BD (tempo e quantidade de queries e uso de índices).
   - Ativar ou Desativar Interface Gráfica;
   - Cadastro de dados de conexão dos SGBDs (acesso à estastítica por tabelas).

  
## Backlog em Story cards
<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/Story%20cards.png" alt="Sublime's custom image?w=100"height="600" width="980" />    
  
  
## Escopo de Recursos
 - ✔️ Conexão SGBD;
 - ✔️ Coleta e consulta de métricas;
 - ✔️ Interface inicial configurável;
 - ✔️ Tratamento de métricas de forma tabular;  
 - ✔️ Salvar consultas em CSV;
 - ✔️ Tabular métricas;  
 - ✔️ Banco Simples (SQlite3);
 - ✔️ Métricas de queries lentas;
 - ✔️ Métricas de uso de índices;
 - ✔️ Métricas de trasações (rollbacks);
 - ✔️ Métricas de armazenamento de índices;
 - ✔️ Métricas de armazenamento dos bancos;
 - ✔️ Configuração de exibição
 - ✔️ Rotina de coleta e armazenamento de métricas
 - ✔️ Conexão banco simples
 - ✔️ Armazenar estatísticas
 - ✔️ Configuração de alertas por email;
 - ✔️ Configuração de queries lentas;
 - ✔️ Relatórios diários;

## Roadmap
<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/Roadmap.jpg" alt="Sublime's custom image?w=100"height="400" width="990" />  
   
 
## Tecnologias

 - Para organização do projeto: [Trello](https://trello.com/?gclid=729c0adf2ce81b5be65b6b9969dc733f&gclsrc=3p.ds&&adgroup=1306220046076922&campaign=380782742&creative=81638805091294&device=c&keyword=trello&ds_k=trello&matchtype=e&network=o&ds_kids=p54670250478&ds_e=MICROSOFT&ds_eid=700000001738798&ds_e1=MICROSOFT&msclkid=729c0adf2ce81b5be65b6b9969dc733f).  
 - Para desenvolvimento do protótipo: [Figma](https://www.figma.com/file/d9FFlhvqzrC0eJ78MLyrnh/Figma-Admin-Dashboard-UI-Kit-(Community)?node-id=4855%3A97).  
 - Para comunicação: [Slack](https://app.slack.com/client/T02BFJJUG22/C02BFJQDQ22).  
 - Para reuniões: [Google Meet](https://meet.google.com). 
 - Para organização das tarefas: [Google Sheets](https://docs.google.com/spreadsheets/d/1R_NrOvCbuW5_c-xeFrFmDRHBfWwYttFWlmTgW5oBQmI/edit#gid=0).  
 - Para gerenciar o banco de dados: [PostgreSQL](https://www.postgresql.org).
 - Para desenvolvimento do código: [Eclipse](https://www.eclipse.org/downloads/).
 - DB Browser (SQlite): [SQlite](https://sqlitebrowser.org/dl/).
 
 
## Ilustração
 
 Para acessar o vídeo de demonstração da aplicação em uso, clique [aqui](https://www.youtube.com/watch?v=IhyabBKAMbA).
 
## Cronograma do API
 
| Data | Evento |
| -------| --------- |
| 16/08 a 22/08 | Project kick-off. |
| 30/08 a 19/09 | [Sprint 1](https://github.com/DolphinDatabase/SGBD_Health/tree/Sprint-1). |
| 20/09 a 10/10 | [Sprint 2](https://github.com/DolphinDatabase/SGBD_Health/tree/Sprint-2). |
| 18/10 a 07/11 | [Sprint 3](https://github.com/DolphinDatabase/SGBD_Health/tree/Sprint-3). |
| 08/11 a 28/11 | [Sprint 4](https://github.com/DolphinDatabase/SGBD_Health/tree/Sprint-4). |
| 29/11 a 05/12 | Apresentação Final. |
| 16/12 às 19h | Feira de Soluções. |

## Dev Team 

Para acessar, clique [aqui](https://github.com/DolphinDatabase/Database-Scan/wiki/DEV_TEAM). 

## Autor
 
<p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/me.jpg" alt="Sublime's custom image?w=100"height="100" width="100" />
</p> 
<p align="left">
 
  [![Linkedin Badge](https://img.shields.io/badge/-Neylkson-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/neylkson-diniz-a3b9396b/)](https://www.linkedin.com/in/neylkson-diniz-a3b9396b/)
  [![Gmail Badge](https://img.shields.io/badge/-neyo.diniz@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:neyo.diniz@gmail.com)](mailto:neyo.diniz@gmail.com)
 
## Licença  

Este projeto esta sob licença [MIT](https://github.com/DolphinDatabase/SGBD_Health/blob/main/LICENSE).
