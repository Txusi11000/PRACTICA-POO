public abstract class Tapiceria {
    String color;
    int metrosCuadrados;
    String referencia;

    public Tapiceria (String color, int metrosCuadrados, String referencia) {
        setColor(color);
        setMetrosCuadrados(metrosCuadrados);
    }

    public void setColor(String color) {
        if (color != null && !color.trim().isEmpty()) {
            this.color = color;
        } else {
            System.out.println("El color introducido no es correcto");
        }
    }

    public void setMetrosCuadrados(int metrosCuadrados) {
        if (metrosCuadrados >= 1 && metrosCuadrados < 30) {
            this.metrosCuadrados = metrosCuadrados;
        } else {
            System.out.println("Los metros cuadrados introducidos no son validos.");
        }
    }

    public void setReferencia(String referencia) {
        if (referencia != null && !referencia.trim().isEmpty()) {
            this.referencia = referencia;
        } else {
            System.out.println("Referencia de tapiceria no valida");
        }
    }

    public String getColor() {
        return color;
    }

    public int getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public String getReferencia() {
        return referencia;
    }

    public abstract String imprimirColor();
    
}
