package Exercicio4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Insira a cotação do dólar");
        double rate = scan.nextDouble();
        System.out.println("Insira o valor a ser convertido para reais");
        double amount = scan.nextDouble();

        double converter = rate * amount;


        System.out.printf("O valor em reais é de %.2f", converter);


    }
}