package upperCase;

import java.util.Scanner;

public class upperCase {

        public static void main (String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite uma palavra: ");
            String word = scanner.next();

            char[] charWord = word.toCharArray();

            StringBuilder upperCaseWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                Character charNow;

                charNow = i % 2 != 0 ? Character.toUpperCase(charWord[i]) : charWord [i];

                upperCaseWord.append(charNow);
                }
            System.out.print(upperCaseWord);
            }
        }
