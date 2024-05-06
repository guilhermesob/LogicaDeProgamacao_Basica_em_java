package logicadeprogamacao;

import java.util.ArrayDeque;
import java.util.Deque;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        // Adicionar elementos no início
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);

        // Adicionar elementos no final
        deque.addLast(4);
        deque.addLast(5);
        deque.addLast(6);

        // Exibir o deque
        System.out.println("Deque: " + deque);

        // Remover elementos do início e do final
        int first = deque.pollFirst();
        int last = deque.pollLast();

        System.out.println("Elemento removido do início: " + first);
        System.out.println("Elemento removido do final: " + last);

        // Exibir o deque após a remoção
        System.out.println("Deque após remoção: " + deque);
    }
}
