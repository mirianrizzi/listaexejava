package guestList;
import java.util.Arrays;
import java.util.Scanner;

public class guestList {

    public static void main(String[] args){
        String[] guests = {"","","","",""};
        StringBuilder theBiggestName = new StringBuilder();
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        int nameLength = 0;
        System.out.println("Com uma lista de cinco convidados, descobriremos qual o nome mais longo");
        while(i < 5){
            System.out.println("Digite o nome de um dos convidados: ");
            guests[i] = scanner.next();
            if(guests[i].length() == nameLength){
                theBiggestName.append("," + guests[i]);
            }

            if(guests[i].length() > nameLength){
                nameLength = guests[i].length();
                theBiggestName.setLength(0);
                theBiggestName.append(guests[i]);
            }
            i++;
        }
        System.out.printf("Sua lista de convidados é: %n %s %n", Arrays.toString(guests));
        System.out.printf("O convidado(s) com maior nome é(são): %s%n", theBiggestName);
    }
}
