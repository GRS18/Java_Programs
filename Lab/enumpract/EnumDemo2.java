package enumpract;

enum Months {
	jan, feb, mar, apr, may, jun;
}

public class EnumDemo2 {

	public static void main(String[] args) {

		Months m = Months.feb;
//		System.out.println(m);
		switch (m) {

		case jan:
			System.out.println("This is First Month of the year.....");
			break;
		case feb:
			System.out.println("Month of Love❤️😍💕😘.....");
			break;
		case mar:
			System.out.println("Pay Remaning Taxes.....");
			break;
		case apr:
			System.out.println("April Full to all....");
			break;
		case may:
			System.out.println("Oooo... What's high temprature......");
			break;

		}

	}

}
