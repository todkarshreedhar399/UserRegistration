import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static boolean validatePassword(String password) throws InvalidException {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@+.-]).{8,20}$";
        boolean result = Pattern.matches(passwordRegex, password);
        if (!result) {
            throw new InvalidException("password is invalid");
        }
        return true;
    }

    public static boolean validatePhoneNumber(String phoneNumber) throws InvalidException {
        String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}";
        boolean result = Pattern.matches(phoneRegex, phoneNumber);
        if (!result) {
            throw new InvalidException("phone number is invalid");
        }
        return true;
    }

    public static boolean validateUserEmail(String email) throws InvalidException {
        String emailRegex = "^[A-Za-z0-9]+([.+_-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,4}(.[a-z]{2,4})?$";
        boolean result = Pattern.matches(emailRegex, email);
        if (!result) {
            throw new InvalidException("email is invalid");
        }
        return true;
    }

    public static boolean validateLastName(String lastName) throws InvalidException {
        String regex = "^[A-Z][a-z]{2,}";
        boolean result = Pattern.matches(regex, lastName);
        if (!result) {
            throw new InvalidException("last name is invalid");
        }
        return true;
    }

    public static boolean validateFirstName(String firstName) throws InvalidException {
        String regex = "^[A-Z][a-z]{2,}";
        boolean result = Pattern.matches(regex, firstName);
        if (!result) {
            throw new InvalidException("first name is invalid");
        }
        return true;
    }
}
