package u_clinic_hospital;

public class Doctor extends Employee {

	private int salary = 90000;
	private String specialty = "";

	public Doctor(String name) {
		super(name);
	}

	public int getSalary() {
		return salary;
	}

	public void setSpecialty(String specialityToSet) {
		this.specialty = specialityToSet;
	}

	public String getSpecialty() {
		return specialty;
	}

}
