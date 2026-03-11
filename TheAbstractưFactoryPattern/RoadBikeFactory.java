package ex3;

public class RoadBikeFactory implements BikeFactory{
	 @Override
	    public Wheel getWheel() {
	        return new RoadBikeWheel();
	    }
}
