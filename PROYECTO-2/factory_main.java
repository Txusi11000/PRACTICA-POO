import Almacen.AlmacenDatos;
import Almacen.InterfazAlmacen;

public class factory_main {
    public static void main(String[] args) {
        InterfazAlmacen almacen = new AlmacenDatos();
        GestionFabrica gestor = new GestionFabrica(almacen);

        gestor.nuevoTurismo("Azul", 5, 1200f, 1800);
        gestor.nuevoMotorGasolina(2.0, 150, 4);
        gestor.añadirTela("Negro", 5);

        gestor.listarStockVehiculos();

        gestor.altaOperario("Carlos", "Ruiz", "11111111A", "Calle A", 12345L, "Operario", 1500, new Date(), 15);
        gestor.altaGestor("Maria", "Gomez", "22222222B", "Calle B", 54321L, "Gestor", 2000, new Date());

        if (almacen.buscarTrabajador("11111111A") != null) {
            System.out.println("Encontrado - " + almacen.buscarTrabajador("11111111A").getNombre());
        }

        gestor.actualizarDatosVehiculo("Azul", 5, 1200f, 1800, "1234ABC");

        Scheduler planificador = new Scheduler();
    }
}