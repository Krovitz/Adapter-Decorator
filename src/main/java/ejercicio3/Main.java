package ejercicio3;

import java.io.File;

public class Main {
    public static void main(String[] args) {
//        String contenido = "Esto se exporta a un archivo";
//        var reporte = new DefaultReporte(contenido);
//        reporte.export(new File("C:/Users/Tomas/Desktop/reporte.txt"));
        
        var reporte = new VerificacionSiExiste(new DefaultReporte("Reemplaza contenido"));
        reporte.export(new File("C:/Users/Tomas/Desktop/reporte.txt"));
    }
}
