
package pe.edu.upn.herencia.prueba;

import java.beans.Beans;
import pe.edu.upn.herencia.herencia.Clase1;
import pe.edu.upn.herencia.herencia.Clase2;
import pe.edu.upn.herencia.herencia.Clase3;

public class Prueba07 {
	
	public static void main(String[] args) {
		
		Clase1 bean1 = new Clase2();
		Clase2 bean2 = (Clase2) bean1;
		Clase3 bean3;
		//if(bean1 instanceof Clase3){
		if(Beans.isInstanceOf(bean1, Clase3.class)){	
			bean3 = (Clase3) bean1;
		} else{
			System.out.println("No hay compatibilidad!!!");
		}
		
		System.out.println("Aparentemente, todo esta perfecto!!!");
		
	}

}
