package numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Numbers {

    public static void main(String[] args) {
        int[] numbers={0,0,0,0,0};
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        StringBuilder evenNumbers = new StringBuilder();
        StringBuilder oddNumbers = new StringBuilder();
        System.out.println("Vamos declarar um conjunto de 5 números, listar seu conteúdo e, se houver, o subconjunto dos ímpares e o subconjunto dos pares.");
        while(i < 5){
            System.out.println("Digite um número: ");
            numbers[i] = scanner.nextInt();
            if(numbers[i] %2 == 0){
                evenNumbers.append(numbers[i] + " ");
            } else {
                oddNumbers.append(numbers[i] + " ");
            }
            i++;
        }
        System.out.printf("Sua sequência de números é: %n %s %n", Arrays.toString(numbers));
        if(oddNumbers.length() < 1 ){
            System.out.printf("Não temos números ímpares e%n");
        } else {
            System.out.printf("São números ímpares: %n %s %ne ", oddNumbers);
        }
        if(evenNumbers.length() < 1 ){
            System.out.print("não temos números pares");
        } else {
            System.out.printf("são números pares: %n %s %n",evenNumbers);
        }
    }
}