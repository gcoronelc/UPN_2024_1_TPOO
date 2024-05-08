
package pe.edu.upn.eurekaapp.prueba;

import java.sql.Connection;
import pe.edu.upn.eurekaapp.db.AccesoDB;

public class Prueba01 {

	public static void main(String[] args) {
		
		try {
			Connection cn = AccesoDB.getConnection();
			System.out.println("Ok!!!");
			cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
				  
				  
	}
}
