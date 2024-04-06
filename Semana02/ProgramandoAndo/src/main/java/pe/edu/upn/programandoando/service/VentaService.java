
package pe.edu.upn.programandoando.service;

import pe.edu.upn.programandoando.dto.VentaDto;

public class VentaService {
	
	public VentaDto procesarVenta(VentaDto dto){
		// Variables
		double importe;
		double impuesto;
		double total;
		// Proceso
		importe = 0;
		impuesto = 0;
		total = 0;
		// Reporte
		dto.setImporte(importe);
		dto.setImpuesto(impuesto);
		dto.setTotal(total);
		return dto;
	}

}
