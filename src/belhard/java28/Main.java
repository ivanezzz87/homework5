package belhard.java28;

import belhard.java28.entity.User;

public class Main {

    public static void main(String[] args) {
	User user1 = new User("fm@gmail.com", "123", "Freddie", "Mercury");
	user1.GetFullInfo();
	user1.GetFullName();
	System.out.println(user1.IsPasswordCorrect("321"));
    }
}
