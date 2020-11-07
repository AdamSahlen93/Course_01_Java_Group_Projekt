package projectpart3train;
import java.util.LinkedList;
import java.util.Scanner;

public class TicketCreator extends TicketOptions implements Interface {
	

    //Creates the tickets by checking the info in travelers
	//List containing the passengers
	LinkedList <Passenger> passengerList = new LinkedList <>();
	
    
    //Alt: Creates the traveler in this class instead: with passenger as interface - Bins Travelers
    //Initiates types of tickets  from the ENUM AgeGroup
	
	//Method showing the passengers
	public void showList() {
		//Create a foorLoop to keep track on the amount of passengers in the list.
        System.out.println("\n------Passengers onboard------");
		for (int i = 0; i < passengerList.size(); i++) {
			//Print out the passengers.
			System.out.println("Passenger: " + passengerList.get(i).getFirstName() + " " + passengerList.get(i).getLastName() + ". Age: " + passengerList.get(i).getAge());
		}
        System.out.println("\n");
	}
	
	//Create a method to Creates passengers

	public void createPassenger()
    {
        try
        {
            //Instaciate a new object passenger to the class Travler, the object in loaded with the variables demanded by the the constructor Passenger from the class Passenger.

            Passenger passenger = new Passenger();
            Scanner scanner = new Scanner(System.in);
            //Check for the passengers name and age and store value using scanner and set to variable in class Passanger.
            System.out.println("First name: ");
            passenger.setFirstName(scanner.nextLine());
            System.out.println("Last name: ");
            passenger.setLastName(scanner.nextLine());
            System.out.println("Age: ");
            passenger.setAge(scanner.nextInt());
            passengerList.add(passenger);

        }
        catch (Exception e)
        {
            System.out.println("\nCan not resolve age: restarting the registration\n");
            createPassenger();
        }
    }

    public void createTicketType()
    {
        try
        {
            Scanner ticketChoice = new Scanner(System.in);
            addTicketOptions();
            System.out.println("1." + ticketOptions.get(0) + "\n2." + ticketOptions.get(1));
            int customerChoice = ticketChoice.nextInt();

            switch (customerChoice)
            {
                case 1:

                    if (passengerList.getLast().getAge() < 18)
                    {
                        System.out.println("\nTicket type " + AgeGroup.JUNIOR.toString());
                        System.out.println("Price: " + getSingleTicketDiscount() + " kr");
                        System.out.println("\n--------------Ticket------------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(0) + " - " + AgeGroup.JUNIOR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                    } else if (passengerList.getLast().getAge() > 64)
                    {
                        System.out.println("\nTicket type: " + AgeGroup.SENIOR.toString());
                        System.out.println("Price: " + getSingleTicketDiscount() + " kr");
                        System.out.println("\n--------------Ticket------------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(0) + " - " + AgeGroup.SENIOR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                    } else
                    {
                        System.out.println("\nTicket type: " + AgeGroup.REGULAR.toString());
                        System.out.println("Price: " + getSingleTicketRegular() + " kr");
                        System.out.println("\n--------------Ticket------------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(0) + " - " + AgeGroup.REGULAR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                    }
                    break;

                case 2:

                    if (passengerList.getLast().getAge() < 18)
                    {
                        System.out.println("\nTicket type: " + AgeGroup.JUNIOR.toString());
                        System.out.println("Price: " + getMonthlyTicketDiscount() + " kr");
                        System.out.println("\n--------------Ticket------------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(1) + " - " + AgeGroup.JUNIOR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                    } else if (passengerList.getLast().getAge() > 64)
                    {
                        System.out.println("\nTicket type: " + AgeGroup.SENIOR.toString());
                        System.out.println("Price " + getSingleTicketDiscount() + " kr");
                        System.out.println("\n --------------Ticket-----------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(1) + " - " + AgeGroup.SENIOR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                    } else
                    {
                        System.out.println("\nTicket type: " + AgeGroup.REGULAR.toString());
                        System.out.println("Price: " + getMonthlyTicketRegular() + " kr");
                        System.out.println("\n--------------Ticket------------");
                        System.out.println("Name: " + passengerList.getLast().getFirstName() + " " + passengerList.getLast().getLastName());
                        System.out.println(ticketOptions.get(1) + " - " + AgeGroup.REGULAR.toString());
                        System.out.println("----------------------------------");
                        System.out.println("\n");
                        break;
                    }
                default:
                    System.out.println("\nNot a valid choice\n");
                    createTicketType();

            }
        }
        catch(Exception e)
        {
            System.out.println("\nNot a valid choice\n");
            createTicketType();
        }
    }
}
