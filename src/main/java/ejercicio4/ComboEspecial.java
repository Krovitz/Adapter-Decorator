package ejercicio4;

public class ComboEspecial implements Combo {
    private String descripcion;
    private double precio;

    public ComboEspecial(String descripcion, float precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public String descripcion() {
        return descripcion;
    }

    @Override
    public double precio() {
        return precio;
    }
}
