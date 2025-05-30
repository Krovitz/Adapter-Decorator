package ejercicio5.modelo;

import java.time.LocalDate;

public interface RegistroInscripto {

    void registro(LocalDate fechaInscripcion, int idParticipante, int idConcurso);
}
