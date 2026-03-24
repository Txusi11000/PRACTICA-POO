import java.util.Date;

public abstract class Trabajador {
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private long numSS;
    private String puesto;
    private int salario;
    private Date fechaIngreso;

    public Trabajador (String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDNI(dni);
        setDireccion(direccion);
        setNumSS(numSS);
        setPuesto(puesto);
        setSalario(salario);
        setFechaIngreso(fechaIngreso);
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Nombre incorrecto");
        }
    }

    public void setApellidos(String apellidos) {
        if (apellidos != null && !apellidos.trim().isEmpty()) {
            this.apellidos = apellidos;
        } else {
            System.out.println("Apellidos incorrectos");
        }
    }

    public void setDNI(String dni) {
        if (dni != null && !dni.trim().isEmpty() && dni.trim().length() == 9) {
            this.dni = dni;
        } else {
            System.out.println("DNI erroneo");
        }
    }

    public void setDireccion(String direccion) {
        if (direccion != null && !direccion.trim().isEmpty()) {
            this.direccion = direccion;
        } else {System.out.println("Dirección inválida");}
    }

    public void setNumSS(long numSS) {
        if (numSS < 999999999999L && numSS > 0) {
            this.numSS = numSS;
        } else {
            System.out.println("Número de la Seguridad Social Incorrecto");
        }
    }

    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.trim().isEmpty()) {
            this.puesto = puesto;
        } else {
            System.out.println("Puesto no válido");
        }
    }

    public void setSalario (int salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            System.out.println("Salario no válido");
        }
    }

    public void setFechaIngreso(Date fechaIngreso) {
        if (fechaIngreso != null) {
            this.fechaIngreso = fechaIngreso;
        } else {
            System.out.println("Fecha de ingreso incorrecta");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDNI() {
        return dni;
    }

    public String getDireccion() {
        return direccion;
    }

    public long getNumSS () {
        return numSS;
    }

    public String getPuesto() {
        return puesto;
    }

    public int getSalario() {
        return salario;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public abstract int obtenerTiempoTarea();
}

