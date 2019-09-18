package u_clinic_hospital;

public class Receptionist extends Employee {
	/*Employee Name, Employee Number, 
	 * Salary, whether or not they have been paid 
	 * (For example “Phil”, 111, 90000, false)
	 * Receptionist: All Employee data and whether they are on the phone or not
	 */

	private int salary = 45000;
	
	// Is receptionist on phone or available?
	private boolean isAvailable = true;
	
	public Receptionist(String name) {
		super(name) = name;
	}

	@Override
	public String toString() {
		return "Receptionist: " + getName();
	}

	public boolean isOnPhoneNotAvailable() {
		this.isAvailable = false;
		return isAvailable;
	}

	
}
