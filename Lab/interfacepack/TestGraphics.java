package interfacepack;

public class TestGraphics {

	public static void main(String[] args) {

		Circle circle = new Circle(12.6f);
		System.out.println("Area of Circle: " + circle.area());
		System.out.println("Perimeter of Circle" + circle.perimeter());

		System.out.println("------------------------------");

		Rectangle rectangle = new Rectangle(12, 4);
		System.out.println("Area of Reactangle: " + rectangle.area());
		System.out.println("Perimeter of Rectangle: " + rectangle.perimeter());
	}

}
