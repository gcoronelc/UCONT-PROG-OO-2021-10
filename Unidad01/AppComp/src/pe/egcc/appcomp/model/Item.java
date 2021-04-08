package pe.egcc.appcomp.model;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class Item {

   private String concepto;
   private Double importe;

   public Item() {
   }

   public Item(String concepto, Double importe) {
      this.concepto = concepto;
      this.importe = importe;
   }

   public String getConcepto() {
      return concepto;
   }

   public void setConcepto(String concepto) {
      this.concepto = concepto;
   }

   public Double getImporte() {
      return importe;
   }

   public void setImporte(Double importe) {
      this.importe = importe;
   }

}
