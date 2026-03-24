/**
 * Subclase Turismo
 * 
 * @author Jesús Macías Durán
 * @version 02/03/2025
 */
public class Turismo extends Vehiculo
{
    /**
     * Constructor
     */
    public Turismo(String color, int nPlazas, float tara, int pesoMaximoAutorizado)
    {
        super(color, nPlazas, tara, pesoMaximoAutorizado);

    }

    @Override
    public String imprimirEstado() {
        return "Estado del turismo: " + getEstado();
    }
}