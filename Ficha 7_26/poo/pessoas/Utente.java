package pessoas;

public class Utente extends Pessoa{
    int num_utente;

    public Utente(String nome, String nacionalidade, int num_utente) {
        super(nome, nacionalidade);
        this.num_utente = num_utente;
    }

    public int getNum_utente() {
        return num_utente;
    }

    public void setNum_utente(int num_utente) {
        this.num_utente = num_utente;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nNacionalidade: " + this.getNacionalidade() + "\nNumero: " + this.getNum_utente();
    }
}
