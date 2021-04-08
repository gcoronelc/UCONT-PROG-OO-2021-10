package pe.edu.uni.practica03.view;

import java.text.DecimalFormat;
import javax.swing.JTextField;

public class Comunes {
	
	private static int contador;
	
	static {
		contador = 0;
	}
	
	public static int getSiguiente(){
		return (++contador);
	}
	
	public static void validarCajaTexto(JTextField caja, String mensaje) {
		if (caja.getText().isEmpty()) {
			caja.requestFocus();
			throw new RuntimeException(mensaje);
		}
	}

	public static void validarEntero(JTextField caja, String mensaje) {
		try {
			Integer.parseInt(caja.getText());
		} catch (Exception e) {
			caja.requestFocus();
			caja.setText("");
			throw new RuntimeException(mensaje);
		}
	}

	public static void validarDecimal(JTextField caja, String mensaje) {
		try {
			Double.parseDouble(caja.getText());
		} catch (Exception e) {
			caja.requestFocus();
			throw new RuntimeException(mensaje);
		}
	}

	public static boolean isNumeric(String cadena) {
		try {
			Integer.parseInt(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static boolean isDecimal(String cadena) {
		try {
			Double.parseDouble(cadena);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public static String formato(double numero) {
		String pattern = "###,##0.00";
		DecimalFormat decimalFormat = new DecimalFormat(pattern);
		return decimalFormat.format(numero);
	}

}
