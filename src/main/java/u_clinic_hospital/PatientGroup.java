package u_clinic_hospital;

import java.util.Collection;
import java.util.HashMap;

public class PatientGroup {

	HashMap<String, Patient> patientList;

	public PatientGroup() {
		patientList = new HashMap<>();
		Patient jessika = new Patient("Jessika");
		patientList.put("Jessika", jessika);
		Patient nathan = new Patient("Nathan");
		patientList.put("Nathan", nathan);
		Patient je$$iqua = new Patient("Je$$iqua");
		patientList.put("Je$$iqua", je$$iqua);
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

	public void printPatientAttributes() {
		String arrayRow = "";
		for (Patient thisOne : patientList.values()) {
			arrayRow = (String.format("|%-17s", thisOne.getName())) + (String.format("|%-12d", thisOne.getBloodLevel()))
					+ (String.format("|%-12d|", thisOne.getHealthLevel()));
			System.out.println(arrayRow);
		}
	}

}
