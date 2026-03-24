
import java.util.ArrayList;
import java.util.Date;

import Cadena
import Cadena de Montaje.MontajeBiplaza;
import Cadena de Montaje.MontajeFurgoneta;
import Cadena de Montaje.MontajeTurismo;
import Cadena de Montaje.MontajeBiplaza;
import Cadena de Montaje.MontajeFurgoneta;
import Cadena de Montaje.MontajeTurismo;
import Cadena de Montaje.MontajeFurgoneta;
import Cadena de Montaje.MontajeTurismo;

public class Scheduler {
    private int tiempoTotal;
    boolean totalCoches = false;
    private MontajeBiplaza cadenaBiplaza;
    private MontajeFurgoneta cadenaFurgoneta;
    private MontajeTurismo cadenaTurismo;

    public Scheduler () {
        this.tiempoTotal = 0;
    }

    public void asignarCadena(MontajeBiplaza cadenaBiplaza, MontajeTurismo cadenaTurismo, MontajeFurgoneta cadenaFurgoneta) {
        this.cadenaBiplaza = cadenaBiplaza;
        this.cadenaFurgoneta = cadenaFurgoneta;
        this.cadenaTurismo = cadenaTurismo;
    }

    private void asignarOperariosAleatorios(Cadenamontaje cadena) {
        ArrayList<Operario> ops = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int experiencia = (int)(Math.random() * 20) + 1; //Experiencia aleatoria para cada uno
            ops.add(new Operario("Operario"+i, "A", "1111","Direccion",1L, "Operario", 1000, new Date(), experiencia));
        }
        cadena.añadirOperario(ops);
    }
    public void simulacionSimple() {
        asignarOperariosAleatorios(cadenaBiplaza);
        asignarOperariosAleatorios(cadenaTurismo);
        asignarOperariosAleatorios(cadenaFurgoneta);
        while (tiempoTotal < 10) {
            tiempoTotal++;
            System.out.println("Tiempo total: " + tiempoTotal);

            cadenaBiplaza.trabajoOperarios();
            cadenaTurismo.trabajoOperarios();
            cadenaFurgoneta.trabajoOperarios();

            if(cadenaBiplaza.getFaseActual() > 3 && cadenaTurismo.getFaseActual() > 3 && cadenaFurgoneta.getFaseActual() > 3) {
                System.out.println("Todos los vehiculos terminados.");
                break;
            }
        }
        System.out.println("Se ha terminado la simulacion");
    }

}