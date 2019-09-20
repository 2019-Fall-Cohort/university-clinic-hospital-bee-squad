package u_clinic_hospital;

public class Nurse extends Employee {
	
	private int salary = 50000;
	private int numberOfPatients;

	public Nurse(String name) {
		super(name);
	}

	public int getSalary() {
		return salary;
	}

	public int getNumberOfPatients() {
		return numberOfPatients;
	}

	public void setNumberOfPatients(int numberToSet) {
		numberOfPatients = numberToSet;
	}

}
