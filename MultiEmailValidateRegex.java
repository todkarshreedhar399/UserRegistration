import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultiEmailValidateRegex{


    public static void main(String[] args) {
        String[] email = {"abc@yahoo.com", "abc-100@yahoo.com", "abc.100@yahoo.com", "abc111@abc.com", "abc-100@abc.net",
                "abc.100@abc.com.au", "abc@1.com", "abc@gmail.com.com", "abc+100@gmail.com"};
        String[] email2 = {"abc", "abc@.com.my","abc123@gmail.a","abc123@.com","abc123@.com.com" , ".abc@abc.com",
                "abc()*@gmail.com" , "abc@%*.com" , "abc..2002@gmail.com" , "abc.@gmail.com" , "abc@abc@gmail.com" ,
                "abc@gmail.com.1a" , "abc@gmail.com.aa.au"};
        MultipleEmailValidation multipleEmailValidation = new MultipleEmailValidation();
        System.out.println("Valid emails");
        multipleEmailValidation.validEmail(email);
        System.out.println(" ");
        System.out.println("Invalid emails");
        multipleEmailValidation.validEmail(email2);
    }

   public void validEmail(String[] email) {
        for(String element: email){
            String emailRegex = "^[A-Za-z0-9]+([.+_-][a-z0-9]+)?@[a-z0-9]+.[a-z]{2,4}(.[a-z]{2,4})?$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(element);
            System.out.println("is valid: " +matcher.matches());
        }
    }
}
