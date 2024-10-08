package fileio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		File file = new File("D:\\Girish\\myfile.txt");

		FileReader fr = new FileReader(file);

		BufferedReader br = new BufferedReader(fr,200);
		// 200:no.of character \s to read obj

		String str;
		while ((str = br.readLine()) != null)// to read line not ch upto 200(size given
												// while creating object)
		{
			System.out.println(str);
		}

		
	}

}
