package u_clinic_hospital;

import java.util.Scanner;

public class UniversityHospitalApp {

	static EmployeeRoster empRoster = new EmployeeRoster();
	private static Scanner userInput = new Scanner(System.in);

	static boolean stayInMenu = true;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the University Hospital");
		System.out.println();
		stayInMenu = true;
		while (stayInMenu) {
			displayMainMenu();
			determineMainAction();
			
		}
		
//		// proof of concept display all emp attributes:
//		Doctor doctorTest = new Doctor("Test Doctor");
//		doctorTest.setSpecialty("Test Specialty");
//		empRoster.addEmployeeToRoster(doctorTest);
//		Doctor doctorTest2 = new Doctor("Test Doctor2");
//		doctorTest2.setSpecialty("Test Specialty2");
//		empRoster.addEmployeeToRoster(doctorTest2);
//		Doctor doctorTest3 = new Doctor("Test Doctor3");
//		doctorTest3.setSpecialty("Test Specialty3");
//		empRoster.addEmployeeToRoster(doctorTest3);
//
//		Janitor janitorTest = new Janitor("Test Janitor");
//		janitorTest.setSweeping(true);
//		empRoster.addEmployeeToRoster(janitorTest);
//		Janitor janitorTest2 = new Janitor("Test Janitor2");
//		janitorTest2.setSweeping(false);
//		empRoster.addEmployeeToRoster(janitorTest2);
//		Janitor janitorTest3 = new Janitor("Test Janitor3");
//		janitorTest3.setSweeping(true);
//		empRoster.addEmployeeToRoster(janitorTest3);
//
//		displayAllEmployeeAttributes();
	}

	private static void determineMainAction() {
		int userSelection = userInput.nextInt();
		userInput.nextLine();
		
		switch (userSelection) {
		case 1:
			addNewEmployee();
			break;
		case 2:
			displayAllEmployeeAttributes();
			break;
		case 3:
			doctorsPerformRounds();
		case 4:
			nursesPerformRounds();
		case 5:
			payAllEmployees();
		case 6:
			stayInMenu = false;
			System.out.println("Thank you.  Have a great day.");
			System.exit(0);
		}
	}

	private static void displayMainMenu() {
		System.out.println("Please select an option:");
		System.out.println("1:  Add an Employee");
		System.out.println("2:  Check Employee Roster");
		System.out.println("3:  Send all Doctors on their rounds");
		System.out.println("4:  Send all Nurses on their rounds");
		System.out.println("5:  Pay all employees");
		System.out.println("6:  Exit application.");
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

		// System.out.println("Nurses:");
		// arrayRow = (String.format("|%-17s", "Name"))
		// + (String.format("|%-10s", "Emp #"))
		// + (String.format("|%-10s", "Salary"))
		// + (String.format("|%-10s", "Paid?"))
		// + (String.format("|%-14s|", "# of Patients"));
		// System.out.println(arrayRow);
		// System.out.println("|-----------------|----------|----------|----------|--------------|");
		// empRoster.printNurseAttributes();
		// System.out.println();
		//
		// System.out.println("Receptionists:");
		// arrayRow = (String.format("|%-17s", "Name"))
		// + (String.format("|%-10s", "Emp #"))
		// + (String.format("|%-10s", "Salary"))
		// + (String.format("|%-10s", "Paid?"))
		// + (String.format("|%-10s|", "On Phone?"));
		// System.out.println(arrayRow);
		// System.out.println("|-----------------|----------|----------|----------|----------|");
		// empRoster.printReceptionistAttributes();
		// System.out.println();

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
