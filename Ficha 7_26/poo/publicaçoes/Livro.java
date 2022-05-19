package publicaçoes;

import pessoas.Autor;

import java.util.ArrayList;
import java.util.Date;

public class Livro extends Publicacao {
    private boolean emprestimo;

    public Livro(Date data, String titulo, String tematica, ArrayList<Autor> autores, boolean emprestimo) {
        super(data, titulo, tematica, autores);
        this.emprestimo = emprestimo;
    }

    public boolean isEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(boolean emprestimo) {
        this.emprestimo = emprestimo;
    }
}
