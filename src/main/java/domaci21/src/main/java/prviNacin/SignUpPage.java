package prviNacin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage{
    private WebElement nameField;
    private WebElement emailField;
    private WebElement passwordField;
    private WebElement confirmPasswordField;
    private WebElement signMeUpButton;
    private WebElement tooShortPasswordErrorMsg;

    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {
        nameField = getDriver().findElement(By.id("name"));
        return nameField;
    }

    public WebElement getEmailField() {
        emailField = getDriver().findElement(By.id("email"));
        return emailField;
    }

    public WebElement getPasswordField() {
        passwordField = getDriver().findElement(By.id("password"));
        return passwordField;
    }

    public WebElement getConfirmPasswordField() {
        confirmPasswordField = getDriver().findElement(By.id("confirmPassword"));
        return confirmPasswordField;
    }

    public WebElement getSignMeUpButton() {
        signMeUpButton = getDriver().findElement(By.xpath("//button[@type ='submit']"));
        return signMeUpButton;
    }

    public WebElement getTooShortPasswordErrorMsg() {
        tooShortPasswordErrorMsg = getDriver().findElement(By.xpath("//div[contains(text(),'This field must have no less than 5 characters')]"));
        return tooShortPasswordErrorMsg;
    }
    public SignUpPage enterName(String name) {
        getNameField().sendKeys(name);
        return this;
    }
    public SignUpPage enterEmail(String email) {
        getEmailField().sendKeys(email);
        return this;
    }
    public SignUpPage enterPassword(String password) {
        getPasswordField().sendKeys(password);
        return this;
    }
    public SignUpPage enterConfirmPassword(String confirmPassword) {
        getConfirmPasswordField().sendKeys(confirmPassword);
        return this;
    }
    public SignUpPage clickSignMeUpButton(){
        getSignMeUpButton().click();
        return this;
    }
    public SignUpPage waitTooShortPasswordErrorMsg(){
        getWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'This field must have no less than 5 characters')]")));
        return this;
    }
    public SignUpPage open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
        return this;
    }
}
