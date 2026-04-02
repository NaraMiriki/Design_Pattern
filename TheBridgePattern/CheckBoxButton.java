package Structural_pattern.ex2;

public class CheckBoxButton extends Button{
	public CheckBoxButton (ButtonSize size) {
		super(size);
	}
	
	@Override
    public void draw() {
        System.out.println(size.getSize() + " Checkbox Button");
    }

}
