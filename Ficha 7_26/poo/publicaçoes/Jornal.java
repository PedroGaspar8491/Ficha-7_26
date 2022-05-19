package publicaçoes;

import pessoas.Autor;

import java.util.ArrayList;
import java.util.Date;

public class Jornal extends Publicacao {
    public Jornal(Date data, String titulo, String tematica, ArrayList<Autor> autores) {
        super(data, titulo, tematica, autores);
    }
}
