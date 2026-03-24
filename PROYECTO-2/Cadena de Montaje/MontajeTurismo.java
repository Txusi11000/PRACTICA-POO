import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeTurismo extends CadenaMontaje {

    public MontajeTurismo() {
        super(new ArrayList<Operario>(), 0, 0, true);
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (vehiculoNuevo instanceof Turismo) {
            super.asignarVehiculo(vehiculoNuevo);
            System.out.println("Turismo asignado a la cadena de montaje para turismos.");
        } else {
            System.out.println("Error: Esta cadena solo admite Turismos.");
        }
    }
}
