package pe.edu.upn.herencia.prueba;

import pe.edu.upn.herencia.herencia.Factura;
import pe.edu.upn.herencia.herencia.PersonaAbstract;

public class Prueba06 {

	public static void main(String[] args) {

		PersonaAbstract bean = new Factura();
		bean.mostrarDatos();
		System.out.println("Factorial de 5: " + bean.factorial(5));

	}

}
