package high.low.media;

import java.util.Arrays;
import java.util.Scanner;

public class highLowMedia {
    public static void main(String[] args) {
        int[] numbers = {0,0,0,0,0};
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int higherNumber = -999999999;
        int lowerNumber = 999999999;
        double sum = 0;
        System.out.println("Vamos pegar uma sequência de cinco números e descobrir qual é o maior, o menor e a média da soma deles");
        while(i < 5){
            System.out.println("Digite um número: ");
            numbers[i] = scanner.nextInt();
            if(numbers[i] > lowerNumber){
                lowerNumber = numbers[i];
            } if(numbers[i] > higherNumber){
                higherNumber = numbers[i];
            }
            sum += numbers[i];
            i++;
        }
        System.out.printf("Sua sequência de números é: %n %s %n", Arrays.toString(numbers));
        System.out.printf("O maior número é %s%n", higherNumber);
        System.out.printf("O menor número é %s%n", lowerNumber);
        System.out.printf("A média da soma do seu conjunto é %s", sum / 5);

    }
}