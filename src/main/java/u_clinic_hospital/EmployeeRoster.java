package u_clinic_hospital;

import java.util.Collection;
import java.util.HashMap;

public class EmployeeRoster {

	HashMap<String, Employee> empList;

	public EmployeeRoster() {
		empList = new HashMap<>();
	}

	public void addEmployeeToRoster(Employee empToAdd) {
		empList.put(empToAdd.getName(), empToAdd);
	}

	public Collection<Employee> retrieveEmployeeList() {
		return empList.values();

	}

	public Employee retrieveEmployee(String empToRetrieve) {
		return empList.get(empToRetrieve);
	}

	public void displayAllEmployeeAttributes() {
		String arrayRow = "";
		for (Employee thisOne : empList.values()) {
			if (thisOne instanceof Doctor) {
				arrayRow = (String.format("|%-12s", "Name")) + (String.format("|%-10s", "Emp #"))
						+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
						+ (String.format("|%20s", "Specialty"));
				System.out.println(arrayRow);
				System.out.println("|--------------------------------------------------------------|");
				Doctor doctor = (Doctor) thisOne;
				arrayRow = (String.format("|%-12s", doctor.getName()))
						+ (String.format("|%-10d", doctor.getEmpNumber()))
						+ (String.format("|%-10d", doctor.getSalary()))
						+ (String.format("|%-10b", doctor.getHasBeenPaid()))
						+ (String.format("|%20s", doctor.getSpecialty()));
				System.out.println(arrayRow);
			}

			// if (thisOne instanceof Nurse) {
			// arrayRow = (String.format("|%-12s", "Name"))
			// + (String.format("|%-10s", "Emp #"))
			// + (String.format("|%-10s", "Salary"))
			// + (String.format("|%-10s", "Paid?"))
			// + (String.format("|%14s", "# of Patients"));
			// System.out.println(arrayRow);
			// System.out.println("|--------------------------------------------------------|");
			// Nurse nurse = (Nurse) thisOne;
			// arrayRow = (String.format("|%-12s", nurse.getName()))
			// + (String.format("|%-10d", nurse.getEmpNumber()))
			// + (String.format("|%-10d", nurse.getSalary()))
			// + (String.format("|%-10b", nurse.getHasBeenPaid()))
			// + (String.format("|%14d", nurse.getNumberOfPatients)); //CHECK THIS VARIABLE
			// NAME
			// System.out.println(arrayRow);
			// }

			// if (thisOne instanceof Receptionist) {
			// arrayRow = (String.format("|%-12s", "Name"))
			// + (String.format("|%-10s", "Emp #"))
			// + (String.format("|%-10s", "Salary"))
			// + (String.format("|%-10s", "Paid?"))
			// + (String.format("|%10s", "On Phone?"));
			// System.out.println(arrayRow);
			// System.out.println("|----------------------------------------------------|");
			// Receptionist receptionist = (Receptionist) thisOne;
			// arrayRow = (String.format("|%-12s", receptionist.getName()))
			// + (String.format("|%-10d", receptionist.getEmpNumber()))
			// + (String.format("|%-10d", receptionist.getSalary()))
			// + (String.format("|%-10b", receptionist.getHasBeenPaid()))
			// + (String.format("|%10b", receptionist.isOnPhoneNotAvailable()));
			// System.out.println(arrayRow);
			// }

			if (thisOne instanceof Janitor) {
				arrayRow = (String.format("|%-12s", "Name")) + (String.format("|%-10s", "Emp #"))
						+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
						+ (String.format("|%13s", "Is Sweeping?"));
				System.out.println(arrayRow);
				System.out.println("|-------------------------------------------------------|");
				Janitor janitor = (Janitor) thisOne;
				arrayRow = (String.format("|%-12s", janitor.getName()))
						+ (String.format("|%-10d", janitor.getEmpNumber()))
						+ (String.format("|%-10d", janitor.getSalary()))
						+ (String.format("|%-10b", janitor.getHasBeenPaid()))
						+ (String.format("|%13b", janitor.getSweeping()));
				System.out.println(arrayRow);
			}
		}
	}
}