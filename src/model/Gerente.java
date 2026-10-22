package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        double bonus = 20.0;
        this.salario = salario * (bonus / 100);
    }
}
