package treciNacin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.security.mscapi.CPublicKey;

public class SignUpTest extends BaseTest {

    @BeforeMethod
    public void beforeEachTest(){
        getSignUpPage().open();
    }
    @Test
    public void verifySignUpUrl(){
        Assert.assertTrue(getDriver().getCurrentUrl().contains("signup"));
    }
    @Test
    public void testEmailType() {
        Assert.assertEquals(getSignUpPage().getEmailField().getAttribute("type"),("email"));
    }
    @Test
    public void testPasswordType() {
        getSignUpPage().open();
        Assert.assertEquals(getSignUpPage().getPasswordField().getAttribute("type"), ("password"));
    }
    @DataProvider(name = "invalidEmails")
    public static Object[] [] invalidEmails() {
        return new Object[][]{
                {"aleksandar@gmail"}, {"aleksandar.com"}
        };
    }
    @Test(dataProvider = "invalidEmails")
    public void testInvalidEmail(String email) {
        getSignUpPage().enterEmailField(email);
        assertVisibilityOfElement(getSignUpPage().getErrorMsg());
        Assert.assertEquals(getSignUpPage().getErrorMsg().getText(),"Valid email is required");
    }
    @DataProvider(name = "invalidPasswords")
    public static Object[] [] invalidPasswords() {
        return new Object[][]{
                {"1"}, {"12"}
        };
    }
    @Test(dataProvider = "invalidPasswords")
    public void testInvalidPasswords(String password) {
        getSignUpPage().enterPasswordField(password);
        assertVisibilityOfElement(getSignUpPage().getErrorMsg());
        Assert.assertEquals(getSignUpPage().getErrorMsg().getText(), "This field must have no less than 5 characters");
    }
    @Test
    public void testEmptyField(){
        getSignUpPage().signUpButton.click();
        assertVisibilityOfElement(getSignUpPage().getErrorMsg());
        Assert.assertEquals(getSignUpPage().getErrorMsg().getText(), "This field is required");
    }
}
