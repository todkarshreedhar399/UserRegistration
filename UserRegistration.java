import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) throws InvalidException {

        IUserRegistration validatePassword = (String password) -> {
            String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@+.-]).{8,20}$";
            boolean result = Pattern.matches(passwordRegex, password);
            if (!result) {
                throw new InvalidException("password is invalid");
            }
            return String.valueOf(true);
        };

        IUserRegistration validatePhoneNumber = (String phoneNumber) -> {
            String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}";
            boolean result = Pattern.matches(phoneRegex, phoneNumber);
            if (!result) {
                throw new InvalidException("phone number is invalid");
            }
            return String.valueOf(true);
        };

        IUserRegistration validateUserEmail = (String email) -> {
            String emailRegex = "^[A-Za-z0-9]+([.+_-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,4}(.[a-z]{2,4})?$";
            boolean result = Pattern.matches(emailRegex, email);
            if (!result) {
                throw new InvalidException("email is invalid");
            }
            return String.valueOf(true);
        };

        IUserRegistration validateLastName = (String lastName) -> {
            String regex = "^[A-Z][a-z]{2,}";
            boolean result = Pattern.matches(regex, lastName);
            if (!result) {
                throw new InvalidException("last name is invalid");
            }
            return String.valueOf(true);
        };

        IUserRegistration validateFirstName = (String firstName)->{
            String regex = "^[A-Z][a-z]{2,}";
            boolean result = Pattern.matches(regex, firstName);
            if (!result) {
                throw new InvalidException("first name is invalid");
            }
            return String.valueOf(true);
        };

        System.out.println(validateFirstName.details("Lakhan"));
        System.out.println(validateLastName.details("Kumar"));
        System.out.println(validatePassword.details("L@khan123"));
        System.out.println(validatePhoneNumber.details("91 1234567890"));
        System.out.println(validateUserEmail.details("lakhan@gmail.com"));
    }
}


