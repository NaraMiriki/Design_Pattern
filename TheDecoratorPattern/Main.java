package Structural_pattern.ex4;

public class Main {
	    public static void main(String[] args) {

	        Component circle = new Circle();

	        System.out.println("Circle bình thường:");
	        circle.draw();

	        System.out.println("\nCircle có viền đỏ:");
	        Component redCircle = new ComponentWithRedBorder(circle);
	        redCircle.draw();
	   }
}


/*Khi muốn thêm tính năng mới cho các đối tượng mà không ảnh hưởng đến các đối tượng này.
Khi không thể mở rộng một đối tượng bằng cách thừa kế (inheritance). Chẳng hạn, một class sử dụng từ khóa final, muốn mở rộng class này chỉ còn cách duy nhất là sử dụng decorator.
Trong một số nhiều trường hợp mà việc sử dụng kế thừa sẽ mất nhiều công sức trong việc viết code.*/
