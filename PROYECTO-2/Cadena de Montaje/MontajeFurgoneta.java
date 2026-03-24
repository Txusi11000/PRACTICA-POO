import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeFurgoneta extends CadenaMontaje {

    public MontajeFurgoneta() {
        super(new ArrayList<Operario>(), 0, 0, true);
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (vehiculoNuevo instanceof Furgoneta) {
            super.asignarVehiculo(vehiculoNuevo);
            System.out.println("Furgoneta asignado a la cadena de montaje para furgonetas.");
        } else {
            System.out.println("Error: Esta cadena solo admite furgonetas.");
        }
    }
}