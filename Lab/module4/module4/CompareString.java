package module4;

public class CompareString {

	public static void main(String[] args) {
		
		System.out.println("===================Integer========================");
		int a=100;
		int b=100;
		if(a==b)
		{
			System.out.println("Same");
		}
		
		System.out.println("===================String========================");
		String str ="Girish";
		String str1="Girish";
		if(str==str1)
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		System.out.println("===================String Object===================");
		String str3=new String("Girish");
		String str4=new String("Girish");
		
		if(str3.equals(str4))
			System.out.println("Same");
		else
			System.out.println("Not same");
		
		System.out.println("===================String Ignorecase===================");
		
		if(str3.equalsIgnoreCase("GIRISH"))
			System.out.println("Same");
		else
			System.out.println("Not same");
	}

}
