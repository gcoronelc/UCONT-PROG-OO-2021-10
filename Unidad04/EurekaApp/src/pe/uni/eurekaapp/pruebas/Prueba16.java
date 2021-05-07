package pe.uni.eurekaapp.pruebas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
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
public class Prueba16 {

	public static void main(String[] args) {
		try {
			// Obtener libro
			String fileName = "E:\\DEMO01.xls";
			FileInputStream fileInputStream = new FileInputStream(fileName);
			POIFSFileSystem fs = new POIFSFileSystem(fileInputStream);
			HSSFWorkbook libro = new HSSFWorkbook(fs);
			// Obtener referencia a la hoja de trabajo
			HSSFSheet hoja = libro.getSheetAt(0);
			// Mostrar una fila
			HSSFRow fila = hoja.getRow(1);
			HSSFCell celda = fila.getCell(2);
			String valor = celda.toString();
			System.out.println("Valor: " + valor);
			// Toda la hoja
			Iterator rowIterator = hoja.rowIterator();
			int n = 0;
			while (rowIterator.hasNext()) {
				HSSFRow hssfRow = (HSSFRow) rowIterator.next();
				n++;
				if(n<=2){
					continue;
				}
				Iterator iterator = hssfRow.cellIterator();
				while (iterator.hasNext()) {
					HSSFCell hssfCell = (HSSFCell) iterator.next();
					String stringCellValue = hssfCell.toString();
					stringCellValue = String.format("%1$-30s", stringCellValue);
					System.out.print(stringCellValue);
				}
				System.out.println("");
			}
			// Fin
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
