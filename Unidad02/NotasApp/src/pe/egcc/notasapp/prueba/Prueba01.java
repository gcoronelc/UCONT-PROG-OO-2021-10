package pe.egcc.notasapp.prueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import pe.egcc.notasapp.dto.NotasDto;
import pe.egcc.notasapp.excepcion.NotaFueraDeRango;
import pe.egcc.notasapp.service.NotasService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class Prueba01 {
   
   public static void main(String[] args) {
      try {
         // Datos
         NotasDto dto = new NotasDto();
         dto.setPc1(12);
         dto.setPc2(15);
         dto.setPc3(8);
         dto.setPc4(16);
         dto.setEp(12);
         dto.setEf(15);
         // Proceso
         NotasService service = new NotasService();
         dto = service.procesarNotas(dto);
         // Reporte
         System.out.println("Practica eliminada: " + dto.getPce());
         System.out.println("Promedio Practicas: " + dto.getPp());
         System.out.println("Promedio final: " + dto.getPf());
         System.out.println("Estado: " + dto.getEstado());
      } catch (NotaFueraDeRango ex) {
         System.err.println(ex.getMessage());
      }
   }

}
