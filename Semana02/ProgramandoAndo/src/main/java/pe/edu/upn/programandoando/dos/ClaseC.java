
package pe.edu.upn.programandoando.dos;

import pe.edu.upn.programandoando.uno.ClaseA;

public class ClaseC extends ClaseA{
	
	private int n3 = 500;

	public void metodoC() {
		int n3 = 1000;
		ClaseA o = new ClaseA();
		//System.out.println("n1: " + o.n1);
		//System.out.println("n2: " + o.n2);
		System.out.println("n3 (local): " + n3);
		System.out.println("n3 (Clase): " + this.n3);
		System.out.println("n3 (Herencia): " + super.n3);
		System.out.println("n4: " + o.n4);
	}
}
