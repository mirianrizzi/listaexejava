package Exercicio2;

import java.util.Scanner;
public class Main {

    public static void main (String[] args) {
        int value;
        Scanner typed = new Scanner(System.in);
        System.out.println("Digite um número para acessar sua tabuada");
        value = typed.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(value + " x " + i + " = " + (value * i));
        }
    }}