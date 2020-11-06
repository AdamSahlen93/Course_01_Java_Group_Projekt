package projectpart3train;
import java.util.LinkedList;
import java.util.Scanner;

public class TicketCreator extends TicketOptions implements Interface {
	

    //Creates the tickets by checking the info in travelers
    Scanner ticketChoice = new Scanner(System.in);
	//List containing the passengers
	LinkedList <Passenger> passengerList = new LinkedList <>();
	
    
    //Alt: Creates the traveler in this class instead: with passenger as interface - Bins Travelers
    //Initiates types of tickets  from the ENUM AgeGroup
	
	//Method showing the passengers
	public void showList() {
		//Create a foorLoop to keep track on the amount of passengers in the list.
		for (int i = 0; i < passengerList.size(); i++) {
			//Print out the passengers.
			System.out.println("Passenger: " + passengerList.get(i).getFirstName() + " " + passengerList.get(i).getLastName() + ". Age: " + passengerList.get(i).getAge());
		}
	}
	
	//Create a method to Creates passengers
	@Override
	public void createPassenger(String firstName, String lastName, int age)
    {
		//Instaciate a new object passenger to the class Travler, the object in loaded with the variables demanded by the the constructor Passenger from the class Passenger.

		Passenger passenger = new Passenger(firstName, lastName, age);
		Scanner scanner = new Scanner(System.in);
		//Check for the passengers name and age and store value using scanner and set to variable in class Passanger.
		System.out.println("Welcome onboard, what is your first name?");
		passenger.setFirstName(scanner.nextLine());
		System.out.println("What is your last name?");
		passenger.setLastName(scanner.nextLine());
		System.out.println("Hello " + passenger.getFirstName() + " " + passenger.getLastName() + ". I need to know how old you are?");
		passenger.setAge(scanner.nextInt());
		passengerList.add(passenger);
    }

    public void createTicketType()
    {
        addTicketOptions();
        System.out.println("Which type of ticket do you want? \n 1. " + ticketOptions.get(0) +"\n 2." + ticketOptions.get(1));
        int customerChoice = ticketChoice.nextInt();

        switch (customerChoice)
        {
            case 1:

                if (passengerList.getLast().getAge() < 17)
                {
                    System.out.println("You qualify for the " + AgeGroup.JUNIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount() + "\n Here is your ticket!") ;
                    System.out.println("\n --------Ticket------");
                    
                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());

                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.JUNIOR.toString());
                }
                else if (passengerList.getLast().getAge() > 64)
                {
                    System.out.println("You qualify for the " + AgeGroup.SENIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount());
                    System.out.println("\n --------Ticket------");


                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());

                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.SENIOR.toString());
                }
                else
                {
                    System.out.println("Unfortunately you don't qualify for a discount ticket and will have to pay for the " + AgeGroup.REGULAR.toString() + " ticket!" );
                    System.out.println("Your total is: " + getSingleTicketRegular());
                    System.out.println("\n --------Ticket------");


                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());

                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.REGULAR.toString());
                }

            case 2:

                if (passengerList.getLast().getAge() < 17)
                {
                    System.out.println("You qualify for the " + AgeGroup.JUNIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getMonthlyTicketDiscount() + "\n Here is your ticket!") ;
                    System.out.println("\n --------Ticket------");



                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());

                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.JUNIOR.toString());
                }
                else if (passengerList.getLast().getAge() > 64)
                {
                    System.out.println("You qualify for the " + AgeGroup.SENIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount());
                    System.out.println("\n --------Ticket------");


                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.SENIOR.toString());
                }
                else
                {
                    System.out.println("Unfortunately you don't qualify for a discount ticket and will have to pay for the " + AgeGroup.REGULAR.toString() + " ticket!" );
                    System.out.println("Your total is: " + getMonthlyTicketRegular());
                    System.out.println("\n --------Ticket------");



                    System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());

                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.REGULAR.toString());
                }

        }

    }

}
