package u_clinic_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class PatientTest {

	@Test
	public void patientToStringShouldReferToPatientName() {
		Patient underTest = new Patient("Test Name");
		assertEquals("Patient: Test Name", underTest.toString());
	}
	
	@Test
	public void patientShouldHaveBloodLevelAndHealthLevelDefaults() throws Exception {
		
		Patient underTest = new Patient("testPatient");
		int underTestBlood = underTest.getBloodLevel();
		int underTestHealth = underTest.getHealthLevel();
		assertThat(underTestBlood, is(20));
		assertThat(underTestHealth, is(10));
	}
	
	@Test
	public void patientBLandHLShouldChangeWithDoctorBloodDraw() throws Exception {
		Patient underTest = new Patient("Test Patient");
		Doctor testDoctor = new Doctor("Test Doctor");
		testDoctor.drawBlood(underTest, 4);
		int underTestBloodLevel = underTest.getBloodLevel();
		int underTestHealthLevel = underTest.getHealthLevel();
		assertThat(underTestBloodLevel, is(16));
		assertThat(underTestHealthLevel, is(18));
	}
	
	@Test
	public void patientBLandHLShouldChangeWithNurseBloodDraw() throws Exception {
		Patient underTest = new Patient("Test Patient");
		Nurse testNurse = new Nurse("Test Nurse");
		testNurse.drawBlood(underTest, 4);
		int underTestBloodLevel = underTest.getBloodLevel();
		int underTestHealthLevel = underTest.getHealthLevel();
		assertThat(underTestBloodLevel, is(16));
		assertThat(underTestHealthLevel, is(14));
	}
}
