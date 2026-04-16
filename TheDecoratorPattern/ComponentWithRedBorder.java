package Structural_pattern.ex4;

public class ComponentWithRedBorder implements Component{
	private Component component;

    public ComponentWithRedBorder(Component component) {
        this.component = component;
    }

    @Override
    public void draw() {
        component.draw(); // vẽ gốc
        setRedBorder();   // thêm chức năng mới
    }

    private void setRedBorder() {
        System.out.println(" -> Thêm viền đỏ");
    }
}
