package pe.edu.uni.practica03.prueba;

import pe.edu.uni.practica03.dto.PagoDto;
import pe.edu.uni.practica03.service.Practica03Service;

public class PruebaPractica03 {

	public static void main(String[] args) {

		// Variable
		PagoDto dto = new PagoDto();
		
		// Datos
		dto.setDias(25);
		dto.setHorasDia(6);
		dto.setPagoHora(180.0);
		
		// Proceso
		Practica03Service service = new Practica03Service();
		dto = service.procSalario(dto);

		// Reporte
		System.out.println("Ingresos: " + dto.getIngreso());
		System.out.println("Renta: " + dto.getRenta());
		System.out.println("Neto: " + dto.getNeto());


	}

}
