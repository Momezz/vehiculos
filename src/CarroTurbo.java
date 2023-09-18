public class CarroTurbo extends Vehiculo {
  private static final Double REVOLUCIONES_POR_MINUTO = 9.6;

  public CarroTurbo() {
  }

  public CarroTurbo(String marca, String referencia, int cilindraje, String caja, String color, int torque) {
    super(marca, referencia, cilindraje, caja, color, torque);
  }

  @Override
  public double calcularPotencia() {
    double resultado1 = (getTorque() * REVOLUCIONES_POR_MINUTO) / CALCULAR_TORQUE;
    double porcentaje = 0.12;
    double resultado2 = resultado1 * porcentaje;
    double potencia = resultado1 + resultado2;
    return potencia;
  }
}
