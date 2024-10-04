package module1;

import java.util.Scanner;

public class Employee 
{
	//MV
		private int empNo;
		private String empName;
		private double empSalary;
		
		Scanner in=new Scanner(System.in);
		
		//MF
		public void accept()
		{
			System.out.println("Enter Employee no.: ");
			empNo=in.nextInt();
			System.out.println("Enter Eployee name: ");
			empName=in.next();
			System.out.println("Enter Employee Salary: ");
			empSalary=in.nextDouble();
		}
		
		public void completeProject()
		{
			System.out.println("Project Completed");
		}
		public void checkAttendance()
		{
			System.out.println("Attendance is 100%");
		}
		public void applyLoan()
		{
			System.out.println("Applied for Loan");
		}
		public void Display()
		{
			System.out.println("Employee no: "+empNo);
			System.out.println("Employee Name: "+empName);
			System.out.println("Employee Salary: "+empSalary);
		}

}
