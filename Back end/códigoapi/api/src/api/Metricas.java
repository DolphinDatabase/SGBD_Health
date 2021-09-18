package api;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Metricas {
	
	
    
    public String  retornaMetrica(String valor, int i) throws SQLException {
    	//conexao
		Conexao conectando = new Conexao();
		Connection connnection = conectando.conecta();

		PreparedStatement stmt = connnection.prepareStatement("select "+ valor);

		ResultSet result = stmt.executeQuery();
		StringBuilder sb = new StringBuilder("");

		switch (i) {
		case 1:
			while (result.next()) {

				sb.append(result.getString(1));

				System.out.println(sb.toString());

			}

			break;

		case 2:
			while (result.next()) {

				sb.append(result.getString(1));
				sb.append(result.getString(2));
				sb.append(result.getString(3));
				sb.append("\r\n");
				sb.append(result.getString(4));
				sb.append(result.getString(5));
				sb.append(result.getString(6));
				sb.append(result.getString(7));

				System.out.println(sb.toString());

			}

			break;

		case 3:
			while (result.next()) {

				sb.append( result.getString(1));
				sb.append(result.getString(2));
				sb.append(result.getString(3));
				sb.append("\r\n");
				sb.append(result.getString(4));
				sb.append(result.getString(5));
				sb.append(result.getString(6));
				sb.append(result.getString(7));
				sb.append(result.getString(8));
				sb.append(result.getString(9));
				sb.append(result.getString(10));
				sb.append(result.getString(11));
				sb.append(result.getString(12));
				sb.append(result.getString(13));
				sb.append(result.getString(14));
				sb.append(result.getString(15));
				sb.append(result.getString(16));
				sb.append(result.getString(17));
				sb.append(result.getString(18));
				sb.append(result.getString(29));
				sb.append(result.getString(20));
				sb.append(result.getString(21));

				System.out.println(sb.toString());

			}

			break;

		case 4:
			while (result.next()) {

				sb.append(result.getString(1));
				sb.append(result.getString(2));
				sb.append(result.getString(3));
				sb.append("\r\n");
				sb.append(result.getString(4));
				sb.append(result.getString(5));
				sb.append(result.getString(6));

				System.out.println(sb.toString());

			}

		
		default:
		}
		return sb.toString();
		
		
		
    }
    
    
	}

