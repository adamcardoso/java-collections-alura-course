import java.util.*;

public class Curso {
    private String nome;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>(); // cria uma lista de aulas - associação

    private Set<Aluno> alunos = new HashSet<>(); // cria um conjunto de alunos - associação

    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>(); // cria um mapa de matrícula para aluno - associação

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

    public void matricula(Aluno aluno) {
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos); // retorna uma cópia do conjunto de alunos
    }

    public boolean estaMatriculado(Aluno aluno) {
        return this.alunos.contains(aluno); // verifica se o aluno está matriculado no curso
    }

    public Aluno buscaMatriculado(int numero) { // busca um aluno matriculado pelo número
        if (!matriculaParaAluno.containsKey(numero)) // verifica se o número está no mapa
            throw new NoSuchElementException("Matrícula não encontrada " + numero);

        return matriculaParaAluno.get(numero);
    }
}
