package u_clinic_hospital;

public class Patient {

	private String name;
	private static int Blood_Level = 20;
	private static int Health_Level = 10;
	
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
	
	public static int getBloodLevel(Patient underTest) {
		return Blood_Level;
	}

	public static int getHealthLevel(Patient underTest) {
		return Health_Level;
	}

}
