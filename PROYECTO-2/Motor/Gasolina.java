public class Gasolina extends Motor {
    public Gasolina (double cilindrada, int potencia, int nCilindros) {
        super(cilindrada, potencia, nCilindros);
    }

    @Override
    public String imprimirPotencia() {
        return "Potencia del coche = " + getPotencia();
    }
}
