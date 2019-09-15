package u_clinic_hospital;

import java.util.Collection;
import java.util.HashMap;

public class PatientGroup {
	
	HashMap<String, Patient> patientList;

	public PatientGroup() {
		patientList = new HashMap<>();
	}
	
	public void addPatientToGroup(Patient testPatient) {
		patientList.put(testPatient.getName(), testPatient);
	}

	public Collection<Patient> retrievePatientList() {
		return patientList.values();
	}

	public Patient retrievePatient(String patientName) {
		return patientList.get(patientName);
	}

}
