package u_clinic_hospital;

public class Receptionist {
	
	/*Employee Name, Employee Number, 
	 * Salary, whether or not they have been paid 
	 * (For example “Phil”, 111, 90000, false)
	 * 
	 * Receptionist: All Employee data and whether they are on the phone or not
	 */

	private String name;
	private int employeeNumber;
	private int salary = 45000;
	private boolean ifPaid = true;
	// Is receptionist on phone or available?
	private boolean isAvailable = true;
	
	public Receptionist(String receptionistName) {
		this.name = receptionistName;
//		this.employeeNumber = num;
//		this.salary = sal;
	}

	@Override
	public String toString() {
		return "Receptionist: " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setEmployeeNumber(int empNumber) {
		this.employeeNumber = empNumber;
	}

	public int getEmployeeNumber() {
		return this.employeeNumber;
	}

	public boolean isOnPhoneNotAvailable() {
		this.isAvailable = false;
		return isAvailable;
	}

	
//	
//	public String getName() {
//		return name;
//	}
//	
//	public String getName() {
//		return name;
//	}
//	
	
}
