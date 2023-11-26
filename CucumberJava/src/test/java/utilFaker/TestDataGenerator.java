package utilFaker;

import com.github.javafaker.Faker;

public class TestDataGenerator {
    private static final Faker faker = new Faker();

    public static String generateFirstName() {
        return faker.name().firstName();
    }

    public static String generatePassword() {
        return faker.name().lastName();
    }

    public static String generateEmail() {
        return faker.internet().emailAddress();
    }

    // Add more methods based on your data generation needs
}