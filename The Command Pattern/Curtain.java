package Behavioural_pattern.ex1_1;

public class Curtain {
	 private int position = 100;

	    public void lower(int value) {
	        position = value;
	        System.out.println("Curtain lowered to " + value + "%");
	    }

	    public void raise(int value) {
	        position = value;
	        System.out.println("Curtain raised to " + value + "%");
	    }

	    public int getPosition() {
	        return position;
	    }
}
