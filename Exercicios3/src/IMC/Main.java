package IMC;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
    public class Main {

        public static void main(String[] args) {
            int i = 0;
            Person[] personList = new Person[5];
            StringBuilder personWithBadImcList = new StringBuilder();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite o nome, altura e peso de 5 pessoas. Vamos descobrir o Índice de Massa Corporal e ao final listar quem está fora do seu peso ideal.");

            while(i < 5){
                personList[i] = new Person();
                System.out.println("Digite o nome da pessoa: ");
                personList[i].setName(scanner.next());
                System.out.println("Digite a altura da pessoa (em metros, usando uma vírgula para separar os decimais): ");
                personList[i].setHeight(scanner.nextDouble());
                System.out.println("Digite o peso da pessoa (em quilos, usando uma vírgula para separar os decimais): ");
                personList[i].setWeight(scanner.nextDouble());
                personList[i].setImc();
                if(!Objects.equals(personList[i].getImcLevel(), "Normal")){
                    personWithBadImcList.append(i);
                }
                System.out.printf(Locale.GERMAN, "O IMC do(a) %s é de %,.2f%n", personList[i].getName(), personList[i].getImc());
                i++;
            }
            if(personWithBadImcList.length() > 0){
                System.out.println("A(s) pessoa(s) abaixo está(estão) com seu IMC fora do normal:");
                for (int j = 0; j < personWithBadImcList.length() ; j++) {
                    System.out.printf(Locale.GERMAN, "%s: %,.2f - %s%n",
                            personList[j].getName(),
                            personList[j].getImc(),
                            Objects.equals(personList[j].getImcLevel(), "Below") ? "abaixo do normal" : "acima do normal");
                }
            } else {
                System.out.println("Não temos pessoas com o IMC fora do normal.");
            }
        }
    }

