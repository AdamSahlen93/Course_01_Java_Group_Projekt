package projectpart3train;
import java.util.Scanner;

public class TicketCreator extends TicketOptions
{
    //Creates the tickets by checking the info in travelers
    Scanner ticketChoice = new Scanner(System.in);

    
    //Alt: Creates the traveler in this class instead: with passenger as interface - Bins Travelers
    //Initiates types of tickets  from the ENUM AgeGroup

    public void createTicketType()
    {
        addTicketOptions();
        System.out.println("Which type of ticket do you want? \n 1. " + ticketOptions.get(0) +"\n 2." + ticketOptions.get(1));
        int customerChoice = ticketChoice.nextInt();

        switch (customerChoice)
        {
            case 1:

                if (traveler.passengerList.getLast().getAge() < 17)
                {
                    System.out.println("You qualify for the " + AgeGroup.JUNIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount() + "\n Here is your ticket!") ;
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.JUNIOR.toString());
                }
                else if (traveler.passengerList.getLast().getAge() > 64)
                {
                    System.out.println("You qualify for the " + AgeGroup.SENIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount());
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.SENIOR.toString());
                }
                else
                {
                    System.out.println("Unfortunately you don't qualify for a discount ticket and will have to pay for the " + AgeGroup.REGULAR.toString() + " ticket!" );
                    System.out.println("Your total is: " + getSingleTicketRegular());
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(0) + " - " + AgeGroup.REGULAR.toString());
                }

            case 2:

                if (traveler.passengerList.getLast().getAge() < 17)
                {
                    System.out.println("You qualify for the " + AgeGroup.JUNIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getMonthlyTicketDiscount() + "\n Here is your ticket!") ;
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.JUNIOR.toString());
                }
                else if (traveler.passengerList.getLast().getAge() > 64)
                {
                    System.out.println("You qualify for the " + AgeGroup.SENIOR.toString() + " ticket!");
                    System.out.println("Your total is: " + getSingleTicketDiscount());
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.SENIOR.toString());
                }
                else
                {
                    System.out.println("Unfortunately you don't qualify for a discount ticket and will have to pay for the " + AgeGroup.REGULAR.toString() + " ticket!" );
                    System.out.println("Your total is: " + getMonthlyTicketRegular());
                    System.out.println("\n --------Ticket------");
                    System.out.println("Name: " + traveler.passengerList.getLast().getFullName());
                    System.out.println("Ticket type: " + ticketOptions.get(1) + " - " + AgeGroup.REGULAR.toString());
                }

        }

    }

}
