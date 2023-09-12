public class Main {
    public static void main(String[] args) {
        CarroNormal carroNormalUno = new CarroNormal("Mazda", "3", 1600, "Mecanico", "Blanco", 160);
        CarroTurbo carroTurboUno = new CarroTurbo("Chevrolet", "Onix", 1200, "Mecanico", "Gris", 200);
        Motocicleta motoUno = new Motocicleta("Honda", "FR", 80, "Mecanico", "rojo", 50);
        carroNormalUno.calcularPotencia();
        carroTurboUno.calcularPotencia();
        motoUno.calcularPotencia();
    }
}