package logicadeprogramacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShuffleAndSortCards {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> cards = new ArrayList<>();

        // Cria um baralho de cartas de 1 a 10
        for (int i = 1; i <= 10; i++) {
            cards.add(i);
        }

        while (true) {
            // Passo 1: Embaralhar as cartas
            Collections.shuffle(cards);
            System.out.println("Passo 1: Cartas embaralhadas: " + cards);

            // Passo 2: Ordenar as cartas
            Collections.sort(cards);
            System.out.println("Passo 2: Cartas ordenadas: " + cards);

            // Perguntar ao usuário se deseja repetir
            System.out.print("Deseja repetir o processo? (s/n): ");
            String repeat = scanner.next();
            if (!repeat.equalsIgnoreCase("s")) {
                break;
            }
        }

        // Fechar o Scanner usando try-with-resources
        scanner.close();
    }
}
