package ejercicio3;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class DefaultReporte implements Reporte {
    private String reporte;

    public DefaultReporte(String reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        try {
            Files.write(
                    file.toPath(),
                    reporte.getBytes(),
                    StandardOpenOption.CREATE,
                    StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException("Error al exportar el reporte a disco");
        }
    }
}