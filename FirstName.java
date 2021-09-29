import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstName {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("Enter first name");
	        String firstName = scan.nextLine();
	        validate(firstName);
	    }

	    private static void validate(String firstName) {
	        String regex = "^[A-Z][a-z]{2}";
	        Pattern pattern = Pattern.compile(regex);
	        Matcher matcher = pattern.matcher(firstName);
	        System.out.println("is valid: " +matcher.matches());
	    }
}
