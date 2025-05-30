package ejercicio2;

import javax.swing.*;
import java.awt.*;

public class Canvas extends JPanel {
    private java.util.List<Figura> figuras;

    public Canvas() {
        figuras = new java.util.ArrayList<>();
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2DAdapter panelAdapter = new Graphics2DAdapter((Graphics2D) g);

        for (Figura figura : figuras) {
            figura.dibujar(panelAdapter);
        }
    }
}
