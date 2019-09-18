package u_clinic_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class DoctorTest {

	@Test
	public void shouldBeAbleToCreateEmpDoctor() throws Exception {
		Employee underTest = new Doctor("Test Doctor");
		String expected = underTest.getName();
		assertThat(expected, is("Test Doctor"));
	}

	@Test
	public void doctorSalaryIsNinetyk() throws Exception {
		Doctor underTest = new Doctor("Test Doctor");
		int testSalary = underTest.getSalary();
		assertThat(testSalary, is(90000));
	}

	@Test
	public void shouldHaveSpecialty() throws Exception {
		Doctor underTest = new Doctor("Test Doctor");
		underTest.setSpecialty("Pediatrics");
		String testSpecialty = underTest.getSpecialty();
		assertThat(testSpecialty, is("Pediatrics"));
	}
}
