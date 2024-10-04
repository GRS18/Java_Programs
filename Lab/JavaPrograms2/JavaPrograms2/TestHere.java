package JavaPrograms2;

import module1.Employee;

public class TestHere {
	public static void main(String[] args) {
		Employee employee = new Employee();

		employee.accept();
		employee.Display();
		employee.checkAttendance();
		employee.completeProject();
		employee.applyLoan();

		System.out.println("==============================");

		Employee employee1 = new Employee();

		employee1.accept();
		employee1.Display();
		employee1.checkAttendance();
		employee1.completeProject();
		employee1.applyLoan();
	}

}
