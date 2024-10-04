package module4;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		Circle circle1 = new Circle();
		Circle circle2 = new Circle();
		circle.accept();
		circle.calArea();
		circle.calPeri();
		circle.display();

		System.out.println("memory Address of Object circle  " + circle.hashCode());
		System.out.println("memory Address of Object circle1  " + circle1.hashCode());
		System.out.println("memory Address of Object circle2  " + circle2.hashCode());

		// compare 2 objects
		boolean result = circle.equals(circle2);
		System.out.println("Is circle 1 & circle2 Same: " + result);
		boolean result1 = circle.equals(circle);
		System.out.println("Is circle & circle Same: " + result1);

	}

}
