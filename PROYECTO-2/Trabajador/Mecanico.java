import java.util.Date;
public class Mecanico extends Trabajador {

    private int numReparaciones;

    public Mecanico(String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso, int numReparaciones) {
        super(nombre, apellidos, dni, direccion, numSS, puesto, salario, fechaIngreso);
        setNumReparaciones(numReparaciones);
    }

    public void setNumReparaciones(int numReparaciones) {
        if (numReparaciones > 0) {
            this.numReparaciones = numReparaciones;
            if (numReparaciones > 20) {
                setPuesto("Mecanico Eficiente");
            } else {
                setPuesto("Mecanico Estandar");
            }
        } else {
            System.out.println("Número de reparaciones incorrecto");
        }
    }

    public int obtenerTiempoTarea() {
        if (this.numReparaciones > 20) {
            return 1;
        } else {
            return (int)(Math.random() * (5 - 2 + 1) + 2);
        }
    }
}
