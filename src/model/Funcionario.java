package model;

public class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario() { }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularBonus() {
        double bonus = 10.0;
        this.salario = salario * (bonus / 100);
    }

}
