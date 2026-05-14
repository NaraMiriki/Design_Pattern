package Behavioural_pattern.ex5;

public class EncryptionContext {
	private EncryptionStrategy strategy;

    public void setStrategy(EncryptionStrategy strategy) {
        this.strategy = strategy;
    }

    public String encrypt(String text) {

        if (strategy == null) {
            return "No encryption strategy selected!";
        }

        return strategy.encrypt(text);
    }
}
