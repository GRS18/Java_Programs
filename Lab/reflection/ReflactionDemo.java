package reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Field;
import java.lang.reflect.Constructor;

class Test {
	private String s;

	public Test() {

		s = "Hello World";

	}

	public void method1() {
		System.out.println("The String is - " + s);
	}

	public void Method2(int n) {

		System.out.println("The number is - " + n);
	}

	public void method3() {
		System.out.println("Private method Invoked");
	}
}

public class ReflactionDemo {

	public static void main(String[] args) throws Exception {

		Test obj = new Test();

		Class cls = obj.getClass();

		System.out.println("The name of class is - " + cls.getName());

		// getting constructor of the class through the
		Constructor constructer = cls.getConstructor();
		System.out.println("The name of Constructer is - " + constructer.getName());

		System.out.println("The public method of class are ");
		Method[] methods = cls.getMethods();
		for (Method a : methods) {
			System.out.println(a.getName());
		}

		System.out.println("------------------------------------");
		Method methodcall1 = cls.getDeclaredMethod("Method2", int.class);
		// name parameter

		methodcall1.invoke(obj, 22);

		Field field = cls.getDeclaredField("s"); // mv s
		field.setAccessible(true);// 2
		field.set(obj, "JAVA");// 3

		Method methodcall2 = cls.getDeclaredMethod("method1");
		methodcall2.invoke(obj);

		Method methodcall3 = cls.getDeclaredMethod("method3");
		methodcall3.setAccessible(true);
		methodcall3.invoke(obj);

	}

}
