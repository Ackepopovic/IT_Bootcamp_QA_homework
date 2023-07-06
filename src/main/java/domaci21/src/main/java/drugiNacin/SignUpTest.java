package drugiNacin;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    @Test
    public void verifySignUpUrl() {
        getSignUpPage().open();
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }

    @Test
    public void testEmailType() {
        getSignUpPage().open();
        Assert.assertTrue(getSignUpPage().getEmailField().getAttribute("type").equals("email"));
    }

    @Test
    public void testPasswordType() {
        getSignUpPage().open();
        Assert.assertTrue(getSignUpPage().getPasswordField().getAttribute("type").equals("password"));
    }

    @Test
    public void testShortPassword() {
        getSignUpPage().open()
                .enterName("Aleksandar")
                .enterEmail("emailadresa@gmail.com")
                .enterPassword("123")
                .enterConfirmPassword("123");
        Assert.assertTrue(getSignUpPage().getTooShortPasswordErrorMsg().isDisplayed());
    }
    @Test
    public void testInvalidEmail() {
        getSignUpPage().open()
                .enterName("Aleksandar")
                .enterEmail("aleksandar@gmailco")
                .enterPassword("123123")
                .enterConfirmPassword("123123");
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }
    @Test
    public void testEmptyField() {
        getSignUpPage().open()
                .enterEmail("emailadresa@gmail.com")
                .enterPassword("123123")
                .enterConfirmPassword("123123");
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }
}