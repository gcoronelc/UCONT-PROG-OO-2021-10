package pe.uni.eurekaapp.pruebas;

import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba14 {

    public static void main(String[] args) {
		 try {
			 HSSFWorkbook libro = new HSSFWorkbook();
			 HSSFSheet hoja = libro.createSheet("DEMO");
			 // Fila de cabecera
			 HSSFRow fila = hoja.createRow(0);
			 crearCeldaCadena(fila, 0, "ESTUDIANTE");
			 crearCeldaCadena(fila, 1, "NOTA");
			 // Estudiante 1
			 fila = hoja.createRow(1);
			 crearCeldaCadena(fila, 0, "GUSTAVO");
			 crearCeldaEntero(fila, 1, 20);
			 // Estudiante 2
			 fila = hoja.createRow(2);
			 crearCeldaCadena(fila, 0, "KARLA");
			 crearCeldaEntero(fila, 1, 18);
			 // Estudiante 3
			 fila = hoja.createRow(3);
			 crearCeldaCadena(fila, 0, "RICARDO");
			 crearCeldaEntero(fila, 1, 19);
			 // Grabar libro
			 String strNombreArchivo = "E:\\DEMO01.xls";
			 File objFile = new File(strNombreArchivo);
			 FileOutputStream archivoSalida = new FileOutputStream(objFile);
			 libro.write(archivoSalida);
			 archivoSalida.close();
			 System.out.println("Todo ok");
		 } catch (Exception e) {
			 e.printStackTrace();
		 }
    }

	private static void crearCeldaCadena(HSSFRow fila, int numCelda, String dato) {
		HSSFCell celda = fila.createCell(numCelda, HSSFCell.CELL_TYPE_STRING);
		celda.setCellValue(dato);
	}

	private static void crearCeldaEntero(HSSFRow fila, int numCelda, int dato) {
		HSSFCell celda = fila.createCell(numCelda, HSSFCell.CELL_TYPE_NUMERIC);
		HSSFCellStyle style = fila.getSheet().getWorkbook().createCellStyle();
		style.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
		celda.setCellStyle(style);
		celda.setCellValue(dato);
	}

}
