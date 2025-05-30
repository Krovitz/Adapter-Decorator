package ejercicio4;

public class Queso extends ExtraDecorator {
    private double precioAdicional = 150;

    public Queso(Combo combo) {
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
