package JavaPrograms2;

public class MathDemo {

	public static void main(String[] args) 
	{
		System.out.println("Squareroot: "+Math.sqrt(144));
		System.out.println("Convert into +ve: "+Math.abs(-17));
		System.out.println("Minimum: "+Math.min(57,78));
		System.out.println("Maximum: "+Math.max(99,67));
		System.out.println("Random no.is: "+Math.random());
		
		double d=(int)(Math.random()*100);
		System.out.println("d is: "+d);
		
		System.out.println("Round Figure: "+Math.round(29.876));
		System.out.println("power: "+Math.pow(2,3));
		
		System.out.println("Ceil: "+Math.ceil(500.98));
		System.out.println("Floor: "+Math.floor(500.77));
		System.out.println("Decrement exact: "+Math.decrementExact(45));
		System.out.println("Decrement exact: "+Math.incrementExact(32));
		
		
	}

}
