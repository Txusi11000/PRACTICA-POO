import java.util.Date;
public class Operario extends Trabajador {
    private int numMontajes;
    public Operario (String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso, int numMontajes) {
        super(nombre, apellidos, dni, direccion, numSS, puesto, salario, fechaIngreso);
        setNumMontajes(numMontajes);
    }

    public void setNumMontajes(int numMontajes) {
        if (numMontajes > 0) {
            this.numMontajes = numMontajes;
            if (numMontajes > 10) {
                setPuesto("Operario Eficiente");
            } else {
                setPuesto("Operario Estandar");
            }
        } else {
            System.out.println("Número de montajes incorrecto");
        }
    }

    public int obtenerTiempoTarea() {
        if (this.numMontajes > 10) {
            return 1;
        } else {
            return 3;
        }
    }
}