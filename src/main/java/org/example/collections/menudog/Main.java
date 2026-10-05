package org.example.collections.menudog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Dog> dogs = new ArrayList<>();
    private static final int SAIR = 6;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        do {
            montaMenu();
            opcao = sc.nextInt();
            sc.nextLine(); // Consumir a quebra de linha
            switch (opcao) {
                case 1:
                    cadastrarCachorro(sc);
                    break;
                case 2:
                    removerCachorro(sc);
                    break;
                case 3:
                    listarCachorrosOrdenados();
                    break;
                case 4:
                    listarCachorros();
                    break;
                case 5:    
                    listarOrdenadoPorIdade();
                    break;
                case SAIR:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != SAIR);
    }

    private static void listarOrdenadoPorIdade() {
        List<Dog> dogs = new ArrayList<>(Main.dogs);
        dogs.sort(new ComparatorIdade());
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    private static void listarCachorrosOrdenados() {
        List<Dog> dogs = new ArrayList<>(Main.dogs);
        dogs.sort(null);
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }

    private static void montaMenu() {
        System.out.println("Menu:");
        System.out.println("1. Inserir");
        System.out.println("2. Remover por nome");
        System.out.println("3. Listar em ordem alfabética");
        System.out.println("4. Listar em ordem de inserção");
        System.out.println("5. Listar em ordem de idade");
        System.out.println("6. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarCachorro(Scanner sc) {
        System.out.print("Digite o nome do cachorro: ");
        String nome = sc.nextLine();
        System.out.println("Digite a idade do cachorro: ");
        int idade = sc.nextInt();
        sc.nextLine(); // Consumir a quebra de linha
        System.out.println("Digite a raça do cachorro: ");
        String raca = sc.nextLine();

        dogs.add(new Dog(nome, idade, raca));
    }

    private static void listarCachorros() {
        for (Dog dog : dogs) {
            System.out.println(dog.getNome());
        }
    }

    private static void removerCachorro(Scanner sc) {
        System.out.print("Digite o nome do cachorro a ser removido: ");
        String nome = sc.nextLine();
        Iterator <Dog> iterator = dogs.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Dog dog = iterator.next();
            if (dog.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                removed = true;
                break;
            }
        }

        if (removed) {
            System.out.println("Cachorro removido com sucesso!");
        } else {
            System.out.println("Cachorro não encontrado.");
        }
    }
}

