package model;

public class Retangulo {

    private Double altura;
    private Double largura;

    public Retangulo() { }

    public Retangulo(Double altura, Double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public Double calcularArea() {
        return largura * altura;
    }
}
