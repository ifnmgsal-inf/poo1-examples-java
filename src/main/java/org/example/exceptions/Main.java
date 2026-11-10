/**
 * Classe principal para demonstrar o uso de exceções em Java.
 * @author leonardosilva
 */
package org.example.exceptions;

public class Main {

    /**
     * Método principal para executar o programa.
     * @param args os argumentos da linha de comando
     */
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        try {
            do {
                try {
                    int a, b, divisao;
                    System.out.println("Informe um número inteiro");
                    a = sc.nextInt();
                    System.out.println("Informe outro número inteiro");
                    b = sc.nextInt();
                    divisao = a / b;
                    System.out.println("Resultado a/b = " + divisao);
                    break;
                } catch (ArithmeticException e) {
                    System.out.println("Erro: Divisão por zero não é permitida.");
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
                    sc.nextLine(); // Limpa o buffer do scanner
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
                }
            } while (true);
        } finally {
            System.out.println("Programa finalizado.");
            sc.close();
        }
    }
}
