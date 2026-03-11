package ex2;

public class Chocolate extends Candy{
	@Override
    public void prepare() {
        System.out.println("Chuan bi socola...");
    }

    @Override
    public void packageCandy() {
        System.out.println("Dong goi socola...");
    }
}
