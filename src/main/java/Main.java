import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(10);


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java ");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRaul = new Dev();
        devRaul.setNome("Raul");
        devRaul.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devRaul.getConteudosInscritos());
        devRaul.progredir();
        devRaul.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devRaul.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devRaul.getConteudosConcluidos());
        System.out.println("XP:" + devRaul.calcularXP());


        System.out.println("---------------------------");
        Dev devMary = new Dev();
        devMary.setNome("Mary");
        devMary.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + devMary.getConteudosInscritos());
        devMary.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos " + devMary.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos " + devMary.getConteudosConcluidos());
        System.out.println("XP:" + devMary.calcularXP());









    }
}
