/*
 Classe abstrata que representa um animal
 @author leonardosilva
 */
package org.example.classe.abstrata;

public abstract class Animal {
    private String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public abstract void emitirSom();

    protected String getNome() {
        return this.nome;
    }
}
