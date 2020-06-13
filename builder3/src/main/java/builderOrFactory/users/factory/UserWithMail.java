package builderOrFactory.users.factory;

import builderOrFactory.users.User;

public class UserWithMail extends User {

    public UserWithMail() {
        this.userName = "Student1";
        this.age = 25;
        this.address = "Dluga 11, 80-827, Gdansk";
        this.email = "student1@ug.pl";
    }
}
