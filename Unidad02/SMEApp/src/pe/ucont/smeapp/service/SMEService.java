package pe.ucont.smeapp.service;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class SMEService {
	
	// Producto academico 2
	private static double saldo = 5000;
	
	private static final double SOLES_TO_DOLARES = 3.60;
	private static final double SOLES_TO_EUROS = 4.60;
	
	public double solesToDolares( double valor ){
		double cambio = valor / SOLES_TO_DOLARES;
		return dosDec(cambio);
	}
	
	public double dolaresToSoles( double valor ){
		double cambio = valor * SOLES_TO_DOLARES;
		return dosDec(cambio);
	}
	
	public double solesToEuros( double valor ){
		double cambio = valor / SOLES_TO_EUROS;
		return dosDec(cambio);
	}
	
	public double eurosToSoles( double valor ){
		double cambio = valor * SOLES_TO_EUROS;
		return dosDec(cambio);
	}

	private double dosDec( double valor){
		valor = valor * 100;
		valor = Math.round(valor);
		valor  = valor / 100;
		return valor;
	}
	
}
