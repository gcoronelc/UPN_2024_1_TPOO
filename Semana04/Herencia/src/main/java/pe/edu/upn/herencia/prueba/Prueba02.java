
package pe.edu.upn.herencia.prueba;

import pe.edu.upn.herencia.herencia.Clase1;
import pe.edu.upn.herencia.herencia.Clase2;

public class Prueba02 {
	
	public static void main(String[] args) {
		
		Clase1 bean = new Clase2();
		int suma = bean.sumar(8, 5);
		System.out.println("8 + 5 = " + suma);
		
	}

}
