package projectpart3train;

import java.util.Scanner;

public class Menu {
	
	//int forSwitchLoop;
	int forWhileLoop = 0;
	TicketCreator ticketCreator = new TicketCreator();
	//menu-Method to run the menu.
	public void menu() {
	
		//Loop (while) to run switch controlling the program
		while(forWhileLoop != 99) {	
		//Output option for user to choose from.

		System.out.println("--------------Menu-------------");
		System.out.println("Choose one of the following, press:\n1. To register a new passenger.\n2. Look at the list of all passengers onboard.\n3. To check the ticketprices.\n4. To close the program.");
		Scanner scanner = new Scanner(System.in);
		int forSwitchLoop = scanner.nextInt();
			//Switch
			switch (forSwitchLoop) {
			case 1: 
				//Instanciate a method to create a new passenger.
				ticketCreator.createPassenger();
				ticketCreator.createTicketType();
				break;
			case 2:
				//Instanciate a method to show a list of all the passengers onboard the train.
				ticketCreator.showList();
				break; 
			case 3: 
				//Instanciate a method to show the ticketprices.
				ticketCreator.addTicketOptions();
				ticketCreator.showTicketOptions();
				break;
			case 4: 
				//Will shutdown the program.
				forWhileLoop = 99;
				break;
				default:
					System.out.println("Something went wrong, try again!");


			}
		}
	}
}

	
