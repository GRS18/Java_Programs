package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.mm.dd ' at 'hh:mm:ss a");

		System.out.println("Date: " + sdf.format(d));
		System.out.println("----------------------------------------");

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd'/'mm'/'yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd' 'MMMM' 'yyyy");
		SimpleDateFormat sdf4 = new SimpleDateFormat("dd' 'MM' 'yyyy");
		SimpleDateFormat sdf3 = new SimpleDateFormat("hh'h 'mm'm 'ss's 'SS'ms 'a'['z']'");

		System.out.println("Date format 1: " + sdf1.format(d));
		System.out.println("-------------------------------------------");
		System.out.println("Date format 2: " + sdf2.format(d));
		System.out.println("-------------------------------------------");
		System.out.println("Date format 3: " + sdf4.format(d));
		System.out.println("-------------------------------------------");
		System.out.println("Time is: " + sdf3.format(d));

	}

}
