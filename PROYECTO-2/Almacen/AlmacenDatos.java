package Almacen;

import java.util.ArrayList;

public class AlmacenDatos implements InterfazAlmacen {
    private ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
    private ArrayList<Motor> listaMotores = new ArrayList<>();
    private ArrayList<Rueda> listaRuedas = new ArrayList<>();
    private ArrayList<Tapiceria> listaTapiceria = new ArrayList<>();
    private ArrayList<Trabajador> listaTrabajadores = new ArrayList<>();
    
    @Override
    public void añadirVehiculo(Vehiculo veh) {listaVehiculos.add(veh);}
    @Override
    public void añadirMotor(Motor mot) {listaMotores.add(mot);}
    @Override
    public void añadirRuedas(Rueda rue) {listaRuedas.add(rue);}
    @Override
    public void añadirTapiceria(Tapiceria tap) {listaTapiceria.add(tap);}
    @Override
    public void añadirTrabajador(Trabajador tra) {listaTrabajadores.add(tra);}
    @Override
    public Vehiculo buscarVehiculo(String matricula) {
        for(Vehiculo veh : listaVehiculos) {
            if (veh.getMatricula() != null && veh.getMatricula().equals(matricula)) {
                return veh;
            }
        }
        return null;
    }
    
    @Override
    public Trabajador buscarTrabajador(String dni) {
        for(Trabajador tra : listaTrabajadores) {
            if(tra.getDNI() != null && tra.getDNI().equals(dni)) {
                return tra;
            }
        }
        return null;
    }
    
    public Motor buscarMotor(String referencia) {
        for(Motor mot : listaMotores) {
            if(mot.getReferencia() != null && mot.getReferencia().equals(referencia)) {
                return mot;
            }
        }
        return null;
    }

    public Rueda buscarRueda(String referencia) {
        for(Rueda rue : listaRuedas) {
            if(rue.getReferencia() != null && rue.getReferencia().equals(referencia)) {
                return rue;
            }
        }
        return null;
    }

    public Tapiceria buscarTapiceria(String referencia) {
        for(Tapiceria tap : listaTapiceria) {
            if(tap.getReferencia() != null && tap.getReferencia().equals(referencia)) {
                return tap;
            }
        }
        return null;
    }

    public void listarStockRuedas() {
        for(Rueda rue : listaRuedas) {
            System.out.println("La referencia de la rueda es: " + rue.getReferencia());
        }
    }

    public void listarStockVehiculos() {
        for(Vehiculo veh : listaVehiculos) {
            System.out.println("La matricula del vehiculo es: " + veh.getMatricula());
        }
    }

    public void listarStockMotores() {
        for(Motor mot : listaMotores) {
            System.out.println("La referencia del motor es: " + mot.getReferencia);
        }
    }

    public void listarStockTapiceria() {
        for (Tapiceria tap : listaTapiceria) {
            System.out.println("La referencia de la tapiceria es: " + tap.getReferencia);
        }
    }

    public void listarStockTrabajadores() {
        for (Trabajador tra : listaTrabajadores) {
            System.out.println("El DNI del trabajador es: " + tra.getDNI);
        }
    }

}
