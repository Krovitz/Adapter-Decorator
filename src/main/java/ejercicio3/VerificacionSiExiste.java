package ejercicio3;

import java.io.File;

public class VerificacionSiExiste implements Reporte {
    private Reporte reporte;

    public VerificacionSiExiste(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file.exists()) {
            throw new IllegalArgumentException(
                    "El archivo ya existe..."
            );
        }
        this.reporte.export(file);
    }
}
