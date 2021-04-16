package pe.egcc.notasapp.controller;

import pe.egcc.notasapp.dto.NotasDto;
import pe.egcc.notasapp.excepcion.NotaFueraDeRango;
import pe.egcc.notasapp.service.NotasService;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class NotasController {

   public NotasDto procesarNotas(NotasDto dto) throws NotaFueraDeRango{
      NotasService service = new NotasService();
      dto = service.procesarNotas(dto);
      return dto;
   }
}
