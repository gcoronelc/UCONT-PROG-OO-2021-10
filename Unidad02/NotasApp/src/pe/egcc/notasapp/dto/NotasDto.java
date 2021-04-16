package pe.egcc.notasapp.dto;

/**
 *
 * @author Gustavo Coronel
 * @blog gcoronelc.blogspot.com
 * @email gcoronelc@gmail.com
 */
public class NotasDto {

   // Datos de Entrada
   private int pc1;
   private int pc2;
   private int pc3;
   private int pc4;
   private int ep;
   private int ef;

   // Datos de Salida
   private int pce;
   private int pp;
   private int pf;
   private String estado;

   public NotasDto() {
   }

   public NotasDto(int pc1, int pc2, int pc3, int pc4, int ep, int ef) {
      this.pc1 = pc1;
      this.pc2 = pc2;
      this.pc3 = pc3;
      this.pc4 = pc4;
      this.ep = ep;
      this.ef = ef;
   }

   public int getPc1() {
      return pc1;
   }

   public void setPc1(int pc1) {
      this.pc1 = pc1;
   }

   public int getPc2() {
      return pc2;
   }

   public void setPc2(int pc2) {
      this.pc2 = pc2;
   }

   public int getPc3() {
      return pc3;
   }

   public void setPc3(int pc3) {
      this.pc3 = pc3;
   }

   public int getPc4() {
      return pc4;
   }

   public void setPc4(int pc4) {
      this.pc4 = pc4;
   }

   public int getEp() {
      return ep;
   }

   public void setEp(int ep) {
      this.ep = ep;
   }

   public int getEf() {
      return ef;
   }

   public void setEf(int ef) {
      this.ef = ef;
   }

   public int getPce() {
      return pce;
   }

   public void setPce(int pce) {
      this.pce = pce;
   }

   public int getPp() {
      return pp;
   }

   public void setPp(int pp) {
      this.pp = pp;
   }

   public int getPf() {
      return pf;
   }

   public void setPf(int pf) {
      this.pf = pf;
   }

   public String getEstado() {
      return estado;
   }

   public void setEstado(String estado) {
      this.estado = estado;
   }

}
