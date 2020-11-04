package projectpart3train;

import java.util.Scanner;

public class Menu {

	Traveler traveler = new Traveler();
	int whileLoop;
	
	public void menu () {
		
		while (whileLoop != 99) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("-----------Menu-----------");
			System.out.println("Choose one of the options below:\n1. Register a new passenger.\n2. Print a list of all the passengers onboard the train.\n3. Close the program.");
			int choice = scanner.nextInt();
			
			//Wanna try to make a try catch loop to catch exceptions like letters instead of numbers? 
			
			switch (choice) {
			case 1: 
				traveler.createNewPassenger();
				// Start a method to run the program.
				break;
			case 2: 
				// Print a list of passengers.
				break;
			case 3: 
				// Choice to end the program.
				whileLoop = 99; // Closes the while-loop
			
			}
			
		}
		
	}
	
}
