public interface InterfazAlmacen {
    void añadirVehiculo(Vehiculo veh);
    void añadirRuedas(Rueda rue);      
    void añadirTapiceria(Tapiceria tap);
    void añadirMotor(Motor mot);
    void añadirTrabajador(Trabajador tra);

    Vehiculo buscarVehiculo(String matricula);
    Trabajador buscarTrabajador(String dni);
    Motor buscarMotor(String referencia);
    Rueda buscarRueda(String referencia);
    Tapiceria buscarTapiceria(String referencia);

    void listarStockVehiculos();
    void listarStockMotores();
    void listarStockRuedas();
    void listarStockTapiceria();
    void listarStockTrabajadores();
}
