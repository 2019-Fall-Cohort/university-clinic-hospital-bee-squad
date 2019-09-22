package u_clinic_hospital;

public class Receptionist extends Employee {

	private int salary = 45000;
	private boolean isAvailable;
	
	public Receptionist(String name) {
		super(name);
	}

	@Override
	public String toString() {
		return "Receptionist: " + getName();
	}

	public void setIsAvailable(boolean b) {
		this.isAvailable = b;
	}
	
	public String returnsIsAvailable() {
		String returnMe = String.valueOf(isAvailable);
		return returnMe;
	}

	public int getSalary() {
		return salary;
	}

	
}
