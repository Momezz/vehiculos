import java.text.DecimalFormat;

public class Main {
  public static void main(String[] args) {
    DecimalFormat formateador = new DecimalFormat("####.####");
    CarroNormal carroNormalUno = new CarroNormal("Mazda", "3", 1600, "Mecanico", "Blanco", 160);
    CarroTurbo carroTurboUno = new CarroTurbo("Chevrolet", "Onix", 1200, "Mecanico", "Gris", 200);
    Motocicleta motoUno = new Motocicleta("Honda", "FR", 80, "Mecanico", "rojo", 50);
    System.out.println("Potencia carro normal: " + formateador.format(carroNormalUno.calcularPotencia()));
    System.out.println("Potencia carro turbo: " + formateador.format(carroTurboUno.calcularPotencia()));
    System.out.println("Potencia moto: " + formateador.format(motoUno.calcularPotencia()));
  }
}