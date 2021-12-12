package eldest.youngest.media;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int i = 0;
        Person[] personList = new Person[5];

        Scanner scanner = new Scanner(System.in);
        int theEldestAge = 0;
        int theYoungestAge = 999999999;
        int theYoungestIndex = 0;
        int theEldestIndex = 0;
        double sum = 0;
        System.out.println("Digite o nome e idade de 5 pessoas. Vamos descobrir quem é o mais velho, o mais novo e a média de idade entre eles.");



        while(i < 5){
            personList[i] = new Person();
            System.out.println("Digite o nome da pessoa: ");
            personList[i].setName(scanner.next());
            System.out.println("Digite a idade da pessoa: ");
            personList[i].setAge(scanner.nextInt());
            if(personList[i].getAge() < theYoungestAge){
                theYoungestAge = personList[i].getAge();
                theYoungestIndex = i;
            }
            if(personList[i].getAge() > theEldestAge){
                theEldestAge = personList[i].getAge();
                theEldestIndex = i;
            }
            sum += personList[i].getAge();
            i++;
        }
        System.out.printf("A pessoa mais velha é %s e tem %d anos de idade.%n", personList[theEldestIndex].getName(), personList[theEldestIndex].getAge());
        System.out.printf("A pessoa mais nova é %s e tem %d anos de idade.%n", personList[theYoungestIndex].getName(), personList[theYoungestIndex].getAge());
        System.out.printf("A média das idades é %s", sum / 5);

    }
}
