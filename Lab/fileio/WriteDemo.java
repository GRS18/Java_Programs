package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("D:\\Girish\\myfile.txt");

		FileOutputStream out = new FileOutputStream("D:\\Girish\\GRS.txt");

		int i;
		while ((i = fr.read()) != -1) {
			out.write(i);
		}
		System.out.println("File Written Successfully");
	}

}
