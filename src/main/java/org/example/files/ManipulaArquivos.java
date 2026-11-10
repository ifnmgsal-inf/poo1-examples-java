package org.example.files;

/*
 * ManipulaArquivos.java
 * Interface para leitura e escrita em arquivo texto.
 * @author LeonardoSilva
 */
import java.io.IOException;

public interface ManipulaArquivos {
    public static void leitor(String path) throws IOException{};
    public static void escritor(String path) throws IOException{};
}
