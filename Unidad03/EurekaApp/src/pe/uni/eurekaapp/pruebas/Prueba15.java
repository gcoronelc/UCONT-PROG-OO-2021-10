package pe.uni.eurekaapp.pruebas;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDataFormat;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

/**
 * @author Eric Gustavo Coronel Castillo
 * @blog www.desarrollasoftware.com
 * @email gcoronelc@gmail.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 * @facebook www.facebook.com/groups/desarrollasoftware/
 */
public class Prueba15 {

	public static void main(String[] args) {
		try {
			// Obtener libro
			String plantilla = "/pe/uni/eurekaapp/plantillas/PLANTILLA01.xls";
			InputStream isPlantilla = Class.class.getResourceAsStream(plantilla);
			POIFSFileSystem fs = new POIFSFileSystem(isPlantilla);
			HSSFWorkbook libro = new HSSFWorkbook(fs, true);
			// Obtener referencia a la hoja de trabajo
			HSSFSheet hoja = libro.getSheetAt(0);
			HSSFRow fila;
			// Estudiante 1
			fila = hoja.createRow(2);
			crearCeldaCadena(fila, 0, "GUSTAVO");
			crearCeldaEntero(fila, 1, 20);
			crearCeldaCadena(fila, 2, "APROBADO");
			// Estudiante 2
			fila = hoja.createRow(3);
			crearCeldaCadena(fila, 0, "KARLA");
			crearCeldaEntero(fila, 1, 18);
			crearCeldaCadena(fila, 2, "APROBADO");
			// Estudiante 3
			fila = hoja.createRow(4);
			crearCeldaCadena(fila, 0, "RICARDO");
			crearCeldaEntero(fila, 1, 19);
			crearCeldaCadena(fila, 2, "APROBADO");
			// Estudiante 4
			fila = hoja.createRow(5);
			crearCeldaCadena(fila, 0, "PEDRO");
			crearCeldaEnteroRojo(fila, 1, 10);
			crearCeldaCadena(fila, 2, "DESAPROBADO");
			// Grabar libro
			String strNombreArchivo = "E:\\DEMO01.xls";
			FileOutputStream fileOut = new FileOutputStream(strNombreArchivo);
			libro.write(fileOut);
			fileOut.close();
			System.out.println("Todo ok.");
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
	private static void crearCeldaEnteroRojo(HSSFRow fila, int numCelda, int dato) {
		HSSFCell celda = fila.createCell(numCelda, HSSFCell.CELL_TYPE_NUMERIC);
		HSSFCellStyle style = fila.getSheet().getWorkbook().createCellStyle();
		style.setDataFormat(HSSFDataFormat.getBuiltinFormat("0"));
		HSSFFont fuente = fila.getSheet().getWorkbook().createFont();
		fuente.setColor(HSSFFont.COLOR_RED);
		style.setFont(fuente);
		celda.setCellStyle(style);
		celda.setCellValue(dato);
	}

	
	
}
