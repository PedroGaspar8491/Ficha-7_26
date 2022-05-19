package publicaçoes;

import pessoas.Autor;

import java.util.ArrayList;
import java.util.Date;

public class Publicacao {
    private Date data;
    private String titulo;
    private String tematica;
    private ArrayList<Autor> autores = new ArrayList<>();

    public Publicacao(Date data, String titulo, String tematica, ArrayList<Autor> autores) {
        this.data = data;
        this.titulo = titulo;
        this.tematica = tematica;
        this.autores = autores;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTematica() {
        return tematica;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public ArrayList<Autor> getAutores() {
        return autores;
    }

    public void setAutores(Autor autor) {
        this.autores.add(autor);
    }

    @Override
    public String toString() {
        return "Data: " + data + "\nTitulo: " + titulo + "\nTematica: " + tematica;
    }
}

