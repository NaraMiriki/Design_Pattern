package Structural_pattern.ex1;

public class UKCarPriceAdapter implements PriceCalculator{
	private UKCarPriceCalculator ukCalculator;

    public UKCarPriceAdapter(UKCarPriceCalculator ukCalculator) {
        this.ukCalculator = ukCalculator;
    }

    @Override
    public double calculatePrice() {
        double priceGBP = ukCalculator.getPrice();

        // giả sử 1 GBP = 1.3 USD
        return priceGBP * 1.3;
    }
}
