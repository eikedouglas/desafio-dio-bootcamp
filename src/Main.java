import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setTitulo("curso js");
        curso.setDescricao("descricao curso js");
        curso.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descricao mentoria java");

        System.out.println(curso);
        System.out.println(mentoria);
    }
}
