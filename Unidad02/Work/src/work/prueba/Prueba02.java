package work.prueba;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba02 {

    public static void main(String[] args) {
		 try {
			 int n1, n2, n3;
			 // Datos
			 n1 = 20;
			 n2 = 0;
			 // Proceso
			 n3 = division(n1, n2);
			 // Reporte
			 System.out.println("n3 = " + n3);
		 } catch (RuntimeException e) {
			 System.err.println(e.getMessage());
		 }
    }

	private static int division(int n1, int n2){
		if(n2 == 0){
			throw new RuntimeException("n2 no puede ser 0");
		}
		int r = n1 / n2;
		return r;
	}

}
