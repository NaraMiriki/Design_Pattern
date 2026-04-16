package Structural_pattern.ex4;

public class ComponentWithRedBorder extends ComponentDecorator{
	public ComponentWithRedBorder(Component decoratedComponent) {
        super(decoratedComponent);
    }

    @Override
    public void draw() {
        super.draw(); // vẽ gốc trước
        setRedBorder();
    }

    private void setRedBorder() {
        System.out.println("Adding Red Border");
    }
}
