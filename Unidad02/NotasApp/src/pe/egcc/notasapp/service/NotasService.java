package pe.egcc.notasapp.service;

import java.util.Arrays;
import pe.egcc.notasapp.dto.NotasDto;
import pe.egcc.notasapp.excepcion.NotaFueraDeRango;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class NotasService {

   public NotasDto procesarNotas(NotasDto dto) throws NotaFueraDeRango{
      // Validación
      validarNotas(dto);
      // Proceso
      int ppe = obtenerPCMenor(dto);
      int pp = calcularPP(dto);
      int pf = (pp + dto.getEp() + 2 * dto.getEf()) / 4;
      String estado = "Aprobado";
      if( pf < 14){
         estado = "Desaprobado";
      }
      // Reporte
      dto.setPce(ppe);
      dto.setPp(pp);
      dto.setPf(pf);
      dto.setEstado(estado);
      return dto;
   }

   private int obtenerPCMenor(NotasDto dto) {
      int[] notas = {dto.getPc1(), dto.getPc2(), dto.getPc3(), dto.getPc4()};
      Arrays.sort(notas);
      return notas[0];
   }

   private int calcularPP(NotasDto dto) {
      int pp = (dto.getPc1() + dto.getPc2() + dto.getPc3() 
              + dto.getPc4() - obtenerPCMenor(dto))/3;
      return pp;   
   }

   private void validarNotas(NotasDto dto) throws NotaFueraDeRango {
      int[] notas = {dto.getPc1(), dto.getPc2(), dto.getPc3(), 
         dto.getPc4(), dto.getEp(), dto.getEf()};
      for (int nota : notas) {
         if(nota < 0 || nota > 20){
            throw new NotaFueraDeRango();
         }
      }
   }

}
