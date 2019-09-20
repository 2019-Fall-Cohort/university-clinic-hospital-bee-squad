package u_clinic_hospital;

public class Patient {

	private String name;
	private int Blood_Level = 20;
	private int Health_Level = 10;
	
	public Patient(String patientName) {
		this.name = patientName;
	}

	@Override
	public String toString() {
		return "Patient: " + name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getBloodLevel() {
		return Blood_Level;
	}

	public int getHealthLevel() {
		return Health_Level;
	}

	public void setBloodLevel(int newBL) {
		Blood_Level = newBL;
	}

	public void setHealthLevel(int newHL) {
		Health_Level = newHL;
	}

}
