package date;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateDemo4 {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d);
		System.out.println("-------------------------------------------");

		TimeZone tz = TimeZone.getTimeZone("IST");
		Calendar cal = Calendar.getInstance();

		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day1 = cal.get(Calendar.DAY_OF_WEEK);
		int day2 = cal.get(Calendar.DAY_OF_YEAR);

		int m = cal.get(Calendar.MONTH);
		int y = cal.get(Calendar.YEAR);
		int h = cal.get(Calendar.HOUR);
		int m1 = cal.get(Calendar.MINUTE);
		int s = cal.get(Calendar.SECOND);

		System.out.println("Day is " + day);
		System.out.println("-------------------------------------------");
		System.out.println("Day of the Week " + day1);
		System.out.println("-------------------------------------------");
		System.out.println("Day of the year " + day2);
		System.out.println("-------------------------------------------");
		System.out.println(day + "/" + m + "/" + y + " " + h + ":" + m1 + ":" + s);
	}

}
