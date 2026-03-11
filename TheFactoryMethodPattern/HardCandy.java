package ex2;

public class HardCandy extends Candy {
	@Override
    public void prepare() {
        System.out.println("Chuan bi keo cung...");
    }

    @Override
    public void packageCandy() {
        System.out.println("Dong goi keo cung...");
    }
}
