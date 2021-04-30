package pe.ucont.smeapp.prueba;

import pe.ucont.smeapp.service.SMEService;

public class Prueba01 {

	public static void main(String[] args) {
		// Variables
		double saldo;
		// Datos
		// Proceso
		SMEService service = new SMEService();
		
		//obtener saldo
		saldo = service.obtenerSaldo();
		System.out.println("saldo Inicial: " + saldo);
		
		//realizar retiro
		service.realizarRetiro(20);
		System.out.println("retiro: " + 20);

		saldo = service.obtenerSaldo();
		System.out.println("saldo luego del retiro: " + saldo);
		
		// realizar deposito
		service.realizarDeposito(100);
		System.out.println("Depósito: " + 100);
		saldo = service.obtenerSaldo();
		System.out.println("saldo luego del depósito: " + saldo);

	}

}
