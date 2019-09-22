package u_clinic_hospital;

public class Receptionist extends Employee {

	private int salary = 45000;
	private boolean isAvailable = true;
	
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
	
	public boolean returnsIsAvailable() {
		return isAvailable;
	}

	public int getSalary() {
		return salary;
	}

	
}
