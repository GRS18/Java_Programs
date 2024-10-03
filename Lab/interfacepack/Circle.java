package interfacepack;

public class Circle implements Graphics {

	float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}

	public float area() {
		return (PI * radius * radius);
	}

	public float perimeter() {
		return (2 * PI * radius);
	}

}
