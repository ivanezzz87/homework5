package belhard.java28.entity;

public class User extends Person{
private String email;
private String password;
    public User (String inEmail, String inPassword, String inFirstName, String inLastName) {
        super(inFirstName, inLastName);
        this.email = inEmail;
        this.password = inPassword;
    }
    public void GetFullInfo () {
        System.out.println("Имя: " + this.firstName + " " + this.lastName);
        System.out.println("EMail: " + this.email);
    }
    public boolean IsPasswordCorrect (String inPass) {
        if (inPass.equals(this.password) ) {
            return true;
        } else {return false;}
    }
}
