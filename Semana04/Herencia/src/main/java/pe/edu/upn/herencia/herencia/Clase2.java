
package pe.edu.upn.herencia.herencia;

public class Clase2 extends Clase1 {

	private String nombre = "Claudia";
	
	public Clase2() {
		super("Causita");
		System.out.println("Hola Batería!!!");
	}

	@Override
	public int sumar(int n1, int n2) {
		//return (n1 + n2) * (n1 - n2); 
		return super.sumar(n1, n2) * (n1 - n2);
	}

	public void mensaje(){
		System.out.println("Bien " + super.nombre + " y " + this.nombre + "!!!");
	}
}
