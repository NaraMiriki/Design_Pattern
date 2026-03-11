package ex2;

public class CandyStore {
	private CandyFactory factory;

    public CandyStore(CandyFactory factory) {
        this.factory = factory;
    }

    public Candy orderCandy(String type) {

        Candy candy = factory.getCandy(type);

        if (candy != null) {
            candy.prepare();
            candy.packageCandy();
        }

        return candy;
    }
}
