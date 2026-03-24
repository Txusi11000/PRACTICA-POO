/**
 * Subclase BiplazaDeportivo
 * 
 * @author Jesús Macías Durán
 * @version 02/03/2025
 */
public class Biplazadeportivo extends Vehiculo
{
    /**
     * Constructor
     */
    public Biplazadeportivo(String color, int nPlazas, float tara, int pesoMaximoAutorizado) {
        super(color, 2, tara, pesoMaximoAutorizado);

    }

    @Override
    public String imprimirEstado() {
        return "Estado del BiplazaDeportivo: " + getEstado();
    }

}