package pe.edu.upn.programandoando.service;

import java.util.ArrayList;
import java.util.List;
import pe.edu.upn.programandoando.dto.VentaDto;

class VentaDatos {

	private VentaDatos() {
	}
	
	static List<VentaDto> ventas;
	
	static {
		ventas = new ArrayList<>();
	}

}
