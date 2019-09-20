package u_clinic_hospital;

import java.util.Scanner;

public class UniversityHospitalApp {

	static EmployeeRoster empRoster = new EmployeeRoster();
	private static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {

		//proof of concept display all emp attributes:
		Doctor doctorTest = new Doctor("Test Doctor");
		doctorTest.setSpecialty("Test Specialty");
		empRoster.addEmployeeToRoster(doctorTest);
		Doctor doctorTest2 = new Doctor("Test Doctor2");
		doctorTest2.setSpecialty("Test Specialty2");
		empRoster.addEmployeeToRoster(doctorTest2);
		Doctor doctorTest3 = new Doctor("Test Doctor3");
		doctorTest3.setSpecialty("Test Specialty3");
		empRoster.addEmployeeToRoster(doctorTest3);
		
		Janitor janitorTest = new Janitor("Test Janitor");
		janitorTest.setSweeping(true);
		empRoster.addEmployeeToRoster(janitorTest);
		Janitor janitorTest2 = new Janitor("Test Janitor2");
		janitorTest2.setSweeping(false);
		empRoster.addEmployeeToRoster(janitorTest2);
		Janitor janitorTest3 = new Janitor("Test Janitor3");
		janitorTest3.setSweeping(true);
		empRoster.addEmployeeToRoster(janitorTest3);
		
		empRoster.displayAllEmployeeAttributes();
	}
}
