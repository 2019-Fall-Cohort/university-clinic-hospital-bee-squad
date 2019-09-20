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
	
	
	
}
