public abstract class Rueda {
    private int anchoMm;
    private int diametro;
    private int cargaKg;
    private int codVelocidad;
    private String estado;
    private String referencia;
    
    public Rueda (int anchoMm, int diametro, int cargaKg, int codVelocidad, String referencia) {
        setAnchoMm(anchoMm);
        setDiametro(diametro);
        setCargaKg(cargaKg);
        setCodVelocidad(codVelocidad);
        setReferencia(referencia);
        this.estado = "Rueda";
    }
    
    /* GETTERS-SETTERS */
    public void setAnchoMm (int anchoMm) {
        if (anchoMm > 145 && anchoMm < 350) {
            this.anchoMm = anchoMm;
        } else {
            System.out.println("La anchura de la banda de rodadura del coche no es suficiente.");
        }
    }

    public void setDiametro (int diametro) {
        if (diametro > 13 && diametro < 24) {
            this.diametro = diametro;
        } else {
            System.out.println("El diametro de las ruedas no es adecuadro.");
        }
    }

    public void setCargaKg (int cargaKg) {
        if (cargaKg > 300 && cargaKg < 1500) {
            this.cargaKg = cargaKg;
        } else {
            System.out.println("La carga del coche no esta permitida");
        }
    }

    public void setCodVelocidad(int codVelocidad) {
        if (codVelocidad > 0 && codVelocidad < 360) {
            this.codVelocidad = codVelocidad;
        } else {
            System.out.println("El código de velocidad del coche es erroneo");
        }
    }

    public void setReferencia(String referencia) {
        if (referencia != null && !referencia.trim().isEmpty()) {
            this.referencia = referencia;
        } else {
            System.out.println("Referencia de rueda no válida");
        }
    }

    public int getAnchoMm () {
        return anchoMm;
    }

    public int getDiametro() {
        return diametro;
    }

    public int getCargaKg () {
        return cargaKg;
    }

    public int getCodVelocidad() {
        return codVelocidad;
    }

    public String getEstado() {
        return estado;
    }

    public String getReferencia() {
        return referencia;
    }

    public abstract String imprimirVelocidad();


}
