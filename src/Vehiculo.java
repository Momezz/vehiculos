public abstract class Vehiculo {
    private String marca;
    private String referencia;
    private int cilindraje;
    private String caja;
    private String color;
    private int torque;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
        this.marca = marca;
        this.referencia = referencia;
        this.cilindraje = cilindraje;
        this.caja = caja;
        this.color = color;
        this.torque = torque;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getCaja() {
        return caja;
    }

    public void setCaja(String caja) {
        this.caja = caja;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public abstract double calcularPotencia();
}
