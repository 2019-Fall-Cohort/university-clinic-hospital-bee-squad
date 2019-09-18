package u_clinic_hospital;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeRosterTest {

	@Test
	public void shouldBeAbleToAddEmployee() throws Exception {
		Employee testEmployee = new Employee("EmployeeTest");
		EmployeeRoster underTestRoster = new EmployeeRoster();
		underTestRoster.addEmployeeToRoster(testEmployee);
		Collection<Employee> addedEmployees = underTestRoster.retrieveEmployeeList();
		assertThat(addedEmployees, contains(testEmployee));
	}
}
