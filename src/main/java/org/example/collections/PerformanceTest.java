package org.example.collections;

/**
 * Comparacao de deesmpenho com diferentes implementações de listas
 * @author leonardosilva
 *
 * Obs: In Java SE 7 and later, the underscore character (_) can be used in numeric
 * literals strictly for improving code readability. The compiler simply ignores
 * the underscores, as they do not affect the value of the number
 **/
import java.time.OffsetDateTime;
import java.time.Duration;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;

public class PerformanceTest {
    public static void main(String[] args) {
        compareLists(new ArrayList<Integer>());
        compareLists(new LinkedList<Integer>());
    }
    public static void compareLists(List<Integer> list) {
        var linkedStartTime = OffsetDateTime.now();
        // Adding itens only
        for (int i=0; i < 1_000_000; i++) {
            list.add(i);
        }
        System.out.print("Tempo ADD (ms) para " + list.getClass().toString() + " = ");
        System.out.println(Duration.between(linkedStartTime, OffsetDateTime.now()).toMillis());

        // Removing item in the first position
        for (int i=0; i < 500_000; i++) {
            list.remove(0);
        }
        System.out.print("Tempo REMOVE (ms) para " + list.getClass().toString() + " = ");
        System.out.println(Duration.between(linkedStartTime, OffsetDateTime.now()).toMillis());

//        // Locating and Removing itens
//        for (int i=0; i < 500_000; i++) {
//            if (i % 2 == 0)
//                list.remove(i);
//        }
//        System.out.print("Tempo REMOVE (ms) para " + list.getClass().toString() + " = ");
//        System.out.println(Duration.between(linkedStartTime, OffsetDateTime.now()).toMillis());
    }
}
