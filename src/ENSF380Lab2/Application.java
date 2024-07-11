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
	}
	if (choice == 2) {
		managePetInfo(); // Use Case 3: Manage Pet Info
	}
	if (choice == 3) {
		System.out.println("Select a pet from the following list: ");
		for (int i = 0; i < petArray.length; i++) {
			System.out.println(petArray[i]);
		}
		int printingChoice = scanner.nextInt();
		petArray[printingChoice].getCareProfile();
	}
	if (choice == 4) {
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
			String clientName = clientInformationScanner.next();
			
			System.out.println("Enter Client address: ");
			String clientAddress = clientInformationScanner.next();
			
			System.out.println("Enter Client contact information (phone number): ");
			String clientPhone = clientInformationScanner.next();

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
			String petName = petInformationScanner.next();
			
			System.out.println("Enter Pet Type: ");
			String petType = petInformationScanner.next();
			
			System.out.println("Enter Pet Color: ");
			String petColor = petInformationScanner.next();

			System.out.println("Enter Pet id: ");
			int petId = petInformationScanner.nextInt();

			System.out.println("Enter Pet Breed: ");
			String petBreed = petInformationScanner.next();

			System.out.println("Enter feeding instructions: ");
			String petFeedingInfo = petInformationScanner.next();

			System.out.println("Enter Medication list (seperated by commas): ");
			String medicationRaw = petInformationScanner.next();
			String[] medicationList = medicationRaw.split(",");

			System.out.println("Enter feeding instructions: ");
			String medicationInstructions = petInformationScanner.next();

			CareProfile newCareProfile = new CareProfile(petFeedingInfo, medicationList, medicationInstructions);
			
			Pet newPet = new Pet(petId, petName, petType, petColor, petBreed, newCareProfile);
			petArray[petId] = newPet;

			System.out.println("Select Owner to add the Pet to: "); // USe Case 5 - add pet to an owner - extension
			for (int i = 0; i < clientArray.length; i++) {
				System.out.println(clientArray[i]);
			}
			int selection = scanner.nextInt();
			petArray[petId].setOwner(clientArray[selection]);

		}
		if (choice == 2) { // Remove Pet logic - Use Case 6
			System.out.println("Select a pet to remove: ");
			for (int i = 0; i < petArray.length; i++) {
				System.out.println(petArray[i]);
			}
			int removalId = scanner.nextInt();
			String[] emptyThing = new String[1];
			CareProfile nullCareProfile = new CareProfile("", emptyThing, "");
			Pet nullPet = new Pet(0, "", "", "", "", nullCareProfile);
			petArray[removalId] = nullPet;
	 	}
		if (choice == 5) {
			clearConsole();
		}
	}
}