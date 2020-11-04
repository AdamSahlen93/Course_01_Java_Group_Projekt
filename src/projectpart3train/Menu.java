package projectpart3train;

import java.util.Scanner;

public class Menu {

	int whileLoop;
	
	public void menu () {
		
		while (whileLoop != 99) {
			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();
			//Wanna try to make a try catch loop to catch exceptions like letters instead of numbers? 
			
			switch (choice) {
			case 1: 
				// Start a method to run the program.
				break;
			case 2: 
				// Print a list of passengers.
				break;
			case 3: 
				// Choice to end the program.
			
			}
			
		}
		
		
		
	}
	
}
