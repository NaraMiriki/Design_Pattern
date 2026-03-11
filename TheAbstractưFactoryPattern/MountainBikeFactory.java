package ex3;

public class MountainBikeFactory implements BikeFactory{
	@Override
    public Wheel getWheel() {
        return new MountainBikeWheel();
    }
}
