package pe.edu.uni.practica03.service;

import pe.edu.uni.practica03.dto.PagoDto;

public class Practica03Service {

	public PagoDto procSalario(PagoDto dto) {
		// Variables
		double ingresos, renta, neto;
		// Proceso
		ingresos = dto.getDias() * dto.getHorasDia() * dto.getPagoHora();
		renta = 0.0;
		if(ingresos > 1500){
			renta = ingresos * 0.08;
		}
		neto = ingresos - renta;
		// Reporte
		dto.setIngreso(ingresos);
		dto.setRenta(renta);
		dto.setNeto(neto);
		return dto;
	}

	
	
}
