package u_clinic_hospital;

public class Employee {

	private String name;
	private int empNumber;
	//public int salary;
	private boolean hasBeenPaid = false;

	public Employee(String name) {
		this.name = name;
	}

//	public int getSalary() {
//		return salary;
//	}
	
	public String getName() {
		return name;
	}

	public void setEmpNumber(int numberToSet) {
		this.empNumber = numberToSet;
	}

	public int getEmpNumber() {
		return empNumber;
	}

	public boolean getHasBeenPaid() {
		return hasBeenPaid;
	}

	public void paySalary() {
		this.hasBeenPaid = true;
	}
}
