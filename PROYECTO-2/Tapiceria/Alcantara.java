public class Alcantara extends Tapiceria {
    public Alcantara (String color, int metrosCuadrados) {
        super(color, metrosCuadrados);
    }

    @Override

    public String imprimirColor() {
        return "El color de la alcantara es: " + getColor();
    }
    
}
