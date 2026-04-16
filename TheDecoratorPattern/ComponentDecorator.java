package Structural_pattern.ex4;

abstract class ComponentDecorator implements Component {
	protected Component decoratedComponent;
	
	public ComponentDecorator(Component decoratedComponent) {
		this.decoratedComponent = decoratedComponent;
	}
	
	@Override
    public void draw() {
        decoratedComponent.draw(); // gọi hành vi gốc
    }
}
