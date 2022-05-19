package library;

import pessoas.Funcionario;

import java.util.ArrayList;

public class Funcionarios {
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void AddFunc(Funcionario funcionario) {
        this.funcionarios.add(funcionario);
    }

    public void RemoveFunc(Funcionario funcionario) {
        this.funcionarios.remove(funcionario);
    }

    public void SearchFuncNum(Funcionario funcionario) {
        this.funcionarios.forEach(e -> {
            if (e.getNum_func() == funcionario.getNum_func()) {
                System.out.println("Nome: " + e.getNome() + "\nNacionalidade: " + e.getNacionalidade() + "\nNumero: " + e.getNum_func());
            }
        });
    }

    public void ListFunc() {
        this.funcionarios.forEach(System.out::println);
    }

    public void ChangeNum(Funcionario funcionario, int num) {
        this.funcionarios.forEach(e -> {
            if (e.getNum_func() == funcionario.getNum_func()) {
                e.setNum_func(num);
            }
        });
    }

    public void ChangeNome(Funcionario funcionario, String nome) {
        this.funcionarios.forEach(e -> {
            if (e.getNum_func() == funcionario.getNum_func()) {
                e.setNome(nome);
            }
        });
    }

    public void ChangeNacionalidade(Funcionario funcionario, String nacionalidade) {
        this.funcionarios.forEach(e -> {
            if (e.getNum_func() == funcionario.getNum_func()) {
                e.setNacionalidade(nacionalidade);
            }
        });
    }
}

