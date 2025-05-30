package ejercicio2;

import java.awt.*;

public class Graphics2DAdapter implements Panel {
    private Graphics2D g2d;

    public Graphics2DAdapter(Graphics2D g) {
        this.g2d = g;
    }

    @Override
    public void dibujarCirculo(Coordenada coordenada, int radio) {
        g2d.drawOval(coordenada.x() - radio,
                coordenada.y() - radio,
                radio * 2,
                radio * 2);
    }

    @Override
    public void dibujarTexto(Coordenada coordenada, String texto) {
        g2d.drawString(texto, coordenada.x(), coordenada.y());
    }

    @Override
    public void dibujarLinea(Coordenada coordenada, int longitud) {
        g2d.drawLine(coordenada.x(), coordenada.y(), coordenada.x() + longitud, coordenada.y());
    }


}
