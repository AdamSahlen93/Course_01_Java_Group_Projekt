package projectpart3train;
//Creates the tickets by checking the info in travelers
//Alt: Creates the traveler in this class instead: with passenger as interface - Bins Travelers


public class PassengerProperties
{

        /*Attributes for Passenger*/
private int age;
private String firstName;
private String lastName;

         /* Construktor to be inserted here, depending on what parameters we will use.*/
            /* No constructor at the moment.*/
			//Temporary constructor to try program.


	public PassengerProperties()
    {

    }


        /*SETTERS*/

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*GETTERS */

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

}



