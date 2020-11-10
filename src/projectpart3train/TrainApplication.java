package projectpart3train;

import java.util.Scanner;

public class TrainApplication
{
	
	//int forSwitchLoop;
	int whileLoop = 0;
	Ticket ticket = new Ticket();


	//menu-Method to run the menu.
	public void menu() {
		ticket.addTicketOptions();
		//Loop (while) to run switch controlling the program
		while(whileLoop != 99) {

			try
			{


				//Output option for user to choose from.


				System.out.println("--------------Menu-------------");
				System.out.println("1. New passenger\n2. Show passengers\n3. Ticketprices\n4. Exit");
				Scanner scanner = new Scanner(System.in);
				int switchLoop = scanner.nextInt();
				//Switch
				switch (switchLoop)
				{
					case 1:
						//Instanciate a method to create a new passenger.
						ticket.createPassenger();
						ticket.createTicketType();
						break;
					case 2:
						//Instanciate a method to show a list of all the passengers onboard the train.
						ticket.showList();
						break;
					case 3:
						//Instanciate a method to show the ticketprices.
						ticket.showTicketOptions();
						break;
					case 4:
						//Will shutdown the program.
						whileLoop = 99;
						break;
					default:
						System.out.println("\nNot a valid choice\n");
				}
			}
			catch(Exception e)
			{
				System.out.println("\nNot a valid choice\n");
				menu();
			}
		}
	}
}

	
