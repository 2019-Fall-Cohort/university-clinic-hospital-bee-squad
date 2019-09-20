package u_clinic_hospital;

public class Doctor extends Employee implements DoesBloodwork{

	private int salary = 90000;
	private String specialty = "";

	public Doctor(String name) {
		super(name);
	}

	@Override
	public void drawBlood(Patient patient, Integer amount) {
		int newBL = patient.getBloodLevel() - amount;
		patient.setBloodLevel(newBL);
		int newHL = patient.getHealthLevel() + (2*amount);
		patient.setHealthLevel(newHL);
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
