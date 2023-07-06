package tests;

import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest{

    @Test
    public void verifyUserCanRegister() throws InterruptedException {
        getRegistrationPage().openPage();
        getRegistrationPage().enterName("Marko");
        getRegistrationPage().enterEmail("asdasdasd@gmail.com");
        getRegistrationPage().enterPassword("123123123");
        getRegistrationPage().enterComfirmPassword();
        Thread.sleep(5000);
    }
}
