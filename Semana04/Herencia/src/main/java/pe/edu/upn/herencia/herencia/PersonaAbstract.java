
package pe.edu.upn.herencia.herencia;

public abstract class PersonaAbstract {
	
	public Long factorial(int n){
		long f = 1;
		for(int i=2;i<=n;f*=i++);
		return f;
	}
	
	public abstract void mostrarDatos();

}
