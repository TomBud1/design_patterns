package unit;

import builderOrFactory.users.User;
import builderOrFactory.users.UserType;
import builderOrFactory.users.builder.UserBuilder;
import builderOrFactory.users.factory.UserFactory;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BuilderOrFactoryUser {

    UserBuilder userBuilder;
    UserFactory userFactory;

    @Before
    public void prepare_builder() {
        this.userBuilder = new UserBuilder();
        this.userFactory = UserFactory.getInstance();
    }

    @Test
    public void build_user_with_email() {

        User userBuildWithEmail = userBuilder
                .withUserName("Student1")
                .withAge(25)
                .withAddress("Dluga 11, 80-827, Gdansk")
                .withEmail("student1@ug.pl")
                .buildUser();

        Assert.assertEquals("Student1", userBuildWithEmail.userName);
        Assert.assertEquals("Dluga 11, 80-827, Gdansk", userBuildWithEmail.address);
        Assert.assertEquals(25, userBuildWithEmail.age);
        Assert.assertEquals("student1@ug.pl", userBuildWithEmail.email);
        Assert.assertEquals(0, userBuildWithEmail.phoneNumber);

    }

    @Test
    public void build_user_with_email_and_phone_number() {

        User userBuildWithEmailAndPhoneNumber = userBuilder
                .withUserName("Student2")
                .withAge(26)
                .withAddress("Dluga 12, 80-827, Gdansk")
                .withEmail("student2@ug.pl")
                .withPhoneNumber(123456789)
                .buildUser();

        Assert.assertEquals("Student2", userBuildWithEmailAndPhoneNumber.userName);
        Assert.assertEquals("Dluga 12, 80-827, Gdansk", userBuildWithEmailAndPhoneNumber.address);
        Assert.assertEquals(26, userBuildWithEmailAndPhoneNumber.age);
        Assert.assertEquals("student2@ug.pl", userBuildWithEmailAndPhoneNumber.email);
        Assert.assertEquals(123456789, userBuildWithEmailAndPhoneNumber.phoneNumber);

    }


    @Test
    public void build_user_with_phone_number() {
        UserBuilder userBuilder = new UserBuilder();

        User userBuildWithPhoneNumber = userBuilder
                .withUserName("Student3")
                .withAge(24)
                .withAddress("Dluga 13, 80-827, Gdansk")
                .withPhoneNumber(987654321)
                .buildUser();

        Assert.assertEquals("Student3", userBuildWithPhoneNumber.userName);
        Assert.assertEquals("Dluga 13, 80-827, Gdansk", userBuildWithPhoneNumber.address);
        Assert.assertEquals(24, userBuildWithPhoneNumber.age);
        Assert.assertEquals(null, userBuildWithPhoneNumber.email);
        Assert.assertEquals(987654321, userBuildWithPhoneNumber.phoneNumber);

    }


    @Test
    public void create_user_with_email() {
        User userCreatedWithMail = userFactory.createUser(UserType.EMAIL);

        System.out.println(userCreatedWithMail.toString());

        Assert.assertEquals("Student1", userCreatedWithMail.userName);
        Assert.assertEquals("Dluga 11, 80-827, Gdansk", userCreatedWithMail.address);
        Assert.assertEquals(25, userCreatedWithMail.age);
        Assert.assertEquals("student1@ug.pl", userCreatedWithMail.email);
        Assert.assertEquals(0, userCreatedWithMail.phoneNumber);

    }


    @Test
    public void create_user_with_email_and_phone_number() {
        User userWithMailAndPhoneNumber = userFactory.createUser(UserType.EMAIL_AND_PHONE_NUMBER);

        System.out.println(userWithMailAndPhoneNumber.toString());

        Assert.assertEquals("Student3", userWithMailAndPhoneNumber.userName);
        Assert.assertEquals("Dluga 12, 80-827, Gdansk", userWithMailAndPhoneNumber.address);
        Assert.assertEquals(26, userWithMailAndPhoneNumber.age);
        Assert.assertEquals("student3@ug.pl", userWithMailAndPhoneNumber.email);
        Assert.assertEquals(123456789, userWithMailAndPhoneNumber.phoneNumber);

    }

    @Test
    public void create_user_with_phone_number() {
        User userCreatedWithPhoneNumber = userFactory.createUser(UserType.PHONE_NUMBER);

        System.out.println(userCreatedWithPhoneNumber.toString());

        Assert.assertEquals("Student2", userCreatedWithPhoneNumber.userName);
        Assert.assertEquals("Dluga 13, 80-827, Gdansk", userCreatedWithPhoneNumber.address);
        Assert.assertEquals(24, userCreatedWithPhoneNumber.age);
        Assert.assertEquals(null, userCreatedWithPhoneNumber.email);
        Assert.assertEquals(987654321, userCreatedWithPhoneNumber.phoneNumber);

    }

}

