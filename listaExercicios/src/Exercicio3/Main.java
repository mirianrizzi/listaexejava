package Exercicio3;

import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com a temperatura em Celsius");

        int c = scan.nextInt();

        final float Fahrenheit = (c * 1.8f) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f %n", Fahrenheit);
    }
}
