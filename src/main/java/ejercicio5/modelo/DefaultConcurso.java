package ejercicio5.modelo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DefaultConcurso implements Concurso {
    private static int contadorId = 1;
    private String nombre;
    private int id;
    private LocalDate fechaAbiertoInscripcion;
    private LocalDate fechaCerradoInscripcion;
    private List<Participante> inscriptos;
    private RegistroInscripto registroInscripto;
    //    private MailService servicioMail;

    public DefaultConcurso(String nombre, LocalDate fechaAbiertoInscripcion, LocalDate fechaCerradoInscripcion, RegistroInscripto registroInscripto) {
        this.nombre = nombre;
        this.fechaAbiertoInscripcion = fechaAbiertoInscripcion;
        this.fechaCerradoInscripcion = fechaCerradoInscripcion;
        this.id = contadorId++;
        this.inscriptos = new ArrayList<>();
        this.registroInscripto = registroInscripto;
//        this.servicioMail = servicioMail;
    }

    @Override
    public String nombre() {
        return nombre;
    }

    private boolean fechaValida(LocalDate unaFecha) {
        boolean estado = false;
        if (isEqualOrAfter(unaFecha, fechaAbiertoInscripcion) && isEqualOrBefore(unaFecha, fechaCerradoInscripcion))
            estado = true;
        return estado;
    }

    @Override
    public void inscribirParticipante(Participante participante, LocalDate fechaInscripcion) {
        if (!fechaValida(fechaInscripcion)) {
            throw new IllegalArgumentException("Fecha fuera del limite");
        }
        if (participanteInscripto(participante)) {
            throw new RuntimeException("Participante ya inscripto");
        }
        inscriptos.add(participante);
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String text = fechaInscripcion.format(format) + ", " + participante.id() + ", " + id;
        registroInscripto.registro(fechaInscripcion, participante.id(), this.id);
//                servicioMail.sendMail(participante.nombre(), nombre);
        if (fechaInscripcion.equals(fechaAbiertoInscripcion))
            participante.sumarPuntos(10);
    }

    public boolean isEqualOrAfter(LocalDate l1, LocalDate l2) {
        return l1.isEqual(l2) || l1.isAfter(l2);
    }

    public boolean isEqualOrBefore(LocalDate l1, LocalDate l2) {
        return l1.isEqual(l2) || l1.isBefore(l2);
    }

    public boolean participanteInscripto(Participante unParticipante) {
        boolean existe = false;
        int i = 0;
        List<Participante> l = this.inscriptos;
        while (!existe && i < l.size()) {
            if (l.get(i).equals(unParticipante)) {
                existe = true;
            } else {
                i++;
            }
        }
        return existe;
    }

    public int cantidadInscriptos() {
        return inscriptos.size();
    }

    public void setRegistroInscripto(RegistroInscripto registroInscripto) {
        this.registroInscripto = registroInscripto;
    }
}
