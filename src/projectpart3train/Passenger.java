package projectpart3train;
//Creates the tickets by checking the info in travelers
//Alt: Creates the traveler in this class instead: with passenger as interface - Bins Travelers


public class Passenger

{

        /*Attributes for Passenger*/
private int age;
private String firstName;
private String lastName;
private String fullName;

         /* Construktor to be inserted here, depending on what parameters we will use.*/
            /* No constructor at the moment.*/



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

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public String getFullName() {
        return fullName;
    }
}



