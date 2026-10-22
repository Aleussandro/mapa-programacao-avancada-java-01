package model;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calcularBonus() {
        double bonus = salario * 0.2;
        System.out.println(" Valor do bonus do gerente: " + bonus);
    }
}
