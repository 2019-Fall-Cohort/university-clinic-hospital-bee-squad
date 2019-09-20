package u_clinic_hospital;

import java.util.Collection;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

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
	
	@Test
	public void shouldBeAbleToReturnEmpByName() throws Exception {
		Employee testEmployee = new Employee("EmployeeTest");
		Employee testEmployee2 = new Employee("Employee Test2");
		EmployeeRoster underTestRoster = new EmployeeRoster();
		underTestRoster.addEmployeeToRoster(testEmployee);
		underTestRoster.addEmployeeToRoster(testEmployee2);
		
		Employee retrieved = underTestRoster.retrieveEmployee("EmployeeTest");
		assertThat(retrieved, is(testEmployee));
		Employee retrieved2 = underTestRoster.retrieveEmployee("Employee Test2");
		assertThat(retrieved2, is(testEmployee2));
	}
}
