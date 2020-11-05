package projectpart3train;

import java.util.LinkedList;
import java.util.Scanner;


public class Traveler implements Interface {
	//List containing the passengers
	LinkedList <Passenger> passengerList = new LinkedList <Passenger>();
	
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
	public void createPassenger(String firstName, String lastName, int age) {
		//Instaciate a new object passenger to the class Travler, the object in loaded with the variables demanded by the the constructor Passenger from the class Passenger.
		Passenger passenger = new Passenger(firstName, lastName, age);
		Scanner scanner = new Scanner(System.in);
		//Check for the passengers name and age and store value in a local variable using scanner and set to variable in class Passanger.
		try {
			System.out.println("Hello, what is your name?");
			passenger.setFirstName(scanner.nextLine());
			System.out.println("And your lastname please?");
			passenger.setLastName(scanner.nextLine());
			System.out.println("Welcome onboard " + passenger.getFirstName() + " " + passenger.getLastName() + ". How old are you?");
			passenger.setAge(scanner.nextInt());
			//Adds passenger to linkedList
			passengerList.add(passenger);
		} catch (Exception e) {
			System.out.println("I need a valid age, now we have to start over...");
			createPassenger(firstName, lastName, age);
		}
		
	}

}
