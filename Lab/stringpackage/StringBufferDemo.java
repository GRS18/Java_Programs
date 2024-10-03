package stringpackage;

public class StringBufferDemo {

	public static void main(String[] args) {

		StringBuffer strb = new StringBuffer("Girish");

		System.out.println("------------------------------------");
		System.out.println(strb.append("in cdac NASAHIK"));

		System.out.println("--------------indexof---------------");
		int i = strb.indexOf("r");
		System.out.println("i is = " + i);

		System.out.println("--------------lastindexof----------------");
		int la = strb.lastIndexOf("d");
		System.out.println(la);

		System.out.println("--------------delete--------------------");
		strb.delete(6, 8);
		System.out.println(strb);

		System.out.println("---------------Reverse------------------");
		System.out.println(strb.reverse());

	}

}
