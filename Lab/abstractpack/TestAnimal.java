package abstractpack;

abstract class Animal
{
	abstract public void sound();
	abstract public void fun1();
	abstract public void fun2();
	
	
	public void classInfo()
	{
		System.out.println("I belongs to abstract class");
	}
} 
class Dog extends Animal
{
	public void sound()
	{
		System.out.println("Dog is barking");
	}
	public void fun1()
	{
		System.out.println("this is fun1..");
	}
	public void fun2()
	{
		System.out.println("this is fun2..");
	}
}
class Lion extends Dog
{
	public void sound()
	{
		System.out.println("Lion is Roars");
	}
	public void fun1()
	{
		System.out.println("this is fun1..");
	}
	public void fun2()
	{
		System.out.println("this is fun2..");
	}
}

public class TestAnimal {

	public static void main(String[] args) {
		Dog tuffy=new Dog();
		
		tuffy.classInfo();
		
		tuffy.sound();
		tuffy.fun1();
		tuffy.fun2();
		
		System.out.println("--------------------------");
		
		Lion simba=new Lion();
		
		simba.classInfo();
		
		simba.sound();
		simba.fun1();
		simba.fun2();

	}

}
