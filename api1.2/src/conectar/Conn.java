package conectar;

import java.io.IOException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conn {
	
	public static Connection getConnection() {
		
		Fileconnect connect = new Fileconnect();
		try {
			return connect.read();
			
		}catch (IOException ex) {
			Logger.getLogger(Conn.class.getName()).log(Level.SEVERE,null,ex);
		}
		
		return null;
	}
	

}