/**
 * Classe que representa um aluno com informações sobre seu nome, cor favorita, disciplina favorita e filme favorito.
 * @author leonardosilva
 */
package org.example.files.csv;

public class Aluno {
    private String nome;
    private String corFavorita;
    private String disciplinaFavorita;
    private String filmeFavorito;

    public Aluno(String nome, String corFavorita, String disciplinaFavorita, String filmeFavorito) {
        this.nome = nome;
        this.corFavorita = corFavorita;
        this.disciplinaFavorita = disciplinaFavorita;
        this.filmeFavorito = filmeFavorito;
    }

    public String getNome() {
        return nome;
    }

    public String getCorFavorita() {
        return corFavorita;
    }

    public String getDisciplinaFavorita() {
        return disciplinaFavorita;
    }

    public String getFilmeFavorito() {
        return filmeFavorito;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", corFavorita='" + corFavorita + '\'' +
                ", disciplinaFavorita='" + disciplinaFavorita + '\'' +
                ", filmeFavorito='" + filmeFavorito + '\'' +
                '}';
    }
}
