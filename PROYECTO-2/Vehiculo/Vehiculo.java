/**
 * Clase Vehiculo
 * 
 * @author Jesús Macías Durán
 * @version 26/02/2025
 */
public abstract class Vehiculo
{
    // instance variables - replace the example below with your own
    private String color;
    private int nPlazas;
    private float tara;
    private int pesoMaximoAutorizado;
    private Motor motor;
    private String estado;
    private Tapiceria tapiceria;
    private Rueda[] ruedas;
    private String matricula;
    /**
     * Constructor
     */
    public Vehiculo(String color, int nPlazas, float tara, int pesoMaximoAutorizado)
    {
        setColor(color); //se delega la inicialización al setter
        setNPlazas(nPlazas);
        setPMA(pesoMaximoAutorizado); 
        setTara(tara);

        this.estado = "Chasis";
        this.motor = null;
        this.tapiceria = null;
        this.ruedas = new Rueda[4];
    }

    /* METODOS */

    //Color
    public void setColor(String color)
    {
        if (color != null && !color.trim().isEmpty() ) {
            this.color = color;                                                 
        } else {
            System.out.println("Error: El color del vehiculo no es válido");
        }
    }
    
    //Plazas
    public void setNPlazas(int nPlazas)
    {
        if (nPlazas > 0) {
            this.nPlazas = nPlazas;
        } else {
            System.out.println("Error: El nº de plazas del vehiculo es inválido");
        }
    }

    //PMA
    public void setPMA(int pesoMaximoAutorizado) {
        if (pesoMaximoAutorizado > 0 && pesoMaximoAutorizado > this.tara) {
            this.pesoMaximoAutorizado = pesoMaximoAutorizado;
        } else {
            System.out.println("Error: El peso máximo autorizado del vehiculo no es correcto");
        }
    }

    //Tara
    public void setTara(float tara)  {
        if (tara > 0 && tara < this.pesoMaximoAutorizado) {
            this.tara = tara;
        } else {
            System.out.println("Error: La tara del vehiculo no es correcta");
        }
    }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty()) {
            this.matricula = matricula;
        }
    }

    //Motor
    public void setMotor(Motor motor) {
        if (motor != null) {
            this.motor = motor;
            this.estado = "Motor";
        }
    }
    
    //Tapiceria
    public void setTapiceria(Tapiceria tapiceria) {
        if (tapiceria != null) {
            this.tapiceria = tapiceria;
            this.estado = "tapiceria";
        }
    }
    
    //Rueda
    public void setRuedas(Rueda[] ruedas) {
        if (ruedas != null && ruedas.length == 4) {
            this.ruedas = ruedas;
            this.estado = "ruedas";
        }
    }

    public String getColor()
    {
        return color;
    }

    public int getPlazas()
    {
        return nPlazas;
    }

    public int getPMA() {
        return pesoMaximoAutorizado;
    }

    public float getTara() {
        return tara;
    }

    public String getMatricula() {
        return matricula;
    }  

    //Estado
    public String getEstado() {
        return this.estado;
    }
    public abstract String imprimirEstado();

}

    