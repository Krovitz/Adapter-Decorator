package ejercicio5.modelo;

import java.time.LocalDate;

public interface Concurso {
    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion);

    String nombre();
}
