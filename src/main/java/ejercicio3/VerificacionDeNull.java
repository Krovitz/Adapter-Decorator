package ejercicio3;

import java.io.File;

public class VerificacionDeNull implements Reporte {
    private Reporte reporte;

    public VerificacionDeNull(Reporte reporte) {
        this.reporte = reporte;
    }

    @Override
    public void export(File file) {
        if (file == null) {
            throw new IllegalArgumentException(
                    "File es NULL; no puedo exportar..."
            );
        }
        reporte.export(file);
    }
}
