package u_clinic_hospital;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeRoster {

	HashMap<String, Employee> empList;

	public EmployeeRoster() {
		empList = new HashMap<>();
	}
	
	public void addEmployeeToRoster(Employee empToAdd) {
		empList.put(empToAdd.getName(),  empToAdd);
	}

	public Collection<Employee> retrieveEmployeeList() {
		return empList.values();
		
	}

	public Employee retrieveEmployee(String empToRetrieve) {
		return empList.get(empToRetrieve);
	}
	
}
