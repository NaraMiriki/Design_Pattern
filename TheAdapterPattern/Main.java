package Structural_pattern.ex1;

public class Main {
	public static void main(String[] args) {

        PriceCalculator car = new CarPriceCalculator();
        PriceCalculator truck = new TruckPriceCalculator();

        UKCarPriceCalculator ukCar = new UKCarPriceCalculator();
        PriceCalculator ukAdapter = new UKCarPriceAdapter(ukCar);

        System.out.println("Car: " + car.calculatePrice());
        System.out.println("Truck: " + truck.calculatePrice());
        System.out.println("UK Car (converted): " + ukAdapter.calculatePrice());
    }
}
