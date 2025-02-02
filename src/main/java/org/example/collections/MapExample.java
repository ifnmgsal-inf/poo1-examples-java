package org.example.collections;

import java.util.*;

public class MapExample {
//        System.out.println("<<<< Map interface examples >>>>>");
//        Dada a população estimada de alguns estados do NE brasileiro, faça:
//        Estado = PE - População = 9.616.621
//        Estado = AL - População = 3.351.543
//        Estado = CE - População = 9.187.103
//        Estado = RN - População = 3.534.265

    //      1- Crie um dicionário e relacione os estados e suas populações;
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações;");
        Map<String, Integer> population = new HashMap<>();
        population.put("PE", 9616621);
        population.put("AL", 3351543);
        population.put("CE", 9187103);
        population.put("RN", 3534265);
        System.out.println(population);

        //      2- Substitua a população do estado do RN por 3.534.165;
        System.out.println("Substitua a população do estado do RN por 3.534.165");
        population.put("RN", 3534165);
        System.out.println(population);

        //      3 - Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277;
        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277");
        population.putIfAbsent("PB", 4039277);
        /*
        if (population.get("PB") == null)
            population.put("PB", 4039277);
         */
        System.out.println(population);
        //      4 - Exiba a população PE
        System.out.println("Exiba a população de PE");
        System.out.println("Populacao do PE = " + population.get("PE"));
        //      5 - Exiba todos os estados e suas populações na ordem que foi informado;
        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado");
        Map<String, Integer> population2 = new LinkedHashMap<>();
        population2.put("PE", 9616621);
        population2.put("AL", 3351543);
        population2.put("CE", 9187103);
        population2.put("RN", 3534265);
        System.out.println(population2);
        //      6 - Exiba os estados e suas populações em ordem alfabética;
        Map<String, Integer> population3 = new TreeMap<>(population2);
        System.out.println(population3);
        //      7 - Exiba o estado com a menor população e sua quantidade;
        System.out.println("Exiba o estado com a menor população e sua quantidade");
        int minPopulation = Collections.min(population3.values());
        Set<Map.Entry<String, Integer>> entrySet = population3.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() == minPopulation) {
                System.out.println("estado com a menor população = " + entry);
                break;
            }
        }
        //      8 -  Exiba o estado com a maior população e sua quantidade;
        System.out.println("Exiba o estado com a maior população e sua quantidade");
        int maxPopulation = Collections.max(population3.values());
        //Set<Map.Entry<String, Integer>> entrySet = population3.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            if (entry.getValue() == maxPopulation) {
                System.out.println("estado com a menor população = " + entry);
                break;
            }
        }
        //      9 - Exiba a soma da população desses estados;
        System.out.println("Exiba a soma da população desses estados");
        int sum = 0;
        Iterator<Integer> iterator = population3.values().iterator();
        while (iterator.hasNext()) {
            sum += iterator.next();
        }
        System.out.println("Sum: " + sum);
        //        Exiba a média da população deste dicionário de estados;
        System.out.println("Exiba a média da população deste dicionário de estados");
        System.out.println("Average: " + sum / population3.size());
        //        Remova os estados com a população menor que 4.000.000;
        //        Apague o dicionário de estados;
        //        Confira se o dicionário está vazio.
    }
}
