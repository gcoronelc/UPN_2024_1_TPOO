
package pe.edu.upn.programandoando.service;

import java.util.List;
import pe.edu.upn.programandoando.dto.VentaDto;

public class VentaService {

	
	public void initBean() {
		VentaDatos.ventas.add(procesarVenta(new VentaDto("Prod1", 45, 3)));
		VentaDatos.ventas.add(procesarVenta(new VentaDto("Prod2", 34, 6)));
		VentaDatos.ventas.add(procesarVenta(new VentaDto("Prod3", 12, 9)));
		VentaDatos.ventas.add(procesarVenta(new VentaDto("Prod4", 89, 4)));
		VentaDatos.ventas.add(procesarVenta(new VentaDto("Prod5", 67, 10)));
	}
	
	public List<VentaDto> obtenerVenta(){
		return VentaDatos.ventas;
	}
	
	
	public VentaDto procesarVenta(VentaDto dto){
		// Variables
		double importe;
		double impuesto;
		double total;
		// Proceso
		total = dto.getPrecio() * dto.getCantidad();
		impuesto = total / 1.18;
		importe = total - impuesto;
		// Reporte
		dto.setImporte(importe);
		dto.setImpuesto(impuesto);
		dto.setTotal(total);
		return dto;
	}

}
