package drugiNacin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By confirmPasswordField = By.id("confirmPassword");
    private By signMeUpButton = By.xpath("//button[@type ='submit']");
    private By tooShortPasswordErrorMsg = By.xpath("//div[contains(text(),'This field must have no less than 5 characters')]");


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void enterName(String name) {
        getDriver().findElement(nameField).sendKeys(name);
    }
    public void enterEmail(String email){
        getDriver().findElement(emailField).sendKeys(email);
    }
    public void enterPassword(String password) {
        getDriver().findElement(passwordField).sendKeys(password);
    }
    public void enterConfirmPassword(String confirmPassword){
        getDriver().findElement(confirmPasswordField).sendKeys(confirmPassword);
    }
    public void clickSignMeUpPassword(){
        getDriver().findElement(signMeUpButton).click();
    }
    public void waitTooShortPasswordErrorMsg(){
        getDriver().findElement(tooShortPasswordErrorMsg).isDisplayed();
    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");

    }

}
