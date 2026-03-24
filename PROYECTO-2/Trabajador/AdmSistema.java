import java.util.Date;
public class AdmSistema extends Trabajador {
    public AdmSistema (String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        super(nombre, apellidos, dni, direccion, numSS, puesto, salario, fechaIngreso);
    }

    // Para cumplir con el enunciado:
    // Tarda 2s para el sistema de gestión.
    // Tarda 3s para las cadenas de montaje.
    public int obtenerTiempoTarea() {
        return 3;
    }
}
