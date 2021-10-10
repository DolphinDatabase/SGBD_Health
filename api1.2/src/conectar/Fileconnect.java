package conectar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
import java.util.Scanner;

public class Fileconnect {

public static String connection;
public static String user;
public static String pass;
public static File outfile;
public static FileWriter fw;
public static BufferedWriter bw;
static String filepath = "parametro.txt";


public static Connection getconnection() {
	
	return null;
}


//BUSCA E LE ARQUIVO CONEXAO
public Connection read() throws FileNotFoundException, IOException{
	
	FileWriter fw = new FileWriter(filepath,true);
	BufferedWriter bw = new BufferedWriter(fw);
	Scanner scan = new Scanner(System.in);
	BufferedReader br = new BufferedReader(new FileReader(filepath));
	Properties p = new Properties();
	p.load(br);
	String connection=p.getProperty("connection");
	String user=p.getProperty("user");
	String pass=p.getProperty("pass");
	
	try {
		String driver = "org.postgresql.Driver";
		Class.forName(driver);
		return DriverManager.getConnection(connection,user,pass);
		
	} catch(Exception e){
		e.printStackTrace();
	}
	
	return null;
	
	
	
}
	
}
