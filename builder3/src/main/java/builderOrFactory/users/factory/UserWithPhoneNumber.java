package builderOrFactory.users.factory;

import builderOrFactory.users.User;

public class UserWithPhoneNumber extends User {

    public UserWithPhoneNumber() {
        this.userName = "Student2";
        this.age = 24;
        this.address = "Dluga 13, 80-827, Gdansk";
        this.phoneNumber = 987654321;
    }

}
