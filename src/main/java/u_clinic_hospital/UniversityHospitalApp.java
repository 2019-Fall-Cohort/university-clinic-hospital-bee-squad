package u_clinic_hospital;

import java.util.Scanner;

public class UniversityHospitalApp {

	static EmployeeRoster empRoster = new EmployeeRoster();
	private static Scanner userInput = new Scanner(System.in);
	public static PatientGroup admittedPatients = new PatientGroup();
	static boolean stayInMenu = true;

	public static void main(String[] args) {

		System.out.println("Welcome to the University Hospital");
		System.out.println();

		stayInMenu = true;
		while (stayInMenu) {
			displayMainMenu();
			determineMainAction();
		}

	}

	private static void determineMainAction() {
		int userSelection = userInput.nextInt();
		userInput.nextLine();

		switch (userSelection) {
		case 1:
			addNewEmployee();
			break;
		case 2:
			addAnotherPatient();
			break;
		case 3:
			displayAllEmployeeAttributes();
			break;
		// case 4:
		// doctorsPerformRounds();
		// break;
		case 5:
			nursesPerformRounds();
			break;
		case 6:
			empRoster.payAllEmployees();
			break;
		case 7:
			stayInMenu = false;
			System.out.println("Thank you.  Have a great day.");
			System.exit(0);
		}
	}

	private static void nursesPerformRounds() {
		for (Patient thisPatient : admittedPatients.retrievePatientList()) {
			Nurse doRounds = new Nurse(null);
			doRounds.drawBlood(thisPatient, 1);
			displayPatientAttributes();
		}
	}

	private static void addAnotherPatient() {
		System.out.println("How many more patients do you want to add?");
		int numberOfPatients = userInput.nextInt();
		userInput.nextLine();
		for (int i = 0; i < numberOfPatients; i++) {
			System.out.println("Please type the name of a patient to add:");
			String patientName = userInput.nextLine();
			Patient thisPatient = new Patient(patientName);
			admittedPatients.addPatientToGroup(thisPatient);
		}
		System.out.println("You have admitted " + numberOfPatients + " new patients.");
		System.out.println();
		displayPatientAttributes();
	}

	private static void displayPatientAttributes() {
		String arrayRow = "";
		System.out.println("Admitted Patients:");
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-12s", "Blood Level"))
				+ (String.format("|%-12s|", "Health Level"));
		System.out.println(arrayRow);
		System.out.println("|-----------------|------------|------------|");
		admittedPatients.printPatientAttributes();
		System.out.println();
	}

	private static void displayMainMenu() {
		System.out.println("Please select an option:");
		System.out.println("1:  Add an Employee");
		System.out.println("2:  Add another Patient (3 added as defaults)");
		System.out.println("3:  Check Employee Roster");
		System.out.println("4:  Send all Doctors on their rounds");
		System.out.println("5:  Send all Nurses on their rounds");
		System.out.println("6:  Pay all employees");
		System.out.println("7:  Exit application.");
	}

	private static void addNewEmployee() {
		System.out.println("What is the employee's name?");
		String empName = userInput.nextLine();
		System.out.println("What is the 4-digit employee number?");
		int empNumber = userInput.nextInt();
		userInput.nextLine();
		System.out.println("Is " + empName + " a (d)octor, (n)urse, (r)eceptionist, or (j)anitor?");
		String empJobTitle = userInput.nextLine();

		switch (empJobTitle) {
		case "d":
			System.out.println("What is Dr. " + empName + "'s specialty?");
			String empSpecialty = userInput.nextLine();
			Doctor doctorToAdd = new Doctor(empName);
			doctorToAdd.setEmpNumber(empNumber);
			doctorToAdd.setSpecialty(empSpecialty);
			empRoster.addEmployeeToRoster(doctorToAdd);
			break;
		case "n":
			System.out.println("How many patients does " + empName + " have?");
			int empNumberOfPatients = userInput.nextInt();
			Nurse nurseToAdd = new Nurse(empName);
			nurseToAdd.setEmpNumber(empNumber);
			nurseToAdd.setNumberOfPatients(empNumberOfPatients);
			empRoster.addEmployeeToRoster(nurseToAdd);
			break;
		case "r":
			System.out.println("Is " + empName + " (a)vailable or on the (p)hone?");
			String isAvailableReceptionist = userInput.nextLine();
			Receptionist receptionistToAdd = new Receptionist(empName);
			receptionistToAdd.setEmpNumber(empNumber);
			if (isAvailableReceptionist.equalsIgnoreCase("a")) {
				receptionistToAdd.setIsAvailable(true);
			} else if (isAvailableReceptionist.equalsIgnoreCase("p")) {
				receptionistToAdd.setIsAvailable(false);
			} else {
				System.out.println("An error has occurred with the receptionist's availability");
			}
			empRoster.addEmployeeToRoster(receptionistToAdd);
			break;
		case "j":
			System.out.println("Is " + empName + " (a)vailable or (s)weeping?");
			String isAvailableJanitor = userInput.nextLine();
			Janitor janitorToAdd = new Janitor(empName);
			janitorToAdd.setEmpNumber(empNumber);
			if (isAvailableJanitor.equalsIgnoreCase("a")) {
				janitorToAdd.setSweeping(false);
			} else if (isAvailableJanitor.equalsIgnoreCase("s")) {
				janitorToAdd.setSweeping(true);
			} else {
				System.out.println("An error has occurred with the janitor's availability");
			}
			empRoster.addEmployeeToRoster(janitorToAdd);
			break;
		}
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
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-10s", "Emp #"))
				+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
				+ (String.format("|%-14s|", "# of Patients"));
		System.out.println(arrayRow);
		System.out.println("|-----------------|----------|----------|----------|--------------|");
		empRoster.printNurseAttributes();
		System.out.println();

		System.out.println("Receptionists:");
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-10s", "Emp #"))
				+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
				+ (String.format("|%-10s|", "On Phone?"));

		System.out.println(arrayRow);
		System.out.println("|-----------------|----------|----------|----------|----------|");
		empRoster.printReceptionistAttributes();
		System.out.println();

		System.out.println("Janitors:");
		arrayRow = (String.format("|%-17s", "Name")) + (String.format("|%-10s", "Emp #"))
				+ (String.format("|%-10s", "Salary")) + (String.format("|%-10s", "Paid?"))
				+ (String.format("|%-13s|", "Sweeping?"));
		System.out.println(arrayRow);
		System.out.println("|-----------------|----------|----------|----------|-------------|");
		empRoster.printJanitorAttributes();
		System.out.println();
	}
}
