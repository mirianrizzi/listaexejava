package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a cotação do dólar: ");
        double rate = scan.nextDouble();
        System.out.println("Insira o valor em reais para ser convertido: ");
        double amount = scan.nextDouble();

        double converter = amount / rate;

        System.out.printf("O valor será convertido em  USD %.2f", converter);

    }
}
