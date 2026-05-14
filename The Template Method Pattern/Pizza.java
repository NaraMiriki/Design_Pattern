package Behavioural_pattern.ex6;

public abstract class Pizza {

    // Template Method
    public final void makePizza() {

        prepareDough();
        addToppings();
        bake();
        cut();
        box();
    }

    public void prepareDough() {
        System.out.println("Preparing pizza dough...");
    }

    public void bake() {
        System.out.println("Baking pizza...");
    }

    public void cut() {
        System.out.println("Cutting pizza...");
    }

    public void box() {
        System.out.println("Putting pizza into box...");
    }

    // Different step
    public abstract void addToppings();
}
