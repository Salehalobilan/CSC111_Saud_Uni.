//Saleh alobaylan 441102323

public class Employee {

//	- salary: double
	private double salary;
//	- department: String
	private String department;
//	- years: int
	private int years;
//	- manager: Employee
	private Employee manager;
	
	
//	+ Employee(salary: double, department: String, manager: Employee)
	public Employee(double salary, String department, Employee manager) {
		years = 0;
		if (manager.isManagerValid(null)) {
		manager = null;}
	}
//	+ getSalary(): double
	public double getsalary() {
		return salary;
	}
//	+ getDepartment(): String
	public String getDepartment() {
		return department;
	}
//	+ getManager(): Employee
	public Employee getManager() {
		return manager;
	}
//	+ changeManager(newManager: Employee): boolean
	public boolean changeManager(Employee newManager) {
		if (isManagerValid(newManager)) {
		System.out.println("Manager has been changed correctly"); return true;}
		
	else {
		System.out.println("Manager couldn’t be changed"); return false;}
	}
//	+ isManager(): boolean
	public boolean isManager() {
		
		if (manager.isManagerValid(null))
		    return true;
		else
			return false;
	}
//	- isManagerValid(manager: Employee): boolean
	private boolean isManagerValid(Employee manager) {
		if (department == manager.department) 
			return true;
		else if (manager == null)
			return false;
		else 
			return false;
	}
//	+ yearlyRaise(performance: double): boolean
	public boolean yearlyRaise(double performance) {
		if (performance >100 || performance < 0)
			return false;
		else if (performance <= 100.0 && performance >= 90.0) {
			salary =+(salary*0.15);}
		else if (performance < 90.0 && performance >= 75.0) {
			salary =+(salary*0.10);}
		else if (performance < 75.0 && performance >= 50.0) {
			salary =+(salary*0.15);}
		else if (performance < 50.0 && performance >= 25.0) {
			salary =+0;}
		else if (performance < 25.0) {
			salary =-(salary*0.15);}
		
		if (years >= 0 && years <=5) {
			salary =+ 100;
		}
		else if (years >= 6 && years <=10) {
			salary =+ 250;
		}
		else if (years >= 11) {
			salary =+ 500;
		}
		years =+ 1;
		return true;
		
	}
//	+ toString(): String
	public String toString() {
		if(manager.Employee(salary, department, manager)) {
			
			public int getYears() {
				return years;
			}
			public void setDepartment(String department) {
				this.department = department;
			}
			public double getSalary() {
				return salary;
			}
		}
		
		else if (Employee(salary, department, manager)) {
			
			
			}
			public void setDepartment(String department) {
				this.department = department;
			}
			public int getYears() {
				return years;
			}
			public double getSalary() {
				return salary;
			}
		
			
	}
	
	
	
	
	
	
	
	
	
	
}
