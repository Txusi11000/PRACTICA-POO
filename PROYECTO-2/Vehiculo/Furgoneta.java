/**
 * Subclase Furgoneta
 * 
 * @author Jesús Macías Durán
 * @version 02/03/2025
 */
public class Furgoneta extends Vehiculo
{
    /**
     * Constructor
     */
    public Furgoneta(String color, int nPlazas, float tara, int pesoMaximoAutorizado)
    {
        super(color, nPlazas, tara, pesoMaximoAutorizado);

    }

    @Override
    public String imprimirEstado() {
        return "Estado de la Furgoneta: " + getEstado();
    }
}