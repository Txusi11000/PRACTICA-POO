public class Scheduler {
    private int tiempoTotal;
    boolean totalCoches = false;
    private CadenaMontaje cadena;

    public Scheduler () {
        this.tiempoTotal = 0;
    }

    public void asignarCadena(CadenaMontaje cadena) {
        this.cadena = cadena;
    }

    public void simulacionSimple() {
        while (tiempoTotal < 10) {
            tiempoTotal++;
            System.out.println("Tiempo total: " + tiempoTotal);

            if(cadena != null) {
                cadena.trabajoOperarios();
            }

            if(cadena.getFaseActual() > 4) {
                System.out.println("Se ha terminado de fabricar un coche");
                break;
            }
        }
        System.out.println("Se ha terminado la simulacion");
    }

}