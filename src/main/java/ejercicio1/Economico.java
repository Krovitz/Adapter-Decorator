package ejercicio1;

public class Economico implements Motor {
    @Override
    public void arrancar() {
        System.out.println("Arranca vehiculo economico");
    }

    @Override
    public void acelerar() {
        System.out.println("Acelera vehiculo economico");
    }

    @Override
    public void frenar() {
        System.out.println("Frena vehiculo economico");
    }
}
