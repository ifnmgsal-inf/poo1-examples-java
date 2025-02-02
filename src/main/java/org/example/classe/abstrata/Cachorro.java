/*
 SubClasse de Animal que representa um cachorro
 @author leonardosilva
 */
package org.example.classe.abstrata;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void emitirSom() {
        System.out.println("O cachorro " + super.getNome() + " faz o som Auauauau...");
    }
}
