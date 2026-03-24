public class Normal extends Rueda {
    public Normal (int anchoMm, int diametro, int cargaKg, int codVelocidad) {
        super(anchoMm, diametro, cargaKg, codVelocidad);
    }

    @Override

    public String imprimirVelocidad () {
        return "El código de velocidad del vehiculo es: " + getCodVelocidad();
    }
}
