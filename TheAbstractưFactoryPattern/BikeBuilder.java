package ex3;

public class BikeBuilder {
	 public void buildBike(BikeFactory factory) {

	        Wheel wheel = factory.getWheel();

	        wheel.createWheel();

	        System.out.println("Bike duoc tao thanh cong!");
	    }
}
