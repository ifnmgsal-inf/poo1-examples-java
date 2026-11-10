package org.example.files;

/*
 * LeituraEscrita.java
 * Implementa a interface ManipulaArquivos para leitura e escrita em arquivo texto.
 * @author LeonardoSilva
 */
import java.util.Scanner;
import java.io.*;

public class LeituraEscrita implements ManipulaArquivos {

    public static void leitor(String path) throws IOException {
        try (BufferedReader buffRead = new BufferedReader(new FileReader(path))) {
            while (buffRead.ready()) {
                System.out.println(buffRead.readLine());
            }
        }
    }

    public static void escritor(String path) throws IOException {
        try (FileWriter fw = new FileWriter(path, true);
             BufferedWriter buffWrite = new BufferedWriter(fw);
             Scanner in = new Scanner(System.in)) {
            System.out.println("Escreva algo: ");
            buffWrite.append(in.nextLine() + "\n");
        }
    }
}