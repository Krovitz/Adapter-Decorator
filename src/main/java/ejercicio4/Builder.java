package ejercicio4;

public class Builder {
    private Combo combo;

    public Builder(Combo combo) {
        this.combo = combo;
    }

    public Builder conPapas() {
        combo = new Papas(combo);
        return this;
    }

    public Builder conQueso() {
        combo = new Queso(combo);
        return this;
    }

    public Combo build() {
        return combo;
    }

    public Builder conTomate() {
        combo = new Tomate(combo);
        return this;
    }
}
