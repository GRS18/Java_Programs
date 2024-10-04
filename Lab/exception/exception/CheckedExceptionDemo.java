package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fis = new FileInputStream("D:\\Girish\\myfil.txt");
			int k;
			while ((k = fis.read()) != -1) { // -1 is used to check EOF
				System.out.print((char) k); // type casting
			}
			fis.close();
		} catch (FileNotFoundException e) {
			System.out.println("Error : Path is wrong for the file, checked the path...");
		}
	}

}

//package exception;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//
//public class CheckedExceptionDemo {
//
//	public static void main(String[] args) throws IOException, FileNotFoundException {
//		FileInputStream fis = new FileInputStream("D:\\Girish\\myfile.txt");
//		int k;
//		while ((k = fis.read()) != -1) { // -1 is used to check EOF
//			System.out.print((char) k); // type casting
//			fis.close();
//		}
//	}
//
//}
