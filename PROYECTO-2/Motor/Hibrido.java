public class Hibrido extends Motor {

    public Hibrido (double cilindrada, int potencia, int nCilindros) {
        super(cilindrada, potencia, nCilindros);
    }
    
    @Override
    public String imprimirPotencia() {
        return "Potencia del vehiculo = " + getPotencia();
    }
}
