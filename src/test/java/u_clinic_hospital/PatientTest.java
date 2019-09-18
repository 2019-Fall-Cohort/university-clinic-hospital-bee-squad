package u_clinic_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class PatientTest {

	@Test
	public void patientToStringShouldReferToStudentName() {
		Patient underTest = new Patient("Test Name");
		assertEquals("Patient: Test Name", underTest.toString());
	}
	
	@Test
	public void patientShouldHaveBloodLevelAndHealthLevelDefaults() throws Exception {
		
		Patient underTest = new Patient("testPatient");
		int underTestBlood = Patient.getBloodLevel(underTest);
		int underTestHealth = Patient.getHealthLevel(underTest);
		assertThat(underTestBlood, is(20));
		assertThat(underTestHealth, is(10));
	}
	
}
