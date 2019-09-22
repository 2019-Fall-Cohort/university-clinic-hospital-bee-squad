package u_clinic_hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

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

	public void printDoctorAttributes() {
		String arrayRow = "";
		for (Employee thisOne : empList.values()) {
			if (thisOne instanceof Doctor) {
				Doctor doctor = (Doctor) thisOne;
				arrayRow = (String.format("|%-17s", doctor.getName()))
						+ (String.format("|%-10d", doctor.getEmpNumber()))
						+ (String.format("|%-10d", doctor.getSalary()))
						+ (String.format("|%-10b", doctor.getHasBeenPaid()))
						+ (String.format("|%-20s|", doctor.getSpecialty()));
				System.out.println(arrayRow);
			}
		}
	}

//	public void printNurseAttributes() {
//		String arrayRow = "";
//		for (Employee thisOne : empList.values()) {
//			if (thisOne instanceof Nurse) {
//				Nurse nurse = (Nurse) thisOne;
//				arrayRow = (String.format("|%-17s", nurse.getName())) + (String.format("|%-10d", nurse.getEmpNumber()))
//						+ (String.format("|%-10d", nurse.getSalary()))
//						+ (String.format("|%-10b", nurse.getHasBeenPaid()))
//						+ (String.format("|%-14d|", nurse.getNumberOfPatients)); // CHECK THIS
//				System.out.println(arrayRow);
//			}
//		}
//	}
//
//	public void printReceptionistAttributes() {
//		String arrayRow = "";
//		for (Employee thisOne : empList.values()) {
//			if (thisOne instanceof Receptionist) {
//				Receptionist receptionist = (Receptionist) thisOne;
//				arrayRow = (String.format("|%-17s", receptionist.getName()))
//						+ (String.format("|%-10d", receptionist.getEmpNumber()))
//						+ (String.format("|%-10d", receptionist.getSalary()))
//						+ (String.format("|%-10b", receptionist.getHasBeenPaid()))
//						+ (String.format("|%-10b|", receptionist.isOnPhoneNotAvailable()));
//				System.out.println(arrayRow);
//			}
//		}
//	}

	public void printJanitorAttributes() {
		String arrayRow = "";
		for (Employee thisOne : empList.values()) {
			if (thisOne instanceof Janitor) {
				Janitor janitor = (Janitor) thisOne;
				arrayRow = (String.format("|%-17s", janitor.getName()))
						+ (String.format("|%-10d", janitor.getEmpNumber()))
						+ (String.format("|%-10d", janitor.getSalary()))
						+ (String.format("|%-10b", janitor.getHasBeenPaid()))
						+ (String.format("|%-13b|", janitor.getSweeping()));
				System.out.println(arrayRow);
			}
		}
	}
	
	void payAllEmployees() {
		if (empList.size() == 0) {
			System.out.println("An error has occured, please enter an employee");
		}else {
			List<String> randomEmpToCheck = new ArrayList<String>(empList.keySet());
			String checkName = randomEmpToCheck.get(0);
			Employee checkMyPay = retrieveEmployee(checkName);
			if (checkMyPay.getHasBeenPaid()) {
				for (Employee emp : empList.values()) {
					emp.paySalary();
				}
			}
			System.out.println("All Employees have been Paid.");
		}
	}
}