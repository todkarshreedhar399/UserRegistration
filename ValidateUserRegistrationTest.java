import org.junit.Assert;
import org.junit.Test;

public class ValidateUserRegistrationTest {

//    Testing for first name
    @Test
    public void givenFirstname_when1stLetterCap_ReturnsTrue(){
        boolean result = UserRegistration.validateFirstName("Lakhan");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenFirstname_when1stLetterSmall_ReturnsFalse(){
        boolean result = UserRegistration.validateFirstName("lakhan");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsNumber_ReturnsFalse(){
        boolean result = UserRegistration.validateFirstName("Lakhan10");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenFirstname_whenItContainsSpecialCharacter_ReturnsFalse(){
        boolean result = UserRegistration.validateFirstName("L@khan");
        Assert.assertEquals(false,result);
    }

//  Testing for last name
    @Test
    public void givenLastname_when1stLetterCap_ReturnsTrue(){
        boolean result = UserRegistration.validateLastName("Kumar");
        Assert.assertEquals(true, result);
    }
    @Test
    public void givenLastname_when1stLetterSmall_ReturnsFalse(){
        boolean result = UserRegistration.validateLastName("kumar");
        Assert.assertEquals(false, result);
    }
    @Test
    public void givenLastname_whenItContainsNumber_ReturnsFalse(){
        boolean result = UserRegistration.validateLastName("Kumar10");
        Assert.assertEquals(false, result);
    }
//    Testing for emails
    @Test
    public void givenEmail_WithMandatoryParts_ReturnsTrue(){
        boolean result = UserRegistration.validateUserEmail("lakhan@gmail.com");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOptionalParts_ReturnsTrue(){
        boolean result = UserRegistration.validateUserEmail("lakhan.bl@gmail.com.in");
        Assert.assertEquals(true,result);
    }
    @Test
    public void givenEmail_WithOutMandatoryParts_ReturnsFalse(){
        boolean result = UserRegistration.validateUserEmail("lakhan@.com");
        Assert.assertEquals(false,result);
    }

    //Testing for phone number
    @Test
    public void givenPhoneNumber_WithCountryCodeAndSpace_ReturnsTrue(){
    boolean result = UserRegistration.validatePhoneNumber("91 1234567891");
    Assert.assertEquals(true,result);
    }
    @Test
    public void givenPhoneNumber_WithoutCountryCodeAndSpace_ReturnsFalse(){
        boolean result = UserRegistration.validatePhoneNumber("1234567891");
        Assert.assertEquals(false,result);
    }
    @Test
    public void givenPhoneNumber_WithAlphabet_ReturnsFalse(){
        boolean result = UserRegistration.validatePhoneNumber("91 12A4567891");
        Assert.assertEquals(false,result);
    }
//    Testing for password
    @Test
    public void giverPassword_WithMinimumLengthOf8_returnsTrue(){
        boolean result = UserRegistration.validatePassword("L@65kha14");
        Assert.assertEquals(true,result);
    }
    @Test
    public void giverPassword_WithoutMinimumLengthOf8_returnsFalse(){
        boolean result = UserRegistration.validatePassword("l@65kh");
        Assert.assertEquals(false,result);
    }
    @Test
    public void giverPassword_WithSpecialCharacter_returnsFalse(){
        boolean result = UserRegistration.validatePassword("l@65kha14");
        Assert.assertEquals(false,result);
    }
}
