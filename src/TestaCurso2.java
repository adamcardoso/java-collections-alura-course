import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        List<Aula> aulasImutaveis = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println("=== Aulas ===");
        System.out.println(aulasImutaveis);

        System.out.println("=== Aulas ordenadas ===");
        List<Aula> aulasOrdenadas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulasOrdenadas);
        System.out.println("====Tempo total====");
        System.out.println(javaColecoes.getTempoTotal());

        System.out.println("===Aulas===");
        System.out.println(javaColecoes);
    }
}
