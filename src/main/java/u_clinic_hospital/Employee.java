package u_clinic_hospital;

public class Employee {

	private String name;
	private int empNumber;
	private boolean hasBeenPaid = false;

	public Employee(String name) {
		this.name = name;
	}

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
