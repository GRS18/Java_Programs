package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws IOException {
		
			FileInputStream fis = new FileInputStream("D:\\Girish\\myfile.txt");
			int k;
			while ((k = fis.read()) != -1) { // -1 is used to check EOF
				System.out.print((char) k); // type casting
			}
			fis.close();
	
	}

}