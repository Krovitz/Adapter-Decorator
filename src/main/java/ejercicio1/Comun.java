package ejercicio1;

public class Comun implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Arranca vehiculo comun");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera vehiculo comun");
    }

    @Override
    public void frenar() {
        System.out.println("Frena vehiculo comun");
    }
}
