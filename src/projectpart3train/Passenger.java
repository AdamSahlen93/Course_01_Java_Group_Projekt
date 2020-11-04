package projectpart3train;

public class Passenger
{

private int age;
private String firstname;
private String lastName;
private String fullName;


                    /*KONSTRUKTOR*/
    public Passenger(int age, String firstname, String lastName, String fullName)
    {
        this.age = age;
        this.firstname = firstname;
        this.lastName = lastName;
        this.fullName = fullName;
    }

                    /* SETTERS*/
    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

                     /* GETTERS*/

    public int getAge() {
        return age;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return fullName;
    }
}
