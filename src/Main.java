public class Main {
    public static void main(String[] args) {
        CarroNormal carroNormalUno = new CarroNormal("Mazda", "3", 1600, "Mecanico", "Blanco", 160);
        CarroNormal carroTurboUno = new CarroNormal("Chevrolet", "Onix", 1200, "Mecanico", "Gris", 200);
        CarroNormal motoUno = new CarroNormal("Honda", "FR", 80, "Mecanico", "rojo", 50);
        carroNormalUno.calcularPotencia();
        carroTurboUno.calcularPotencia();
    }
}