package projectpart3train;

import java.util.ArrayList;
import java.util.Scanner; 

public class Travler {
		
	ArrayList <Passenger> passengerList = new ArrayList <Passenger>();
	
    public void createNewPassenger() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Hello and welcome to this train!\nWhat is your first name?");
    	String firstName = scanner.nextLine();
    	System.out.println("What is your last name?");
    	String lastName = scanner.nextLine();
    	String fullName = firstName + " " + lastName;
    	Passenger passenger = new Passenger(0, firstName, lastName, fullName);
    	passengerList.add(passenger);
    	
    	System.out.println("I need to know how old you are to know what price you will pay.\nHow old are you? ");
    	int age = scanner.nextInt();
    	// Here goes the loop to check for age, and what price to pay.
    	
    }
}
