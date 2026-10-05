/**
 * Classe que representa um cachorro com nome, idade e raça.
 * @author leonardosilva
 */
package org.example.collections.menudog;

import java.util.Comparator;

//class Dog {
class Dog implements Comparable<Dog> {
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
        return this.nome.compareTo(dog.getNome());
    }
}

class ComparatorIdade implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return Integer.compare(dog1.getIdade(), dog2.getIdade());
    }
}

