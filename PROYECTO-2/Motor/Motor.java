/**
 * Clase Motor
 * 
 * @author Jesús Macías Durán
 * @version 26/02/2025
 */
public abstract class Motor {
   private double cilindrada;
   private int potencia;
   private int nCilindros;
   private String estado;
   private String referencia;

   public Motor (double cilindrada, int potencia, int nCilindros, String referencia)
   {
    setCilindrada(cilindrada);
    setPotencia(potencia);
    setNCilindros(nCilindros);
    setReferencia(referencia);
    this.estado = "Motor";

   }

   /* GETTERS-SETTERS */
   public void setCilindrada(double cilindrada) {
        if (cilindrada >= 0) {
            this.cilindrada = cilindrada;
        } else {
            System.out.println("La cilindrada introducida no es valida");
        }
    }

    public void setPotencia(int potencia) {
        if (potencia > 0) {
            this.potencia = potencia;
        } else {
            System.out.println("Potencia introducida no valida");
        }
    }

    public void setNCilindros(int nCilindros) {
        if (nCilindros >= 0) {
            this.nCilindros = nCilindros;
        } else {
            System.out.println("Nº cilindros introducida no valida");
        }
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public int getPotencia() {
        return potencia;
    }

    public int getNCilindros() {
        return nCilindros;
    }

    public String getEstado() {
        return estado;
    }

    public void setReferencia(String referencia) {
        if (referencia != null && !referencia.trim().isEmpty()) {
            this.referencia = referencia;
        } else {
            System.out.println("Referencia de motor no valida");
        }
    }

    public String getReferencia() {
        return referencia;
    }

    /* METODO POLIMORFICO */
    public abstract String imprimirPotencia();

}