package u_clinic_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class NurseTest {
	
	@Test
	public void shouldBeAbleToCreateEmpNurse() throws Exception {
		Employee underTest = new Nurse("Test Nurse");
		String expected = underTest.getName();
		assertThat(expected, is("Test Nurse"));
	}
	
	@Test
	public void nurseSalaryIsFiftyK() throws Exception {
		Nurse underTest = new Nurse("Clint Eastwood");
		int expected = underTest.getSalary();
		assertThat(expected, is(50000));
	}
	
	@Test 
	public void nurseShouldHavePatients() throws Exception {
		Nurse underTest = new Nurse("Nathan the Nice");
		int expected = underTest.getNumberOfPatients();
		assertThat(expected, is(0));
	}
	
	@Test
	public void setNumberOfPatients() throws Exception {
		Nurse underTest = new Nurse("Bill the Programmer");
		int numberOfPatients = 2;
		underTest.setNumberOfPatients(numberOfPatients);
		int expected = underTest.getNumberOfPatients();
		assertThat(expected, is(2));
	}
	
}
