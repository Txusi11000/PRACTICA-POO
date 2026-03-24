import Almacen.InterfazAlmacen;
import java.util.Date;
public class GestionFabrica {
    private InterfazAlmacen almacen;

    public GestionFabrica (InterfazAlmacen almacen) {
        this.almacen = almacen;
    }

    public void altaOperario (String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso, int numMontajes) {
        Trabajador nuevoOperario = new Operario(nombre, apellidos, dni, direccion, numSS, "Operario", salario, fechaIngreso, numMontajes);

        almacen.añadirTrabajador(nuevoOperario);
    }

    public void altaMecanico(String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso, int numReparaciones) {
        Trabajador nuevoMecanico = new Mecanico(nombre, apellidos, dni, direccion, numSS, "Mecanico", salario, fechaIngreso, numReparaciones);

        almacen.añadirTrabajador(nuevoMecanico);
    }

    public void altaGestor(String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        Trabajador nuevoGestor = new GestorPlanta(nombre, apellidos, dni, direccion, numSS, "Gestor de Planta", salario, fechaIngreso);

        almacen.añadirTrabajador(nuevoGestor);
    }

    public void altaAdmin(String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        Trabajador nuevoAdmin = new AdmSistema(nombre, apellidos, dni, direccion, numSS, "Admin Sistema", salario, fechaIngreso);

        almacen.añadirTrabajador(nuevoAdmin);
    }

    public void nuevoMotorHibrido(double cilindrada, int potencia, int nCilindros) {
        Motor nuevoMotorHibrido = new Hibrido(cilindrada, potencia, nCilindros);

        almacen.añadirMotor(nuevoMotorHibrido);
    }

    public void nuevoMotorGasolina(double cilindrada, int potencia, int nCilindros) {
        Motor nuevoMotorGasolina = new Gasolina(cilindrada, potencia, nCilindros);

        almacen.añadirMotor(nuevoMotorGasolina);
    }

    public void nuevoMotorElectrico(int potencia) {
        Motor nuevoMotorElectrico = new Electrico(potencia);

        almacen.añadirMotor(nuevoMotorElectrico);
    }

    public void añadirAlcantara(String color, int metrosCuadrados) {
        Tapiceria añadirAlcantara = new Alcantara(color, metrosCuadrados);

        almacen.añadirTapiceria(añadirAlcantara);
    }

    public void añadirTela (String color, int metrosCuadrados) {
        Tapiceria añadirTela = new Tela(color, metrosCuadrados);

        almacen.añadirTapiceria(añadirTela);
    }

    public void añadirCuero (String color, int metrosCuadrados) {
        Tapiceria añadirCuero = new Cuero(color, metrosCuadrados);

        almacen.añadirTapiceria(añadirCuero);
    }

    public void añadirNormal(int anchoMm, int diametro, int cargaKg, int codVelocidad) {
        Rueda añadirNormal = new Normal(anchoMm, diametro, cargaKg, codVelocidad);
        almacen.añadirRuedas(añadirNormal);
    }

    public void añadirTodoterreno(int anchoMm, int diametro, int cargaKg, int codVelocidad) {
        Rueda añadirTodoterreno = new Todoterreno(anchoMm, diametro, cargaKg, codVelocidad);
        almacen.añadirRuedas(añadirTodoterreno);
    }
    
    
    public void añadirDeportivo (int anchoMm, int diametro, int cargaKg, int codVelocidad) {
        Rueda añadirDeportivo = new Deportivo(anchoMm, diametro, cargaKg, codVelocidad);
        almacen.añadirRuedas(añadirDeportivo);
    }

    public void nuevoBiplaza(String color, int nPlazas, float tara, int pesoMaximoAutorizado) {
        Vehiculo nuevoBiplaza = new Biplazadeportivo(color, nPlazas, tara, pesoMaximoAutorizado);

        almacen.añadirVehiculo(nuevoBiplaza);
    }

    public void nuevoFurgoneta(String color, int nPlazas, float tara, int pesoMaximoAutorizado) {
        Vehiculo nuevaFurgoneta = new Furgoneta(color, nPlazas, tara, pesoMaximoAutorizado);

        almacen.añadirVehiculo(nuevaFurgoneta);
    }

    public void nuevoTurismo(String color, int nPlazas, float tara, int pesoMaximoAutorizado) {
        Vehiculo nuevoTurismo = new Turismo(color, nPlazas, tara, pesoMaximoAutorizado);

        almacen.añadirVehiculo(nuevoTurismo);
    }

    public void actualizarDatosMotor(double cilindrada, int potencia, int nCilindros, String referencia) {
        Motor motor = almacen.buscarMotor(referencia);

        if(motor != null) {
            motor.setCilindrada(cilindrada);
            motor.setPotencia(potencia);
            motor.setNCilindros(nCilindros);
            motor.setReferencia(referencia);
        }
    }

    public void actualizarDatosRueda(int anchoMm, int diametro, int cargaKg, int codVelocidad, String referencia) {
        Rueda rueda = almacen.buscarRueda(referencia);

        if(rueda != null) {
            rueda.setAnchoMm(anchoMm);
            rueda.setDiametro(diametro);
            rueda.setCargaKg(cargaKg);
            rueda.setCodVelocidad(codVelocidad);
            rueda.setReferencia(referencia);
        }
    }

    public void actualizarDatosTapiceria(String color, int metrosCuadrados, String referencia) {
        Tapiceria tapiceria = almacen.buscarTapiceria(referencia);

        if(tapiceria != null) {
            tapiceria.setColor(color);
            tapiceria.setMetrosCuadrados(metrosCuadrados);
            tapiceria.setReferencia(referencia);
        }
    }

    public void actualizarDatosTrabajador(String nombre, String apellidos, String dni, String direccion, long numSS, String puesto, int salario, Date fechaIngreso) {
        Trabajador trabajador = almacen.buscarTrabajador(dni);

        if(trabajador != null) {
            trabajador.setNombre(nombre);
            trabajador.setApellidos(apellidos);
            trabajador.setDNI(dni);
            trabajador.setDireccion(direccion);
            trabajador.setNumSS(numSS);
            trabajador.setPuesto(puesto);
            trabajador.setSalario(salario);
            trabajador.setFechaIngreso(fechaIngreso);
        }
    }

    public void actualizarDatosVehiculo(String color, int nPlazas, float tara, int pesoMaximoAutorizado, String matricula) {
        Vehiculo vehiculo = almacen.buscarVehiculo(matricula);

        if(vehiculo != null) {
            vehiculo.setColor(color);
            vehiculo.setNPlazas(nPlazas);
            vehiculo.setTara(tara);
            vehiculo.setPMA(pesoMaximoAutorizado);
            vehiculo.setMatricula(matricula);
        }
    }

    public void listarStockRuedas() {
        almacen.listarStockRuedas();
    }

    public void listarStockVehiculos() {
        almacen.listarStockVehiculos();
    }
}
