package org.example.files;

/******************************************************************************

 Teste para manipulação de arquivos texto.
 @author LeonardoSilva

 *******************************************************************************/
import java.io.*;

public class Main
{
    public static void main(String[] args) {
        String nomeArquivo = "data/teste.txt";

        try {
            System.out.println("--------- Conteúdo antes:");
            LeituraEscrita.leitor(nomeArquivo);
            LeituraEscrita.escritor(nomeArquivo);
            System.out.println("\n--------- Conteúdo lido depois:");
            LeituraEscrita.leitor(nomeArquivo);
        } catch (java.io.FileNotFoundException fnfe) {
            System.out.println("O arquivo: " + nomeArquivo + " nao foi encontrado!");
        } catch (IOException ioe) {
            System.out.println("Erro ao manipular arquivo: " + ioe.getMessage());
        }
    }
}
