/*
 Programa de teste para a hierarquia Animal. Exercício sobre classes abstratas.
 @author leonardosilva
 */
package org.example.classe.abstrata;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao=0;

        do {
            montaMenu();
            opcao = sc.nextInt();

            System.out.println();
            if (opcao == 1) {
                System.out.println("Qual o nome do seu cão?");
                Cachorro c = new Cachorro(sc.next());
                c.emitirSom();
            } else if (opcao == 2) {
                System.out.println("Qual o nome do seu gato?");
                Gato g = new Gato(sc.next());
                g.emitirSom();
            } else if (opcao != 3){
                System.out.println("Opção inválida!!");
            }
        } while (opcao != 3);

        sc.close();
    }

    private static void montaMenu() {
        System.out.println("\nMENU de OPCOES");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        System.out.println("3 - Sair");
        System.out.print("Escolha sua opção: ");
    }
}