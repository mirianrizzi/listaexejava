package shopping_cart;

import java.util.Arrays;

public class Main {

    public static void main(String[] args){

       shopping_cart shopping_cart = new shopping_cart();

       shopping_cart.setFruits();

       System.out.printf("Aqui está seu carrinho de frutas: %n %s", Arrays.toString(shopping_cart.getFruits()));

    }
}
