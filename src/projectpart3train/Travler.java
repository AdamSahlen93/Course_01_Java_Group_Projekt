package projectpart3train;

import java.util.ArrayList;
import java.util.Scanner;


public class Travler {
	//List containing the passengers
	ArrayList <Passenger> passengerList = new ArrayList <Passenger>();
	
	//Method showing the passengers
	public void showList() {
		//Create a foorLoop to keep track on the amount of passengers in the list.
		for (int i = 0; i < passengerList.size(); i++) {
			//Print out the passengers.
			System.out.println("Passenger: " );
		}
	}
	
	//Create a method to Creates passengers
	public void createPassenger(String firstName, String lastName, int age) {
		Scanner scanner = new Scanner(System.in);
		//Check for the passengers name and age and store value in a local variable using scanner and set to variable in class Passanger.
		System.out.println("Hello, what is your name?");
		firstName = scanner.nextLine();
		System.out.println("And your lastname please?");
		lastName = scanner.nextLine();
		System.out.println("Welcome onboard " + firstName + " " + lastName + ". How old are you?");
		age = scanner.nextInt();
		//Instaciate a new object passenger to the class Travler, the object in loaded with the varibles demanded by the the constructor Passenger from the class Passenger.
		Passenger passenger = new Passenger(firstName, lastName, age);
		passengerList.add(passenger);
	}
	
	//Adds to list
	

}
