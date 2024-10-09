package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);

		SimpleDateFormat sdf = new SimpleDateFormat("E yyyy.mm.dd ' at 'hh:mm:ss a");

		System.out.println("Date: " + sdf.format(d));
		System.out.println("----------------------------------------");

//date and time format
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd'/'mm'/'yyyy");
		System.out.println("Date is : " + sdf1.format(d));

		SimpleDateFormat sdf2 = new SimpleDateFormat("hh':'mm':'ss");
		System.out.println("Time is: " + sdf2.format(d));
	}

}
