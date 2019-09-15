package u_clinic_hospital;

import static org.junit.Assert.*;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.Test;


public class PatientGroupTest {

	@Test
	public void shouldInstantiate() throws Exception {
		PatientGroup underTest = new PatientGroup();
	}
	
	@Test
	public void shouldBeAlbeToAddPatient() throws Exception{
		PatientGroup underTest = new PatientGroup();
		Patient testPatient = new Patient("Ben");
		
		underTest.addPatientToGroup(testPatient);
		Collection<Patient> admittedPatients = underTest.retrievePatientList();
		
		assertThat(admittedPatients, contains(testPatient));
	}
	
	@Test
	public void shouldBeAbleToAddMultiplePatients() {
		PatientGroup underTest = new PatientGroup();
		Patient testPatient1 = new Patient("Test Patient 1");
		Patient testPatient2 = new Patient("Test Patient 2");
		Patient testPatient3 = new Patient("Test Patient 3");
		Patient testPatient4 = new Patient("Test Patient 4");
		underTest.addPatientToGroup(testPatient1);
		underTest.addPatientToGroup(testPatient2);
		underTest.addPatientToGroup(testPatient3);
		underTest.addPatientToGroup(testPatient4);
		Collection<Patient> admittedPatients = underTest.retrievePatientList();
		assertThat(admittedPatients, containsInAnyOrder(testPatient1, testPatient2, testPatient3, testPatient4));		
	}
	
	@Test
	public void shouldNotAddSamePatientTwice() throws Exception {
		PatientGroup underTest = new PatientGroup();
		Patient testPatient = new Patient("Test Patient");
		underTest.addPatientToGroup(testPatient);
		underTest.addPatientToGroup(testPatient);
		Collection<Patient> admittedPatients = underTest.retrievePatientList();
		assertThat(admittedPatients.size(), is(1));
		
	}
	
	@Test
	public void shouldBeAbleToRetrievePatientByName() throws Exception {
		PatientGroup underTest = new PatientGroup();
		Patient testPatient1 = new Patient("Test Patient 1");
		Patient testPatient2 = new Patient("Test Patient 2");
		Patient testPatient3 = new Patient("Test Patient 3");
		Patient testPatient4 = new Patient("Test Patient 4");
		underTest.addPatientToGroup(testPatient1);
		underTest.addPatientToGroup(testPatient2);
		underTest.addPatientToGroup(testPatient3);
		underTest.addPatientToGroup(testPatient4);
		
		Patient retrievedPatient = underTest.retrievePatient("Test Patient 3");
		assertThat(retrievedPatient, is(testPatient3));
		
	}
}
