package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo1 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\Girish\\myfile123.txt");
			int k;
			while ((k = fis.read()) != -1) { // -1 is used to check EOF
				System.out.print((char) k); // type casting
			}
			fis.close();
		} catch (IOException e) {
			System.out.println("The path of file is wrongly given......");
			System.out.println(e.getMessage());
		}

	}

}
