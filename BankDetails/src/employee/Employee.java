package employee;

public class Employee {
	
	int salary;
	int bonus;
	
	void calculateSalary() {
		int totalSalary;
		totalSalary=salary+bonus;
		System.out.println("Total slaary is" +totalSalary);
	}
}