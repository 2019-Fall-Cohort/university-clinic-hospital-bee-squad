package u_clinic_hospital;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import org.hamcrest.Matchers.*;
import org.hamcrest.CoreMatchers.*;
import org.hamcrest.comparator.*;
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
		boolean expected = underTest.returnsIsAvailable();
		assertEquals(false, expected);
	}
	
	@Test
	public void receptionistIsNotOnPhone() throws Exception {
		Receptionist underTest = new Receptionist("Soames Forsythe");
		underTest.setIsAvailable(true);
		boolean expected = underTest.returnsIsAvailable();
		assertEquals(true, expected);
	}
	
	@Test
	public void receptionistSalaryIsFortyFiveK() throws Exception {
		Receptionist underTest = new Receptionist("Clint Eastwood");
		int expected = underTest.getSalary();
		assertThat(expected, is(45000));
	}
	
	@Test
	public void togglesReceptionistIsAvailable() throws Exception {
		Receptionist underTest = new Receptionist("Nathan Rice");
		
		underTest.setIsAvailable(true);
		underTest.toggleReceptionistIsAvailable();
		boolean expected = underTest.returnsIsAvailable();
		assertThat(expected, is(false));
		
		underTest.setIsAvailable(false);
		underTest.toggleReceptionistIsAvailable();
		boolean expected2 = underTest.returnsIsAvailable();
		assertThat(expected2, is(true));
	}

}
	
