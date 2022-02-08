package web.data;

import com.github.javafaker.Faker;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class DataGenerator {

         private DataGenerator() {
    }

    static Faker faker = new Faker(new Locale("ru","RU"));


    public static String generateCity(String locale) {
        String city = faker.address().cityName();
        return city;
    }

    public static String generateFirstName(String locale) {
        final String firstName = faker.name().firstName();
        return firstName;
    }

    public static String generateLastName(String locale) {
        final String lastName = faker.name().lastName();;
        return lastName;
    }

    public static String generatePhone(String locale) {
        return faker.phoneNumber().cellPhone();
    }
    public static String generateDate(int days) {
        return LocalDate.now().plusDays(days).format(DateTimeFormatter.ofPattern("dd.MM.yyyy"));
    }

}
