/**
 * <h1>Application.java</h1>
 * <P>
 * This is the main file to run the application for YYC Pet Resort
 * Lab 2, Exercise D
 * </p>
 * <p>
 * <b>Submission Date:</b> July 11th, 2024</p>
 * @author Adam Yuen, Shahed Issa
 * @Version 1.0
 * 
 */

//HELLO FRIENDS HELLO FRIENDS HELLO FRIENDS HELLO FRIENDS HELLO FRIENDS HELLO FRIENDS HELLO FRIENDS

 package ENSF380Lab2;
 import java.util.Scanner;
 
 public class Application {

	public static Client[] clientArray = new Client[10];
	public static Pet[] petArray = new Pet[10];
	public static void main(String[] args) throws InvalidIdException {
	mainMenu();
	}
	 
	 
	 // Method for Menu UI.
	 
	 
	public static void mainMenu() throws InvalidIdException {
		System.out.println("YYC PET RESORT MANAGMENT SOFTWARE");
		System.out.println("Select the following options: ");
		System.out.println("1. Manage Client Information"); // Use Case 1: Manage Client Information
		System.out.println("2. Manage Pet Information");
		System.out.println("3. Print Information Sheet");
		System.out.println("4. Access Billing and Payment Info");
		System.out.println("5. Access Bookings and Reservations");
		System.out.println("6. Exit\n\n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			clearConsole();
			manageClientelleMenu();
			mainMenu(); 
		}
		if (choice == 2) {
			managePetInfo();
			mainMenu(); // Use Case 3: Manage Pet Info
		}
		if (choice == 3) {
			System.out.println("Select a pet from the following list: "); // Use Case 7: Print info sheet
			for (int i = 0; i < petArray.length; i++) {
				System.out.printf("%d. %s\n", i, petArray[i]);
			}
			System.out.println("Were a pet to exist in our database, we could choose one from here to delete.");
			int printingChoice = scanner.nextInt();
			petArray[printingChoice].getCareProfile();

			/* 
				Case 8 would be implemented here, but our current implementation of the 
				CareProfile does not reflect real world use cases. sometimes a staff member or admin might not
				be able to enter all of a pet's pertininent information at once, and this use case serves as a "contingency" to ensure
				that all of the info is there so that they do not need to reprint the info sheets.
				this is important so that the staff can have access without having to search any information in the database. 
			*/ 
			mainMenu();
		}
		if (choice == 4) { // Use case 9
			clearConsole();
			System.out.println("Selecting this option will pull up a list of clients to choose from."+ 
			"Choosing a client will allow to view their financial standing with the pet resort, including any outstanding payments, payment history, potential payment poits, and more." +
			"The user will also have the option to return to the main menu.");
		}
		if (choice == 5) { // Use case 10
			clearConsole();
			System.out.println("Selecting this option will show a calendar view of all scheduled reservations and bookings." +
			"There will be options to add a new booking, remove a booking, and view the details of a booking.");
		}
				if (choice == 6) {
			clearConsole();
		}
	}

	public static void clearConsole() {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
}
	
	public static void manageClientelleMenu() throws InvalidIdException {
		System.out.println("YYC PET RESORT MANAGMENT SOFTWARE - Manage Client Information");
		System.out.println("Select the following options: ");
		System.out.println("1. Add Client Information"); // Use Case 2: Add Client
		System.out.println("2. Exit\n\n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			Scanner clientInformationScanner = new Scanner(System.in);
			System.out.println("Enter Client name: ");
			String clientName = clientInformationScanner.nextLine();
			
			System.out.println("Enter Client address: ");
			String clientAddress = clientInformationScanner.nextLine();
			
			System.out.println("Enter Client contact information (phone number): ");
			String clientPhone = clientInformationScanner.nextLine();

			System.out.println("Enter Client id: ");
			int clientId = clientInformationScanner.nextInt();
			
			Client client = new Client(clientId, clientName, clientPhone, clientAddress);
			clientArray[clientId] = client;
		}
		if (choice == 2) {
			clearConsole();
		}
	}

	public static void managePetInfo() throws InvalidIdException {
		System.out.println("YYC PET RESORT MANAGMENT SOFTWARE - Manage Pet Information");
		System.out.println("Select the following options: ");
		System.out.println("1. Add Pet"); // Use Case 4: Add Pet
		System.out.println("2. Remove Pet"); // Use Case 6: Remove Pet
		System.out.println("3. Exit\n\n");
		
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		if (choice == 1) {
			Scanner petInformationScanner = new Scanner(System.in);
			System.out.println("Enter Pet name: ");
			String petName = petInformationScanner.nextLine();
			
			System.out.println("Enter Pet Type: ");
			String petType = petInformationScanner.nextLine();
			
			System.out.println("Enter Pet Color: ");
			String petColor = petInformationScanner.nextLine();

			System.out.println("Enter Pet Breed: ");
			String petBreed = petInformationScanner.nextLine();

			System.out.println("Enter feeding instructions: ");
			String petFeedingInfo = petInformationScanner.nextLine();

			System.out.println("Enter Medication list (seperated by commas): ");
			String medicationRaw = petInformationScanner.nextLine();
			String[] medicationList = medicationRaw.split(",");

			System.out.println("Enter medication instructions: ");
			String medicationInstructions = petInformationScanner.nextLine();

			System.out.println("Enter Pet id: ");
			int petId = petInformationScanner.nextInt();

			CareProfile newCareProfile = new CareProfile(petFeedingInfo, medicationList, medicationInstructions);
			
			Pet newPet = new Pet(petId, petName, petType, petColor, petBreed, newCareProfile);
			petArray[petId] = newPet;

			System.out.println("Select Owner to add the Pet to: "); // USe Case 5 - add pet to an owner - extension
			for (int i = 0; i < clientArray.length; i++) {
				System.out.printf("%d. %s\n", i, clientArray[i]);
			}
			int selection = scanner.nextInt();
			petArray[petId].setOwner(clientArray[selection]);

		}
		if (choice == 2) { // Remove Pet logic - Use Case 6
			System.out.println("Select a pet to remove: ");
			for (int i = 0; i < petArray.length; i++) {
				System.out.printf("%d. %s\n", i, petArray[i]);
			}
			int removalId = scanner.nextInt();
			String[] emptyThing = new String[1];
			CareProfile nullCareProfile = new CareProfile("", emptyThing, "");
			Pet nullPet = new Pet(0, "", "", "", "", nullCareProfile);
			petArray[removalId] = nullPet;
		}	
	}
 }