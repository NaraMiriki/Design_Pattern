package ex2;

public class CandyFactory {
	public Candy getCandy(String type) {

        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase("hard")) {
            return new HardCandy();
        }
        else if (type.equalsIgnoreCase("chocolate")) {
            return new Chocolate();
        }

        return null;
    }
}
