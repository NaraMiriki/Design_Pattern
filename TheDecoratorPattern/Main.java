package Structural_pattern.ex4;

public class Main {
	public static void main(String[] args) {

        Component circle1 = new Circle();

        // circle bình thường
        circle1.draw();

        System.out.println("-----");

        // circle có viền đỏ 
        Component circle2 = new ComponentWithRedBorder(new Circle());
        circle2.draw();
    }
}
