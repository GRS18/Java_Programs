package module2;

public class OrDemo {

	public static void main(String[] args) {
		int a=2000;
		int b=300;
		int c=90000;
		
		if(a==b)
			System.out.println("Same");
		if(a>b || a>c)
			System.out.println("Any one condition is True");
		if(a!=b)
			System.out.println("Both are Different");
	}

}
