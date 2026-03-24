public class Electrico extends Motor {
    public Electrico (int potencia) {
        super(0,potencia,0);
    } 

    @Override
    public String imprimirPotencia() {
        return "Potencia del vehiculo = " + getPotencia();
    }
}
