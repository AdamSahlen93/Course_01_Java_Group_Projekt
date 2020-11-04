package projectpart3train;
import java.util.Scanner;

public class CreateTicket {
	
	
    public void createNewTicket() {
    	
        Passenger passenger = new Passenger(44);
        Scanner scanTicket = new Scanner(System.in);

        int ticketType; // variabeln styr Switch-case.

        System.out.println("Choose type of ticket :");
        System.out.println("1. Oneway ticket");
        System.out.println("2. Monthly ticket");

        ticketType = scanTicket.nextInt();

        switch (ticketType) {
            case 1:
                System.out.println("**One way ticket**");
                if(passenger.getAge() < 18 || passenger.getAge() > 65) {
                    System.out.println("test1 / cheap ticket");
                } else {
                    	System.out.println("test 1 / normal ticket");
                    }
                break;

            case 2:
                System.out.println("**Monthly ticket**");
                if(passenger.getAge() < 18 || passenger.getAge() > 65)
                {
                    System.out.println("test 2 OneWayticket");
                } else {
                		System.out.println("test 2 / normal ticket");
                    }
                break;
        }

    }

}
