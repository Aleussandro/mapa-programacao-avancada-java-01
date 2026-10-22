import model.*;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // EXERCICIO 1
        System.out.println("\n*===== Exercício 1 =====*");
        Pessoa p1 = new Pessoa("Alessandro", 22, "Rio de Janeiro");
        System.out.printf(" Nome: %s%n Idade: %d%n Cidade: %s%n", p1.getNome(), p1.getIdade(), p1.getCidade());

        // EXERCICIO 2
        System.out.println("\n*===== Exercício 2 =====*");
        Retangulo retangulo = new Retangulo(5.0, 5.0);
        System.out.printf(" A área do retangulo é: %.2f%n", retangulo.calcularArea());

        // EXERCICIO 3
        System.out.println("\n*===== Exercício 3 =====*");
        ContaBancaria cb1 = new ContaBancaria("Alessandro");
        cb1.depositar(1200.00);
        cb1.exibirSaldo();
        cb1.sacar(200.00);
        cb1.exibirSaldo();
        cb1.depositar(100.00);
        cb1.exibirSaldo();
        cb1.sacar(3000.00);

        // EXERCICIO 4
        System.out.println("\n*===== Exercício 4 =====*");
        System.out.print(" Digite o nome do produto: ");
        String nome =  sc.nextLine();
        System.out.print(" Digite o preço do produto: ");
        Double preco = sc.nextDouble();

        Produto pd1 = new Produto(nome, preco);
        System.out.println(pd1);

        // EXERCICIO 5
        System.out.println("\n*===== Exercício 5 =====*");
        Funcionario f1 = new Funcionario("Lucas", 1820.00);
        System.out.println(" Salário do funcionário: " + f1.getSalario());
        f1.calcularBonus();

        System.out.println(" ");

        Gerente g1 = new Gerente("Manoel", 1820.00);
        System.out.println(" Salário do gerente: " + g1.getSalario());
        g1.calcularBonus();


        // EXERCICIO 6
        System.out.println("\n*===== Exercício 6 =====*");
        Veiculo v1 = new Veiculo();
        Carro c1 = new Carro();
        Bicicleta b1 = new Bicicleta();

        c1.mover();
        b1.mover();

        sc.close();
    }
}