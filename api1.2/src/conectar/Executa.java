package conectar;

import java.sql.Connection;
import java.util.Scanner;

public class Executa extends Csv {

	

	public static void main(String[] args) {
       

		try {
			Connection c = Conn.getConnection();
			if (c != null) {
				System.out.println("\nConectado ao Servidor\n");
				Scanner menu = new Scanner(System.in);

				while (true) {
					System.out.print("\n");
					System.out.print("##----SELEÇÃO DE MÉTRICAS----##\n");
					System.out.print("+-----------------------------+\n");
					System.out.print("| Opção 1 - Armazenamento     |\n");
					System.out.print("| Opção 2 - Querys            |\n");
					System.out.print("| Opção 3 - Indices           |\n");
					System.out.print("| Opção 4 - Transações        |\n");
					System.out.print("| Opção 5 - Sair              |\n");
					System.out.print("+-----------------------------+\n\n");
					System.out.print("Digite uma opção: ");

					int opcao = menu.nextInt();

					if (opcao == 5) {
						System.out.print("\nAté logo!\n\n");
						menu.close();
						break;
					}

					String tituloCsv, select;
					String[] quantidadeColuna;
					String[] tituloCosole;
					int salvar;
					int i;
					int j = 0;
					int print;


					switch (opcao) {
					case 1:

						tituloCsv = "banco_dados" + ";" + "tamanho" + ";" + "data_hora";
						salvar = 1;
						select = "select t1.datname AS db_name, pg_size_pretty(pg_database_size(t1.datname)) as db_size\r\n"
								+ "from pg_database t1 order by pg_database_size(t1.datname) desc";
						i = 2;
						print = 1;
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];
						tituloCosole[0] = "banco_dados";
						tituloCosole[1] = "tamanho";

						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						break;

					case 2:

						tituloCsv = "query_id" + ";" + "query" + ";" + "calls" + ";" + "tempo" + ";" + "data_hora";
						salvar = 1;
						select = "select queryid, query, calls, total_exec_time from pg_stat_statements order by total_exec_time desc limit 5 ";
						i = 4;
						j = 6;
						print = 1;
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];
						tituloCosole[0] = "queryid";
						tituloCosole[1] = "query";
						tituloCosole[2] = "calls";
						tituloCosole[3] = "tempo";

						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath2, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}
						
						
						tituloCsv = "query_id" + ";" + "query" + ";" + "calls" + ";" + "tempo" + ";" + "data_hora";
						salvar = 1;
						select = "select queryid, query, calls, total_exec_time from pg_stat_statements order by total_exec_time desc";
						i = 4;
						j = 7;
						print = 0;
						
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];
		

						try {
							selecionar(select, c, i,j, quantidadeColuna, tituloCsv, tituloCosole, filepath2, print, salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}


						break;

					case 3:

						tituloCsv = "index_id" + ";" + "index" + ";" + "read" + ";" + "hit" + ";" + "data_hora";
						salvar = 1;
						select = "select indexrelid, indexrelname, idx_blks_read, idx_blks_hit from pg_statio_all_indexes order by idx_blks_read, idx_blks_hit desc limit 5";
						i = 4;
						j = 9;
						
						print = 1;
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];
						tituloCosole[0] = "index_id";
						tituloCosole[1] = "index";
						tituloCosole[2] = "read";
						tituloCosole[3] = "hit";

						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath3, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}


						tituloCsv = "index_id" + ";" + "index" + ";" + "read" + ";" + "hit" + ";" + "data_hora";
						salvar = 1;
						select = "select indexrelid, indexrelname, idx_blks_read, idx_blks_hit from pg_statio_all_indexes order by idx_blks_read, idx_blks_hit desc";
						i = 4;
						j = 7;
						
						print = 1;
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];


						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath3, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}
						break;

					case 4:

						tituloCsv = "banco_dados" + ";" + "rollback" + ";" + "commit" + ";" + "data_hora";
						salvar = 1;
						select = "select distinct  datname, xact_rollback, xact_commit from pg_stat_database order by xact_rollback  desc limit 5";
						i = 3;
						j = 8;
						print = 1;
						
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];
						tituloCosole[0] = "banco_dados";
						tituloCosole[1] = "rollback";
						tituloCosole[2] = "commit";

						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath4, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}

						tituloCsv = "banco_dados" + ";" + "rollback" + ";" + "commit" + ";" + "data_hora";
						salvar = 1;
						select = "select distinct  datname, xact_rollback, xact_commit from pg_stat_database order by xact_rollback  desc ";
						i = 3;
						j = 9;
						print = 9;
						
						quantidadeColuna = new String[i];
						tituloCosole = new String[i];


						try {
							selecionar(select, c, i, j, quantidadeColuna, tituloCsv, tituloCosole, filepath4, print,
									salvar);
						} catch (Exception e1) {
							// TODO Auto-generated catch block e1.printStackTrace();
						}

						break;

					default:
						System.out.print("\nOpção Inválida!\n\n");
						break;

					}
				}
			} else {
				System.out.println("Não foi possível efetuar a conexão!");
			}

		} catch (Exception e) {

		}

	}

}
