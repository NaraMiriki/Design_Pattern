package Structural_pattern.ex2;

public class Main {
	 public static void main(String[] args) {

	        Button b1 = new RadioButton(new SmallSize());
	        Button b2 = new CheckBoxButton(new LargeSize());
	        Button b3 = new DropDownButton(new MediumSize());

	        b1.draw();
	        b2.draw();
	        b3.draw();
	    }
}
