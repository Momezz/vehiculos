public class CarroNormal extends Vehiculo {
  private static final Double REVOLUCIONES_POR_MINUTO = 9.6;

  public CarroNormal() {
  }

  public CarroNormal(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
    super(marca, referencia, cilindraje, caja, color, torque);
  }

  @Override
  public double calcularPotencia() {
    double potencia = getTorque() * REVOLUCIONES_POR_MINUTO / CALCULAR_TORQUE;
    return potencia;
  }
}
