import java.util.ArrayList;
import Trabajador.Operario;

public class MontajeBiplaza extends CadenaMontaje {

    public MontajeBiplaza() {
        super(new ArrayList<Operario>());
    }

    @Override
    public void asignarVehiculo(Vehiculo nuevoVehiculo) {
        if (nuevoVehiculo instanceof Biplazadeportivo) {
            super.asignarVehiculo(nuevoVehiculo);
            System.out.println("Turismo asignado a la cadena de montaje para biplazas.");
        } else {
            System.out.println("Error: Esta cadena solo admite biplazas.");
        }
    }
}
