package interfacepack;

public class Rectangle implements Graphics {

	private float length;
	private float breadth;

	public Rectangle(float length, float breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	public float area() {
		return (length * breadth);
	}

	public float perimeter() {
		return (2 * (length + breadth));
	}

}
