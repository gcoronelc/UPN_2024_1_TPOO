
package pe.edu.upn.proy3_aaaaa.service;

public class MateService {
	
	
	public double potencia(double base, int expo){
		double p = 1;
		for(int i=1; i <= expo; i++){
			p *= base;
		}
		return p;
	}
	

}
