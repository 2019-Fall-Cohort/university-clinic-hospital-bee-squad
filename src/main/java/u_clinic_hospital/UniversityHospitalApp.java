package u_clinic_hospital;

import java.util.Scanner;

public class UniversityHospitalApp {

	static EmployeeRoster empRoster = new EmployeeRoster();
	private static Scanner userInput = new Scanner(System.in);

	public static void main(String[] args) {

		// proof of concept display all emp attributes:
		Doctor doctorTest = new Doctor("Test Doctor");
		doctorTest.setSpecialty("Test Specialty");
		empRoster.addEmployeeToRoster(doctorTest);
		Doctor doctorTest2 = new Doctor("Test Doctor2");
		doctorTest2.setSpecialty("Test Specialty2");
		empRoster.addEmployeeToRoster(doctorTest2);
		Doctor doctorTest3 = new Doctor("Test Doctor3");
		doctorTest3.setSpecialty("Test Specialty3");
		empRoster.addEmployeeToRoster(doctorTest3);
		
		Nurse nurseTest = new Nurse("Test Nurse");
		nurseTest.setNumberOfPatients(11);
		empRoster.addEmployeeToRoster(nurseTest);
		Nurse nurseTest2 = new Nurse("Test Nurse2");
		nurseTest2.setNumberOfPatients(1);
		empRoster.addEmployeeToRoster(nurseTest2);
		Nurse nurseTest3 = new Nurse("Test Nurse3");
		nurseTest3.setNumberOfPatients(300);
		empRoster.addEmployeeToRoster(nurseTest3);
		
		Receptionist receptionistTest = new Receptionist("Test Receptionist");
		receptionistTest.setIsAvailable(true);
		empRoster.addEmployeeToRoster(receptionistTest);
		Receptionist receptionistTest2 = new Receptionist("Test Receptionist2");
		receptionistTest2.setIsAvailable(true);
		empRoster.addEmployeeToRoster(receptionistTest2);
		Receptionist receptionistTest3 = new Receptionist("Test Receptionist3");
		receptionistTest3.setIsAvailable(false);
		empRoster.addEmployeeToRoster(receptionistTest3);

		Janitor janitorTest = new Janitor("Test Janitor");
		janitorTest.setSweeping(true);
		empRoster.addEmployeeToRoster(janitorTest);
		Janitor janitorTest2 = new Janitor("Test Janitor2");
		janitorTest2.setSweeping(false);
		empRoster.addEmployeeToRoster(janitorTest2);
		Janitor janitorTest3 = new Janitor("Test Janitor3");
		janitorTest3.setSweeping(true);
		empRoster.addEmployeeToRoster(janitorTest3);
		
		

		displayAllEmployeeAttributes();
	}

	private static void displayAllEmployeeAttributes() {
		String arrayRow = "";
		System.out.println("ALL HOSPITAL EMPLOYEES:");

		System.out.println("Doctors:");
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-10s", "Emp #"))
				+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
				+ (String.format("|%-20s|", "Specialty"));
		System.out.println(arrayRow);
		System.out.println("|-----------------|----------|----------|----------|--------------------|");
		empRoster.printDoctorAttributes();
		System.out.println();

		 System.out.println("Nurses:");
		 arrayRow = (String.format("|%-17s", "Name"))
		 + (String.format("|%-10s", "Emp #"))
		 + (String.format("|%-10s", "Salary"))
		 + (String.format("|%-10s", "Paid?"))
		 + (String.format("|%-14s|", "# of Patients"));
		 System.out.println(arrayRow);
		 System.out.println("|-----------------|----------|----------|----------|--------------|");
		 empRoster.printNurseAttributes();
		 System.out.println();
		
		 System.out.println("Receptionists:");
		 arrayRow = (String.format("|%-17s", "Name"))
		 + (String.format("|%-10s", "Emp #"))
		 + (String.format("|%-10s", "Salary"))
		 + (String.format("|%-10s", "Paid?"))
		 + (String.format("|%-10s|", "Is Available?"));
		 System.out.println(arrayRow);
		 System.out.println("|-----------------|----------|----------|----------|----------|");
		 empRoster.printReceptionistAttributes();
		 System.out.println();

		System.out.println("Janitors:");
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-10s", "Emp #"))
				+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
				+ (String.format("|%-13s|", "Is Sweeping?"));
		System.out.println(arrayRow);
		System.out.println("|-----------------|----------|----------|----------|-------------|");
		empRoster.printJanitorAttributes();
		System.out.println();
	}
}
