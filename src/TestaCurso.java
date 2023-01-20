import java.util.Collections;
import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        List<Aula> aulas = javaColecoes.getAulas();

        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 22));

        System.out.println("=== Aulas ===");
        System.out.println(javaColecoes.getAulas());

        System.out.println("=== Aulas ordenadas ===");
        Collections.sort(javaColecoes.getAulas());
        System.out.println(javaColecoes.getAulas());

        
    }
}
