package ejercicio4;

public class Papas extends ExtraDecorator {
    private double precioAdicional = 150;

    public Papas(Combo combo) {
        super(combo);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", Papas";
    }

    @Override
    public double precio() {
        return super.precio() + this.precioAdicional;
    }
}
