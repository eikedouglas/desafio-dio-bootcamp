import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso js");
        curso.setDescricao("descricao curso js");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.parse("2022-04-14"));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("GFT Quality Assurance#1");
        bootcamp.setDescricao("Descricao GFT Quality Assurance#1");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev dev = new Dev();
        dev.setNome("Eike Pires");
        dev.inscreverBootcamp(bootcamp);
        System.out.println("Dev:" + dev.getNome());
        System.out.println("Conteudos inscritos: " + dev.getConteudosInscritos());
        dev.progredir();
        System.out.println("Conteudos inscritos: " + dev.getConteudosInscritos());
        System.out.println("Conteudos concluidos: " + dev.getConteudosConcluidos());
        System.out.println("Total XP: " + dev.calcularTotalXP());

    }
}
