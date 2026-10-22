package model;

public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular) {
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double depositar(double saldo) {
        this.saldo += saldo;
        return saldo;
    }

    public double sacar(double saldo) {
        this.saldo -= saldo;
        return saldo;
    }

    public void exibirSaldo() {
        System.out.println(" --- SALDO ATUAL ---");
        System.out.println(" Saldo: R$" + this.saldo);
    }
}
