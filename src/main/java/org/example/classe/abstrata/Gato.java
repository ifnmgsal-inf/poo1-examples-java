/*
 SubClasse de Animal que representa um gato
 @author leonardosilva
 */
package org.example.classe.abstrata;

public class Gato extends Animal {

    public Gato(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O gato " + super.getNome() + " faz o som Miaimiaumiau...");
    }
}
