import java.util.*;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>(); // cria um conjunto de alunos
        alunos.add("Rodrigo Turini");
        alunos.add("Alberto Souza");
        alunos.add("Nico Steppat");
        alunos.add("Sergio Lopes");
        alunos.add("Renan Saggio");
        alunos.add("Mauricio Aniche");
        alunos.add("Alberto Souza");  // não é adicionado, pois já existe

        System.out.println("Mostra os alunos: ");
        System.out.println(alunos);

        alunos.forEach(System.out::println);

        boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");  // verifica se o aluno está matriculado
        System.out.println("Paulo está matriculado? " + pauloEstaMatriculado);

        alunos.remove("Sergio Lopes");  // remove o aluno
        System.out.println("Mostra os alunos: ");
        System.out.println(alunos);

        // para saber a posiçao de um elemento na lista
        List<String> alunosEmLista = new ArrayList<>(alunos);

        Collections.sort(alunosEmLista);  // ordena a lista
        System.out.println("Mostra os alunos em ordem: "+alunosEmLista);
        System.out.println("Aluno na posição 4: "+alunosEmLista.get(4));

    }
}
