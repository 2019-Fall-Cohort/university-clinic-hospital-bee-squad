package u_clinic_hospital;

public class Nurse extends Employee implements DoesBloodwork {
	
	private int salary = 50000;
	private int numberOfPatients;

	public Nurse(String name) {
		super(name);
	}
	
	@Override
	public void drawBlood(Patient patient, Integer amount) {
		int newBL = patient.getBloodLevel() - (2*amount);
		patient.setBloodLevel(newBL);
		int newHL = patient.getHealthLevel() + amount;
		patient.setHealthLevel(newHL);
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
