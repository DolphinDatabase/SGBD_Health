package conectar;

import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Csv {

	
	private static final String HORIZONTAL_SEP = "-";
    private String verticalSep;
    private String joinSep;
    private String[] headers;
    private List<String[]> rows = new ArrayList<>();
    private boolean rightAlign;
	static String filepath = "armazenamento.csv";
	static String filepath2 = "query.csv";
	static String filepath3 = "indices.csv";
	static String filepath4 = "transacao.csv";
	
	
	
    public Csv() {
        setShowVerticalLines(false);
    }

    public void setRightAlign(boolean rightAlign) {
        this.rightAlign = rightAlign;
    }

    public void setShowVerticalLines(boolean showVerticalLines) {
        verticalSep = showVerticalLines ? "|" : "";
        joinSep = showVerticalLines ? "+" : " ";
    }

    public void setHeaders(String... headers) {
        this.headers = headers;
    }

    public void addRow(String... cells) {
        rows.add(cells);
    }

    public void print() {
        int[] maxWidths = headers != null ?
                Arrays.stream(headers).mapToInt(String::length).toArray() : null;

        for (String[] cells : rows) {
            if (maxWidths == null) {
                maxWidths = new int[cells.length];
            }
            if (cells.length != maxWidths.length) {
                throw new IllegalArgumentException("Number of row-cells and headers should be consistent");
            }
            for (int i = 0; i < cells.length; i++) {
                maxWidths[i] = Math.max(maxWidths[i], cells[i].length());
            }
        }

        if (headers != null) {
            printLine(maxWidths);
            printRow(headers, maxWidths);
            printLine(maxWidths);
        }
        for (String[] cells : rows) {
            printRow(cells, maxWidths);
        }
        if (headers != null) {
            printLine(maxWidths);
        }
    }

    private void printLine(int[] columnWidths) {
        for (int i = 0; i < columnWidths.length; i++) {
            String line = String.join("", Collections.nCopies(columnWidths[i] +
                    verticalSep.length() + 1, HORIZONTAL_SEP));
            System.out.print(joinSep + line + (i == columnWidths.length - 1 ? joinSep : ""));
        }
        System.out.println();
    }

    private void printRow(String[] cells, int[] maxWidths) {
        for (int i = 0; i < cells.length; i++) {
            String s = cells[i];
            String verStrTemp = i == cells.length - 1 ? verticalSep : "";
            if (rightAlign) {
                System.out.printf("%s %" + maxWidths[i] + "s %s", verticalSep, s, verStrTemp);
            } else {
                System.out.printf("%s %-" + maxWidths[i] + "s %s", verticalSep, s, verStrTemp);
            }
        }
        System.out.println();
    }
    
    protected static void selecionar(String select, Connection c, int i, int j, String[] quantidadeColuna,
			String tituloCsv, String[] tituloCosole, String filepath, int print, int salvar)
			throws SQLException, IOException {

		PreparedStatement stmt = c.prepareStatement(select);
		ResultSet result = stmt.executeQuery();
		if (salvar == 1) {
			Csv st = new Csv();
			st.setHeaders(tituloCosole);
			st.setShowVerticalLines(true);
			FileWriter fw = new FileWriter(filepath, true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			Reader reader = new FileReader(filepath);
			int readSize = reader.read();
			if (readSize == -1) {
				pw.println(tituloCsv);

			}
			int k = 0;

			while (result.next()) {

				if (i == 4 && j == 6) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", "").substring(0, 25)
							+ "...");
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);

				} else if (i == 4 && j == 7) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2).replaceAll("\\r\\n|\\n", ""));
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);
				} else if (i == 4) {
					quantidadeColuna[i - 4] = (result.getString(i - 3));
					quantidadeColuna[i - 3] = (result.getString(i - 2));
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 4], quantidadeColuna[i - 3], quantidadeColuna[i - 2],
							quantidadeColuna[i - 1]);

				} else if (i == 3) {
					quantidadeColuna[i - 3] = (result.getString(i - 2));
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 3], quantidadeColuna[i - 2], quantidadeColuna[i - 1]);

				} else if (i == 2) {
					quantidadeColuna[i - 2] = (result.getString(i - 1));
					quantidadeColuna[i - 1] = (result.getString(i));
					st.addRow(quantidadeColuna[i - 2], quantidadeColuna[i - 1]);
				}

				try {

					LocalDateTime ldtNow = LocalDateTime.now();
					if (i == 4 && j == 6) {
					}
					else if (i == 3 && j == 8) {
					
					}
					else if (i == 4 && j == 9) {
						
					}
					else if (i == 4) {
						pw.println(quantidadeColuna[i - 4] + ";" + quantidadeColuna[i - 3] + ";"
								+ quantidadeColuna[i - 2] + ";" + quantidadeColuna[i - 1] + ";" + ldtNow);
					
					} else if (i == 4 && j == 7) {
						pw.println(quantidadeColuna[i - 4] + ";" + quantidadeColuna[i - 3] + ";"
								+ quantidadeColuna[i - 2] + ";" + quantidadeColuna[i - 1] + ";" + ldtNow);
					} else if (i == 3 && j == 9) {
						pw.println(quantidadeColuna[i - 3] + ";" + quantidadeColuna[i - 2] + ";"
								+ quantidadeColuna[i - 1] + ";" + ldtNow);
					} else if (i == 2) {
						pw.println(quantidadeColuna[i - 2] + ";" + quantidadeColuna[i - 1] + ";" + ldtNow);
					}
					pw.flush();

				} catch (Exception e) {

				}
			}
			if (print == 1) {
				st.print();
			}
		}
	}

}

	
