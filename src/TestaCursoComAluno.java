public class TestaCursoComAluno {
    public static void main(String[] args) {
        Curso javaColecoes = new Curso("Dominando as coleções do Java", "Paulo Silveira");
        javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
        javaColecoes.adiciona(new Aula("Criando uma aula", 20));
        javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

        Aluno a1 = new Aluno("Rodrigo Turini", 34672);
        Aluno a2 = new Aluno("Guilherme Silveira", 5617);
        Aluno a3 = new Aluno("Mauricio Aniche", 17645);

        javaColecoes.matricula(a1); // matricula o aluno a1 no curso javaColecoes
        javaColecoes.matricula(a2); // matricula o aluno a2 no curso javaColecoes
        javaColecoes.matricula(a3); // matricula o aluno a3 no curso javaColecoes

        System.out.println("Todos os alunos matriculados: ");
        javaColecoes.getAlunos().forEach(System.out::println); // imprime todos os alunos matriculados no curso javaColecoes

        System.out.println("O aluno "+ a1 + " está matriculado? "+javaColecoes.estaMatriculado(a1)); // verifica se o aluno a1 está matriculado no curso javaColecoes

        Aluno turini = new Aluno("Rodrigo Turini", 34672);
        System.out.println("E esse Turini, está matriculado? "+javaColecoes.estaMatriculado(turini)); // verifica se o aluno turini está matriculado no curso javaColecoes

        System.out.println("O a1 é equals ao turini? "+a1.equals(turini)); // verifica se o aluno a1 é igual ao aluno turini

        // obrigatoriamente o seguinte é true
        System.out.println("O hashcode de a1 é igual ao hashcode de turini? "+(a1.hashCode() == turini.hashCode())); // verifica se o hashcode do aluno a1 é igual ao hashcode do aluno turini
    }
}
