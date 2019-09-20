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
		underTest.isOnPhone();
		boolean expected = underTest.returnsIsAvailable();
		assertEquals(false, expected);
	}
	
	@Test
	public void receptionistIsNotOnPhone() throws Exception {
		Receptionist underTest = new Receptionist("Soames Forsythe");
		underTest.isNotOnPhone();
		boolean expected = underTest.returnsIsAvailable();
		assertEquals(true, expected);
	}
	
	@Test
	public void receptionistSalaryIsFortyFiveK() throws Exception {
		Receptionist underTest = new Receptionist("Clint Eastwood");
		int expected = underTest.getSalary();
		assertThat(expected, is(45000));
	}
	
}
	
