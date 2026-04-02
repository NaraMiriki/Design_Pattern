package Structural_pattern.ex2;

public abstract class Button {
	protected ButtonSize size;
	
	public Button(ButtonSize size) {
		this.size = size;
	}
	
	public abstract void draw();
}
