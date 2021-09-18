package api;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Conexao {
    
	String url="jdbc:postgresql://localhost:5432/";
   	String usuario="postgres";
	String senha="stephani";
	 
	
	public String getUrl() {
		return url;
	}


	public void setUrl(String url) {
		this.url = url;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	public String getSenha() {
		return senha;

	}


	public void setSenha(String senha) {
		this.senha = senha;
	}


	public  Connection conecta() throws SQLException {
		System.out.println("conectado");
		
		return DriverManager
				.getConnection(url, usuario, senha);
    
		
    }
	

}
