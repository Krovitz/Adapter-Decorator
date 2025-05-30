package ejercicio4;

public class Main {
    public static void main(String[] args) {
        var combo = new Builder(new ComboEspecial("Combo doble carne", 300)).conPapas().conTomate().conQueso().build();
        
        System.out.println(combo.descripcion());
        System.out.println(combo.precio());
    }
}
