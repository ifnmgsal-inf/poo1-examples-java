package org.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortExample {

/*Dadas as seguintes informações sobre meus caes, crie uma lista
e ordene esta lista exibindo:
(nome - idade - raça);

Cao 1 = nome: Max, idade: 6, raça: Fila
Cao 2 = nome: Valente, idade: 15, raça: Pinscher
Cao 3 = nome: Max, idade: 4, raça: Labrador
*/

    public static void main(String[] args) {

        List<Dog> dogs = new ArrayList<>(){{
            add(new Dog("Max", 6, "Fila"));
            add(new Dog("Valente", 15, "Pinscher"));
            add(new Dog("Max", 4, "Labrador"));
        }};

        // To show according to 'Ordem de Inserção' we just have to print the list
        System.out.println("--\tOrdem de Inserção\t---");
        System.out.println(dogs);

        System.out.println("--\tOrdem aleatória\t---");
        Collections.shuffle(dogs);
        System.out.println(dogs);

        System.out.println("--\tOrdem Natural (Nome)\t---");
        // The following code will present an error: no instance(s) of type variable(s) T exist so that Dog conforms to Comparable<? super T>
        //Collections.sort(dogs);
        // After showing the reason, change class Dog to implement interface Comparable<Dog>
        Collections.sort(dogs);
        //System.out.println(dogs);

        System.out.println("--\tOrdem Idade\t---");
        // We need to create a new class that implements Comparator<T>
        // Than we have the two following options to sort
//        Collections.sort(dogs, new ComparatorIdade());
        //dogs.sort(new ComparatorIdade());
        System.out.println(dogs);

        System.out.println("--\tOrdem raça\t---");
//        Collections.sort(dogs, new ComparatorRaca());
        dogs.sort(new ComparatorRaca());
        System.out.println(dogs);

        System.out.println("--\tOrdem Nome/Raça/Idade\t---");
//        Collections.sort(dogs, new ComparatorNomeRacaIdade());
        dogs.sort(new ComparatorNomeRacaIdade());
        System.out.println(dogs);
    }
}

class Dog implements Comparable<Dog>{
    private String nome;
    private int idade;
    private String raca;

    public Dog(String nome, int idade, String raca) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getRaca() {
        return raca;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", raca='" + raca + '\'' +
                '}';
    }

    @Override
    public int compareTo(Dog dog) {
        return this.getNome().compareToIgnoreCase(dog.getNome());
    }
}

class ComparatorIdade implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return Integer.compare(d1.getIdade(), d2.getIdade());
    }
}

class ComparatorRaca implements Comparator<Dog> {
    @Override
    public int compare(Dog d1, Dog d2) {
        return d1.getRaca().compareToIgnoreCase(d2.getRaca());
    }
}

class ComparatorNomeRacaIdade implements Comparator<Dog> {

    @Override
    public int compare(Dog d1, Dog d2) {
        int byName = d1.getNome().compareToIgnoreCase(d2.getNome());
        if (byName != 0) return byName;

        int byBreed = d1.getRaca().compareToIgnoreCase(d2.getRaca());
        if (byBreed != 0) return byBreed;

        return Integer.compare(d1.getIdade(), d2.getIdade());

    }
}

