package u_clinic_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ReceptionistTest {
	
	@Test
	public void shouldBeAbleToCreateEmpReceptionist() throws Exception {
		Employee underTest = new Receptionist("John Wayne");
		String expected = underTest.getName();
		assertThat(expected, is("John Wayne"));
	}

	@Test
	public void receptionistToStringShouldReferToReceptionistName() throws Exception {
		Receptionist underTest = new Receptionist("Johann Wayne");
		assertEquals("Receptionist: Johann Wayne", underTest.toString());
	}

	@Test
	public void receptionistIsOnPhone() throws Exception {
		Receptionist underTest = new Receptionist("Bruce Willis");
		underTest.setIsAvailable(false);
		String expected = underTest.returnsIsAvailable();
		assertThat(expected, is("false"));
	}
	
	@Test
	public void receptionistIsNotOnPhone() throws Exception {
		Receptionist underTest = new Receptionist("Soames Forsythe");
		underTest.setIsAvailable(true);
		String expected = underTest.returnsIsAvailable();
		assertThat(expected, is("true"));
	}
	
	@Test
	public void receptionistSalaryIsFortyFiveK() throws Exception {
		Receptionist underTest = new Receptionist("Clint Eastwood");
		int expected = underTest.getSalary();
		assertThat(expected, is(45000));
	}
	
	@Test
	public void canGetValueOfReceptionistIsAvailable() {
		Receptionist underTest = new Receptionist("Gandhi");
		
		underTest.setIsAvailable(true);
		boolean expected = underTest.getIsAvailable();
		assertThat(expected, is(true));
		
		underTest.setIsAvailable(false);
		boolean expected2 = underTest.getIsAvailable();
		assertThat(expected2, is(false));
	}
	
}
	
