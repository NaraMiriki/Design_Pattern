package Behavioural_pattern.ex1_1;

public class Light {
	private int brightness = 100;

    public void on() {
        brightness = 100;
        System.out.println("Light ON");
    }

    public void off() {
        brightness = 0;
        System.out.println("Light OFF");
    }

    public void setBrightness(int value) {
        brightness = value;
        System.out.println("Brightness: " + value + "%");
    }

    public int getBrightness() {
        return brightness;
    }
}
