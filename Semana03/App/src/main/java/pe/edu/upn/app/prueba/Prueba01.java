
package pe.edu.upn.app.prueba;

import java.util.Random;
import javax.swing.JFrame;
import pe.edu.upn.app.App;

public class Prueba01 {

	public static void main(String[] args) {
		
		Object[] notas = new Object[5];
		
		for(int i=0; i < notas.length; i++){
			System.out.println(notas[i]);
		}
		
		notas[0] = new Random() ;
		notas[1] = new String("Gustavo") ;
		notas[2] = new App();
		notas[3] = new JFrame();
		
		
		
	}
}
