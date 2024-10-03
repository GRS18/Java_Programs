package module5;

public class WrapperDemo {

	public static void main(String[] args) {

		String str = "100";
		String str1 = "200";
		String str2 = "10.20";
		String str3 = "20.40";
		float num = 100.50f;
		float num1 = 98.77f;

		System.out.println("Total without wrapper class " + (str + str1));
		System.out.println("=============================================");
		System.out.println("Total Integer " + (Integer.parseInt(str) + Integer.parseInt(str1)));
		System.out.println("=============================================");
		System.out.println("Total Double " + (Double.parseDouble(str2) + Double.parseDouble(str3)));
		System.out.println("=============================================");
		System.out.println("Total Float " + (Float.parseFloat(str2) + Float.parseFloat(str3)));
		System.out.println("=============================================");
		System.out.println("Sum using float Sum " + Float.sum(num, num1));
		System.out.println("=============================================");
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Character.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}

}
