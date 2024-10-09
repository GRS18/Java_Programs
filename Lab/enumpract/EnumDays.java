package enumpract;

public class EnumDays {

	enum Days {
		SUN, MON, TUE, WED, THUR, FRI, SAT;
	}

	public static void main(String[] args) {
		
		Days d = Days.TUE;
		Days d3 = Days.SAT;
		System.out.println(d);
		System.out.println("----------------------------");

		for (Days d1 : Days.values()) {
			System.out.println(d1);
		}
		System.out.println("------------------------------");
			
		switch (d3) {

			case SUN:
				System.out.println("Sunday is holiday.....");
				break;
			case MON:
				System.out.println("Monday is First day of the week.....");
				break;
			case TUE:
				System.out.println("Tuesday.....");
				break;
			case WED:
				System.out.println("Wenesday is colorful day....");
				break;
			case THUR:
				System.out.println("Thursday......");
				break;
			case FRI:
				System.out.println("Friday......");
				break;
			case SAT:
				System.out.println("Let's Goo......");
				break;

			}
		}

	}
