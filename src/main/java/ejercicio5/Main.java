package ejercicio5;

import ejercicio5.modelo.ConEnvioMail;
import ejercicio5.modelo.DefaultConcurso;
import ejercicio5.modelo.MailMessageInscripto;
import ejercicio5.modelo.Participante;
import ejercicio5.persistencia.EnDiscoRegistroInscripto;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Escritura en disco. Crea archivo si no existe en el Escritorio
        //Si no existe escribe en la ultima linea
        String path = "C:/Users/Tomas/Desktop/Pruebas-Inscripciones.txt";
        Participante participante = new Participante("Tomas");
        Participante participante2 = new Participante("Tobias");
//        DefaultConcurso defaultConcurso = new DefaultConcurso("Truco", LocalDate.now(), LocalDate.now().plusDays(10),
//                new EnDiscoRegistroInscripto(path));

        var concurso = new ConEnvioMail(new DefaultConcurso("Truco", LocalDate.now(), LocalDate.now().plusDays(10), new EnDiscoRegistroInscripto(path)), new MailMessageInscripto());

        concurso.inscribirParticipante(participante, LocalDate.now());

        //Escritura en la BD
//        defaultConcurso.setRegistroInscripto(new EnDataBaseRegistroInscripto());
//        defaultConcurso.inscribirParticipante(participante2, LocalDate.now());

    }
}
