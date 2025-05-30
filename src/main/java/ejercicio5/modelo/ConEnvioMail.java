package ejercicio5.modelo;

import java.time.LocalDate;

public class ConEnvioMail implements Concurso {
    private Concurso concurso;
    private MailService envioMail;

    public ConEnvioMail(Concurso concurso, MailService envioMail) {
        this.concurso = concurso;
        this.envioMail = envioMail;
    }

    @Override
    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion) {
        concurso.inscribirParticipante(participante, fechaInscripcion);
        envioMail.sendMail(participante.nombre(), concurso.nombre());
    }

    @Override
    public String nombre() {
        return concurso.nombre();
    }
}
