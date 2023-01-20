import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String aula1 = "Conhecendo mais de listas";
        String aula2 = "Modelando a classe Aula";
        String aula3 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula1);  // adiciona aula1 no final da lista
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas); // [Conhecendo mais de listas, Modelando a classe Aula, Trabalhando com Cursos e Sets]
        aulas.remove(0);  // remove a primeira aula
        System.out.println();

        System.out.println("Nova saída utilizando For Each");
        for (String aula : aulas) {
            System.out.println("Aula: " + aula);
        }

        String primeiraAula = aulas.get(0); // recupera a primeira aula
        System.out.println("A primeira aula é: " + primeiraAula);

        for (int i = 0; i < aulas.size(); i++) { // percorre a lista com o for tradicional
            System.out.println("Aula: " + aulas.get(i));  // recupera a aula na posição i
        }

        aulas.forEach(aula -> {
            System.out.println("Percorrendo: ");
            System.out.println("Aula: " + aula);
        }); // percorre a lista com o método forEach

        aulas.add("Aumentando nosso conhecimento"); // adiciona uma nova aula

        Collections.sort(aulas); // ordena a lista

        System.out.println("Lista ordenada!");

        aulas.forEach(aula -> { // percorre a lista com o método forEach
            System.out.println("Aula: " + aula);
        });
    }
}