import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeFurgoneta extends CadenaMontaje {

    public MontajeFurgoneta() {
        super(new ArrayList<Operario>());
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (nuevoVehiculo instanceof Furgoneta) {
            super.asignarVehiculo(nuevoVehiculo);
            System.out.println("Furgoneta asignado a la cadena de montaje para furgonetas.");
        } else {
            System.out.println("Error: Esta cadena solo admite furgonetas.");
        }
    }
}