public class Cuero extends Tapiceria {
    public Cuero (String color, int metrosCuadrados) {
        super(color, metrosCuadrados);
    }
    
    @Override

    public String imprimirColor() {
        return "El color del cuero es: " + getColor();
    }
    
}
