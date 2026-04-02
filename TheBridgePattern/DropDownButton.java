package Structural_pattern.ex2;

public class DropDownButton extends Button{
	
	public DropDownButton(ButtonSize size) {
        super(size);
    }

    @Override
    public void draw() {
        System.out.println(size.getSize() + " Dropdown Button");
   }

}
