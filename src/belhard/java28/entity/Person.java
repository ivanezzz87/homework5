package belhard.java28.entity;

public class Person {
    protected String firstName;
    protected String lastName;
    public Person (String inFirstName, String inLastName) {
        this.firstName = inFirstName;
        this.lastName = inLastName;
    }
    public String GetFullName () {
        return this.firstName + " " + this.lastName;
    }
}
