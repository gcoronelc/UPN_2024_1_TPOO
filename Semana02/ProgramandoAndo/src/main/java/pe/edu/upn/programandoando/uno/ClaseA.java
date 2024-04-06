
package pe.edu.upn.programandoando.uno;

public class ClaseA {

	private int n1;
	int n2;
	protected int n3;
	public int n4;

	/**
	 * Constructor por defecto.
	 */
	public ClaseA() {
		System.out.println("Constructor de ClaseA");
		this.n1 = 80;
		this.n2 = 90;
		this.n3 = 40;
		this.n4 = 70;
	}
	
	

	public void metodoA() {
		System.out.println("n1: " + n1);
		System.out.println("n2: " + n2);
		System.out.println("n3: " + n3);
		System.out.println("n4: " + n4);
	}

}
