package u_clinic_hospital;

import static org.junit.Assert.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

public class EmployeeTest {

	@Test
	public void employeeShouldHaveName() throws Exception {
		Employee underTest = new Employee("Test Employee");
		String result = underTest.getName();
		assertThat(result, is("Test Employee"));
	}

	@Test
	public void employeeShouldHaveNumberAndPaid() throws Exception {
		Employee underTest = new Employee("Doesnt Need A Name For This Test");
		underTest.setEmpNumber(110);

		int testEmpNumber = underTest.getEmpNumber();
		boolean testBeenPaid = underTest.getHasBeenPaid();

		assertThat(testEmpNumber, is(110));
		assertThat(testBeenPaid, is(false));
	}

	@Test
	public void shouldBeAbleToPaySalaries() throws Exception {
		Employee underTest = new Employee("Test Employee");
		underTest.paySalary();
		boolean testHasBeenPaid = underTest.getHasBeenPaid();
		assertThat(testHasBeenPaid, is(true));
	}
}
