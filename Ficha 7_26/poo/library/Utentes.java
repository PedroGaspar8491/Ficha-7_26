package library;

import pessoas.Utente;

import java.util.ArrayList;

public class Utentes {
    private ArrayList<Utente> utentes = new ArrayList<>();

    public void AddFunc(Utente utente) {
        this.utentes.add(utente);
    }

    public void RemoveFunc(Utente utente) {
        this.utentes.remove(utente);
    }

    public void SearchFuncNum(Utente utente) {
        this.utentes.forEach(e -> {
            if (e.getNum_utente() == utente.getNum_utente()) {
                System.out.println("Nome: " + e.getNome() + "\nNacionalidade: " + e.getNacionalidade() + "\nNumero: " + e.getNum_utente());
            }
        });
    }

    public void ListFunc() {
        this.utentes.forEach(System.out::println);
    }

    public void ChangeNum(Utente utente, int num) {
        this.utentes.forEach(e -> {
            if (e.getNum_utente() == utente.getNum_utente()) {
                e.setNum_utente(num);
            }
        });
    }

    public void ChangeNome(Utente utente, String nome) {
        this.utentes.forEach(e -> {
            if (e.getNum_utente() == utente.getNum_utente()) {
                e.setNome(nome);
            }
        });
    }

    public void ChangeNacionalidade(Utente utente, String nacionalidade) {
        this.utentes.forEach(e -> {
            if (e.getNum_utente() == utente.getNum_utente()) {
                e.setNacionalidade(nacionalidade);
            }
        });
    }
}
