package builderOrFactory.users.factory;

import builderOrFactory.users.User;

public class UserWithMailAndPhoneNumber extends User {

    public UserWithMailAndPhoneNumber() {
        this.userName = "Student3";
        this.age = 26;
        this.address = "Dluga 12, 80-827, Gdansk";
        this.phoneNumber = 123456789;
        this.email = "student3@ug.pl";
    }

}
