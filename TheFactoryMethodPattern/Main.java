package ex2;

public class Main {
	public static void main(String[] args) {

        CandyFactory factory = new CandyFactory();

        CandyStore store = new CandyStore(factory);

        System.out.println("Order Hard Candy");
        store.orderCandy("hard");

        System.out.println();

        System.out.println("Order Chocolate");
        store.orderCandy("chocolate");
    }
}
