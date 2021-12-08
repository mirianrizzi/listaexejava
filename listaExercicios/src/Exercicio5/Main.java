package Exercicio5;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double centimeters, rate;

        rate = 2.54;
        Scanner value = new Scanner(System.in);
        System.out.println("Digite um valor em polegadas (utilize uma vírgula para separar as casas decimais)");
        float inches = value.nextFloat();

        centimeters = rate * inches;

        System.out.println("O resultado é " + centimeters);
    }
}
