<p align="center">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/Logo.jpg" />
</p>
<h1 align="center"> SGBD Health </h1>  

> ![Badge](https://img.shields.io/badge/STATUS-EM%20DESENVOLVIMENTO-yellow)

## Tabela de Conteúdos

 * [Descrição](#descrição)
 * [Backlog Product](#backlog-product)  
 * [Pré-requisitos e como rodar a aplicação/testes](#Pré-requisitos_e_como_rodar_a_aplicaão_/_testes)
 * [Escopo de Recursos](#escopo-de-recursos)  
 * [Dependências e Tecnologias](#dependências-e-tecnologias)
 * [Cronograma do API](#cronograma-do-api)
 * [Dev Team](#dev-team)
 * [Autor](#Autor)
 * [Licença](#Licença)


## Descrição

<p align="justify">É uma aplicação de monitoramento voltada somente a SGBDs, focada na performance/desempenho. Através da coleta de dados do SGBD (memória, tempo de consultas, espaço em disco, transações, evolução da memória, caches e registros) que influenciam na saúde e manutenção periódica.


## Backlog Product
 
 - Conexão SGBD
 - Coleta de métricas de uma ou mais SGBDs (PostgreSQL) remoto;
 - Tratamento das métricas (histórico, registro, relatórios, disponibilidade, alertas e valores atingidos durante a operação)
   - Coleta periódico de métricas 
   - Histórico de métricas
   - Relatórios de métricas
   - Alertas de espaço em disco do SGBD
   - Funcionamento do BD (tempo de queries, quantidade de queries, uso de índices)
 - Plotagem de gráficos através de um dashboard/interface
   - Interface gráfica inicial
 - Cadastro de dados de conexão dos SGBDs (acesso a estastítica por tabelas)

## Pré-requisitos e como rodar a aplicação/testes
  
  ### Para acessar o arquivo [executável](https://github.com/DolphinDatabase/SGBD_Health/blob/main/Back%20end/c%C3%B3digoapi/api.jar) 
  
  Para os dados obtidos na aplicação:
  - Coletor de estatísticas e todas as métricas [acesse](https://www.postgresql.org/docs/9.6/monitoring-stats.html)  
  - Consulta relacionada a primeira métrica [acesse](https://www.postgresql.org/docs/9.5/pgstatstatements.html)  
  - Tutorial para consultar a primeira métrica [acesse](https://www.oreilly.com/library/view/mastering-postgresql-96/9781783555352/eb2d7469-fc3b-4b23-a1a7-9272ac0268f8.xhtml)  
  - Para passar os parâmetros [acesse](https://devtools.com.br/blog/alterando-a-senha-do-usuario-postgres/)  
    - url="jdbc:potgresql://localhost:5432/";
    - usuario="postgres;
    - senha="postgre"

## Escopo de Recursos
 - [X] Conexão SGBD
 - [X] Coleta e consulta de métricas
 - [X] Interface inicial

 
## Dependências e Tecnologias

 - Para organização do projeto [Trello](https://trello.com/?gclid=729c0adf2ce81b5be65b6b9969dc733f&gclsrc=3p.ds&&adgroup=1306220046076922&campaign=380782742&creative=81638805091294&device=c&keyword=trello&ds_k=trello&matchtype=e&network=o&ds_kids=p54670250478&ds_e=MICROSOFT&ds_eid=700000001738798&ds_e1=MICROSOFT&msclkid=729c0adf2ce81b5be65b6b9969dc733f)  
 - Para desenvolvimento do protótipo [Figma](https://www.figma.com/file/d9FFlhvqzrC0eJ78MLyrnh/Figma-Admin-Dashboard-UI-Kit-(Community)?node-id=4855%3A97)  
 - Para comunicação [Slack](https://app.slack.com/client/T02BFJJUG22/C02BFJQDQ22)  
 - Para reuniões [Google Meet](https://meet.google.com) 
 - Para organização das tarefas [Google Sheets](https://docs.google.com/spreadsheets/d/1R_NrOvCbuW5_c-xeFrFmDRHBfWwYttFWlmTgW5oBQmI/edit#gid=0)  
 - [PostgreSQL](https://www.postgresql.org)
 - Para desenvolvimento do código [Eclipse](https://www.eclipse.org/downloads/)
 
 
## Ilustração
 
 Para ver o desenvolvimento protótipo da aplicação clique [aqui](https://youtu.be/8wiEfhklJik)
 
## Cronograma do API
 
| Data | Evento |
| -------| --------- |
| 16/08 a 22/08 | Project kick-off |
| 30/08 a 19/09 | [Sprint 1](https://github.com/DolphinDatabase/SGBD_Health/tree/Sprint-1) |
| 20/09 a 10/10 | Sprint 2 |
| 18/10 a 07/11 | Sprint 3 |
| 08/11 a 28/11 | Sprint 4 |
| 29/11 a 05/12 | Apresentação Final |
| 16/12 às 19h | Feira de Soluções |

## Dev Team

Para acessar clique [aqui](https://github.com/DolphinDatabase/Database-Scan/wiki/DEV_TEAM) 

## Autor
 
<p align="left">
  <img src="https://github.com/DolphinDatabase/SGBD_Health/blob/main/Images/me.jpg" alt="Sublime's custom image?w=100"height="100" width="100" />
</p> 
<p align="left">
 
 
## Licença  

Este projeto esta sob licença [MIT](https://github.com/DolphinDatabase/SGBD_Health/blob/main/LICENSE)
