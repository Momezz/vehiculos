public class CarroNormal extends Vehiculo{
  private double revolucionesXMinuto = 9.6;
  private double calcularTorque = 745.7;

  public CarroNormal() {
  }

  public CarroNormal(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
    super(marca, referencia, cilindraje, caja, color, torque);
  }
  @Override
  public double calcularPotencia() {
    double potencia = getTorque() * revolucionesXMinuto / calcularTorque;
    System.out.println("potencia carro -> " + potencia);
    return potencia;
  }
}
