import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class TestaListaAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando as ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 20);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();  // cria uma lista de aulas
        aulas.add(a1); // adiciona a aula a1 no final da lista
        aulas.add(a2); // adiciona a aula a2 no final da lista
        aulas.add(a3); // adiciona a aula a3 no final da lista

        System.out.println("=== Imprimindo a lista de aulas ===");
        System.out.println(aulas); // [Aula: Revisitando as ArrayLists, Aula: Listas de objetos, Aula: Relacionamento de listas e objetos]

        Collections.sort(aulas); // ordena a lista de aulas
        System.out.println("=== Imprimindo a lista de aulas ordenada ===");
        System.out.println(aulas);

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo)); // ordena a lista de aulas pelo tempo
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getTempo)); // ordena a lista de aulas pelo tempo
        System.out.println(aulas);
    }
}
