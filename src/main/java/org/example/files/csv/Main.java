package org.example.files.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String path = "src/main/resources/poo1-preferencias.csv";
        List<Aluno> alunos = new ArrayList<>();
        String line = "";

        try (Scanner sc = new Scanner(new File(path))) {
            while (sc.hasNextLine()) {
                if (line.isEmpty()) {
                    line = sc.nextLine(); // Skip the header line
                    continue;
                }
                line = sc.nextLine();
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    Aluno aluno = new Aluno(fields[0], fields[1], fields[2], fields[3]);
                    alunos.add(aluno);
                } else {
                    System.out.println("Linha inválida: " + line);
                }
            }
            System.out.println("Alunos cadastrados:");
            for (Aluno aluno : alunos) {
                System.out.println(aluno);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + path);
        }
    }
}
