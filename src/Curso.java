import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>(); // cria uma lista de aulas - associação

    public Curso(String nome, String instrutor) {
        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula) { // adiciona uma aula na lista
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
       return this.aulas.stream()
               .mapToInt(Aula::getTempo)
               .sum(); // soma os tempos das aulas
    }

    @Override
    public String toString() {
        return "[Curso: " + nome + ", tempo total: " + this.getTempoTotal() + ", aulas: + " + this.aulas + "]";
    }
}
