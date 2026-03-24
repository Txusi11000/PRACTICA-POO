import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeTurismo extends CadenaMontaje {

    public MontajeTurismo() {
        super(new ArrayList<Operario>());
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (nuevoVehiculo instanceof Turismo) {
            super.asignarVehiculo(nuevoVehiculo);
            System.out.println("Turismo asignado a la cadena de montaje para turismos.");
        } else {
            System.out.println("Error: Esta cadena solo admite Turismos.");
        }
    }
}
