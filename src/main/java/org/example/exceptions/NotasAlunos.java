/**
 * Classe para demonstrar o uso de exceções em Java.
 * Esta classe permite calcular a situação de um aluno com base em sua nota.
 *
 * @author leonardosilva
 * @version 1.0
 * @since 2024-06-15
 */
package org.example.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NotasAlunos {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int nota;
            System.out.println("Informe a nota do aluno (0 a 100):");
            nota = sc.nextInt();
            if (nota < 0 || nota > 100) {
                throw new IllegalArgumentException("Nota inválida. A nota deve estar entre 0 e 100.");
            }
            verificaResultado(nota);
        } catch (NumberFormatException | InputMismatchException e) {
            System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void verificaResultado(int nota) throws MyException {
        if (nota < 40) {
            throw new MyException("Aluno reprovado.");
        } else if (nota < 60) {
            throw new MyException("Aluno em exame final.");
        } else {
            throw new MyException("Aluno aprovado.");
        }
    }
}
