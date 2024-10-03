package inheritance;

public class TestPerson {

	public static void main(String[] args) {
		Person person=new Person("Girish",22,"M");
		System.out.println(person);
		person.display();
		person.fun1();
		
		System.out.println("=======================");
		Student student = new Student("Girish",22,"M",12,"Computer",89.90);
		System.out.println(student);
		student.display();
		
		student.fun1();
		
		System.out.println("=======================");
		Employee employee = new Employee("Girish",22,"M",12,"Computer",89.90,17,"Delloite",100000);
		System.out.println(employee);
		
		System.out.println();
		System.out.println("=============Static Binding============");
		Person person1 = new Person("Girish",22,"M");//parent class
		System.out.println(person1);
		
		System.out.println();
		System.out.println("=============Dynamic Binding============");
		person1=new Student("Girish",22,"M",12,"Computer",89.90);
	//	parent		child----> Allowed
		System.out.println(person1);
		
		person1=new Employee("Girish",22,"M",12,"Computer",89.90,17,"Delloite",100000);
		System.out.println(person1);
		
	}
}

