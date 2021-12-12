package spell_backwards;

import java.util.Scanner;

public class spellBackwards {

    public static void main(String[] args) {

        String name;
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.print("Digite o nome: ");
            name = scanner.nextLine();
        }
        char[] characterName = name.toCharArray();

        StringBuilder spellBackwards = new StringBuilder();
        for (int i = characterName.length -1; i >= 0; i--){
            spellBackwards.append(characterName[i]);

        }
        System.out.println(spellBackwards);
    }}

