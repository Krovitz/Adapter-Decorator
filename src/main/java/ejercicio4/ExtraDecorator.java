package ejercicio4;

public abstract class ExtraDecorator implements Combo {
    private Combo combo;


    public ExtraDecorator(Combo combo) {
        this.combo = combo;
    }

    public double precio() {
        return this.combo.precio();
    }

    public String descripcion() {
        return this.combo.descripcion();
    }
}
