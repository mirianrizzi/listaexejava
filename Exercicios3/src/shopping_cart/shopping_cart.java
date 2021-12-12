package shopping_cart;

import java.util.Scanner;

public class shopping_cart {
    private String[] fruits={"", "", "", "", ""};
    private int i = 0;

    public String[] getFruits() {
        return fruits;
    }

    public void setFruits() {
        String[] fruitsNow={"","","","",""};
        Scanner scanner = new Scanner(System.in);
        while (i < 5){
            System.out.printf("Coloque a fruta n.%.2s no carrinho: %n", i+1);
            fruitsNow[i] = scanner.next();
            i++;
        }


        this.fruits = fruitsNow;
    }
}
