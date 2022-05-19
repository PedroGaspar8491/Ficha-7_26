package pessoas;

public class Funcionario extends Pessoa {
    private int num_func;

    public Funcionario(String nome, String nacionalidade, int num_func) {
        super(nome, nacionalidade);
        this.num_func = num_func;
    }

    public int getNum_func() {
        return num_func;
    }

    public void setNum_func(int num_func) {
        this.num_func = num_func;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nNacionalidade: " + this.getNacionalidade() + "\nNumero: " + this.getNum_func();
    }
}

