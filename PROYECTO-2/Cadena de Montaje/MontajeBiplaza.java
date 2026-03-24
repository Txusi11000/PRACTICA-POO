import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeBiplaza extends CadenaMontaje {

    public MontajeBiplaza() {
        super(new ArrayList<Operario>(), 0, 0, true);
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (vehiculoNuevo instanceof Biplazadeportivo) {
            super.asignarVehiculo(vehiculoNuevo);
            System.out.println("Turismo asignado a la cadena de montaje para biplazas.");
        } else {
            System.out.println("Error: Esta cadena solo admite biplazas.");
        }
    }
}
