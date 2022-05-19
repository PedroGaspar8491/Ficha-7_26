package library;

import publicaçoes.Jornal;
import publicaçoes.Livro;
import publicaçoes.Publicacao;
import publicaçoes.Revista;

import java.util.ArrayList;

public class Publicacoes {
    private ArrayList<Publicacao> publicacoes = new ArrayList<>();
    private ArrayList<Publicacao> emprestimos = new ArrayList<>();

    public void AddPub(Publicacao publicacao) {
        this.publicacoes.add(publicacao);
    }

    public void RemovePub(Publicacao publicacao) {
        this.publicacoes.remove(publicacao);
    }

    public void ListPubTheme(String tema) {
        this.publicacoes.forEach(e -> {
            if (e.getTematica().equals(tema)) {
                System.out.println(e);
            }
        });
    }

    public void ListPubAuth(String autor) {
        this.publicacoes.forEach(e -> {
            e.getAutores().forEach(a -> {
                if (a.getNome().equals(autor)) {
                    System.out.println(e);
                }
            });
        });
    }

    public void ListPubTipo() {
        this.publicacoes.forEach(e -> {
            if (e instanceof Jornal) {
                System.out.println("Jornal.");
            } else if (e instanceof Revista) {
                System.out.println("Revista.");
            } else if (e instanceof Livro) {
                System.out.println("Livro.");
            }
        });
    }

    public void AddEmp(Publicacao publicacao) {
        if (publicacao instanceof Livro) {
            this.emprestimos.add(publicacao);
            ((Livro) publicacao).setEmprestimo(true);
        } else {
            System.out.println("Emprestimo Invalido");
        }
    }

    public void EndEmp(Publicacao publicacao) {
        if (((Livro) publicacao).isEmprestimo()) {
            this.emprestimos.remove(publicacao);
            ((Livro) publicacao).setEmprestimo(false);
        }else{
            System.out.println("Livro não está em empréstimo");
        }
    }
    public void ListEmp(){
        this.emprestimos.forEach(System.out::println);
    }
}
