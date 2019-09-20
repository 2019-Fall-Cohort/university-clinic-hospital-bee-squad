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
	
	public void displayAllEmployeeAttributes() {
		String arrayRow = "";
		for Employee thisOne : empList.values()){
			if (thisOne instanceof Doctor) {
				Doctor doctor = (Doctor) thisOne;
				arrayRow = (String.format("|%-12s",  doctor.getName()))
						+ (String.format(format, args))
//			arrayRow = (String.format("|%-10s", roboticDragon.getName()))
//					+ (String.format("|%-10s", roboticDragon.getElement()))
//					+ (String.format("|%-10d", roboticDragon.getOil()))
//					+ (String.format("|%-10d", roboticDragon.getBattery()))
//					+ (String.format("|%-10d", roboticDragon.getBoredom()))
//					+ (String.format("|%-10d|", roboticDragon.getMagic()));
//			System.out.println(arrayRow);
//		if (pet instanceof OrganicDragon) {
//			OrganicDragon organicDragon = (OrganicDragon) pet;
//			arrayRow = (String.format("|%-10s", organicDragon.getName()))
//					+ (String.format("|%-10s", organicDragon.getElement()))
//					+ (String.format("|%-10d", organicDragon.getHunger()))
//					+ (String.format("|%-10d", organicDragon.getFatigue()))
//					+ (String.format("|%-10d", organicDragon.getBoredom()))
//					+ (String.format("|%-10d|", organicDragon.getMagic()));
//			System.out.println(arrayRow);
//		}
//	}
//}
}
