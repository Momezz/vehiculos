public class CarroTurbo extends Vehiculo{
  private double revolucionesXMinuto = 9.6;
  private double calcularTorque = 745.7;

  public CarroTurbo() {
  }

  public CarroTurbo(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
    super(marca, referencia, cilindraje, caja, color, torque);
  }

  @Override
  public double calcularPotencia() {
    double resultado1 = (getTorque() * revolucionesXMinuto) / calcularTorque;
    double porcentaje = 0.12;
    double resultado2 = resultado1 * porcentaje;
    double potencia = resultado1 + resultado2;
    System.out.println("Potencia carro normal -> " + potencia);
    return potencia;
  }
}
