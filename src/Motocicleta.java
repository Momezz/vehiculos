public class Motocicleta extends Vehiculo{
  private double revolucionesXMinuto = 9.8;
  private double calcularTorque = 745.7;

  public Motocicleta() {
  }
  public Motocicleta(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
    super(marca, referencia, cilindraje, caja, color, torque);
  }
  @Override
  public double calcularPotencia() {
    double potencia = getTorque() * revolucionesXMinuto / calcularTorque;
    System.out.println("potencia moto -> " + potencia);
    return potencia;
  }
}
