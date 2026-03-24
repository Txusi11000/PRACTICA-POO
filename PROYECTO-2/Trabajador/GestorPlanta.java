import java.util.Date;
public class GestorPlanta extends Trabajador {
    public GestorPlanta (String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        super(nombre, apellidos, dni, direccion, numSS, puesto, salario, fechaIngreso);
    }

    @Override

    public int obtenerTiempoTarea() {
        return 1;
    }
}