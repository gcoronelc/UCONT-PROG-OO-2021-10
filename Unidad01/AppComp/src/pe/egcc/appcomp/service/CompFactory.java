package pe.egcc.appcomp.service;

/**
 *
 * @author Gustavo Coronel
 * @blog   gcoronelc.blogspot.com
 * @email  gcoronelc@gmail.com
 */
public class CompFactory {

   // Tipos de comprobante
   public static final String COMP_FACTURA = "FACTURA";
   public static final String COMP_BOLETA = "BOLETA";
   
   private CompFactory() {
   }
   
   public static String[] obtenerTipos(){
      String[] tipos = {COMP_FACTURA, COMP_BOLETA};
      return tipos;
   }

   public static CompAbstract obtenerComp(String tipo){
      // Variable
      CompAbstract bean = null;
      // Proceso
      switch(tipo){
         case COMP_FACTURA:
            bean = new FacturaService();
            break;
         case COMP_BOLETA:
            bean = new BoletaService();
            break;
            
      }
      // Retorno
      return bean;
   }
   
}
