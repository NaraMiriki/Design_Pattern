package Behavioural_pattern.ex6;

public class Main {

    public static void main(String[] args) {

        Pizza cheesePizza = new CheesePizza();

        System.out.println("=== Cheese Pizza ===");
        cheesePizza.makePizza();

        System.out.println();

        Pizza seafoodPizza = new SeafoodPizza();

        System.out.println("=== Seafood Pizza ===");
        seafoodPizza.makePizza();
    }
}
