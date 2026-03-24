public class Tela extends Tapiceria {
    public Tela(String color, int metrosCuadrados) {
        super(color, metrosCuadrados);
    }

    @Override
    public String imprimirColor() {
        return "El color de la tela es: " + getColor();
    }
    
}
