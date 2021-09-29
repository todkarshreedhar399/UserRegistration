import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name");
        String firstName = scan.nextLine();
        System.out.println("Enter last name");
        String lastName = scan.nextLine();
        System.out.println("Enter user email");
        String email = scan.next();
        scan.nextLine();
        System.out.println("Enter your phone number");
        String phoneNumber = scan.nextLine();
        System.out.println("Enter your password");
        String password = scan.next();

        validatePassword(password);
        validatePhoneNumber(phoneNumber);
        validateFirstName(firstName);
        validateLastName(lastName);
        validateUserEmail(email);
    }

    public static boolean validatePassword(String password) {
        String passwordRegex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@+.-]).{8,20}$";
        Pattern pattern = Pattern.compile(passwordRegex);
        Matcher matcher = pattern.matcher(password);
        System.out.println("is valid password: " +matcher.matches());
        return matcher.matches();
    }

    public static boolean validatePhoneNumber(String phoneNumber) {
        String phoneRegex = "^[0-9]{2}\\s{1}[0-9]{10}";
        Pattern pattern = Pattern.compile(phoneRegex);
        Matcher matcher = pattern.matcher(phoneNumber);
        System.out.println("is valid phone number: " +matcher.matches());
        return matcher.matches();
    }

    public static boolean validateUserEmail(String email) {
        String emailRegex = "^[A-Za-z0-9]+([.+_-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,4}(.[a-z]{2,4})?$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }

    public static boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }

    public static boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{2,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        System.out.println("is valid: " +matcher.matches());
        return matcher.matches();
    }
}
