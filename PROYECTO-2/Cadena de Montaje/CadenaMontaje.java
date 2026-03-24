import java.util.ArrayList;
import Trabajador.Operario;

public class CadenaMontaje {
    private Vehiculo vehiculoEnProduccion = null;
    private Motor motorEnProduccion = null;
    private Tapiceria tapiceriaEnProduccion = null;
    private Rueda[] ruedas = new Rueda[4];
    private ArrayList<Operario> listaOperarios = new ArrayList<>();
    private int faseActual = 0;
    private int tiempoTranscurrido = 0;
    private boolean disponibilidadVeh;

    public CadenaMontaje(ArrayList<Operario>) {
        this.listaOperarios = listaOperarios;
        this.faseActual = 0;
        this.tiempoTranscurrido = 0;
        this.disponibilidadVeh = true;
    }

    public void avanzarFase() {
        if (faseActual == 0) {
            faseActual++;
        } else if (faseActual == 1) {
            vehiculoEnProduccion.setMotor(motorEnProduccion);
            faseActual++;
        } else if (faseActual == 2) {
            vehiculoEnProduccion.setTapiceria(tapiceriaEnProduccion);
            faseActual++;
        } else if (faseActual == 3) {
            vehiculoEnProduccion.setRuedas(ruedas);
            faseActual++;
        }
    }

    public void finalFases() {
        if (faseActual > 3) {
            System.out.println("Se han terminado todas las fases del vehiculo");
        }
    }

    public void disponibilidadVehiculo() {
        if (vehiculoEnProduccion == null) {
            disponibilidadVeh = true;
            System.out.println("Vehiculo disponible");
        } else {
            disponibilidadVeh = false;
            System.out.println("Vehiculo no disponible");

        }

    }

    public void asignarVehiculo(Vehiculo vehiculoNuevo) {
        this.vehiculoEnProduccion = vehiculoNuevo;
        this.faseActual = 1;
        this.tiempoTranscurrido = 0;
        this.disponibilidadVeh = false;
    }

    public void trabajoOperarios() {
        if (vehiculoEnProduccion != null && faseActual < listaOperarios.size()) {
            tiempoTranscurrido++;
            if (tiempoTranscurrido >= listaOperarios.get(faseActual).obtenerTiempoTarea()) {
                avanzarFase();
                tiempoTranscurrido = 0;
            }
        }
    }

    public void añadirOperario(ArrayList<Operario> op) {
        for (Operario o : op) {
            listaOperarios.add(o);
        }
    }

    public void liberarOperarios() {
        listaOperarios.clear();
    }

    public void setVehiculo(Vehiculo veh) {
        vehiculoEnProduccion = veh;
    }

    public void setMotor(Motor mot) {
        motorEnProduccion = mot;

    }

    public void setTapiceria(Tapiceria tap) {
        tapiceriaEnProduccion = tap;
    }

    public void setRuedas(Rueda rue) {
        for (int i = 0; i < 4; i++) {
            ruedas[i] = rue;
        }
    }

    public int getFaseActual() {
         return faseActual; 
    }
    public int getTiempoTranscurrido() {
         return tiempoTranscurrido; 
    }
}
