package treciNacin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage extends BasePage {

    @FindBy(id = "name")
    WebElement nameField;

    @FindBy (id = "email")
    WebElement emailField;

    @FindBy (id = "password")
    WebElement passwordField;

    @FindBy (id = "confirmPassword")
    WebElement comfirmPasswordField;

    @FindBy (xpath = "//button[@type ='submit']")
    WebElement signUpButton;

    @FindBy (className = "v-messages__message")
    WebElement errorMsg;


    public SignUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getNameField() {
        return nameField;
    }

    public WebElement getEmailField() {
        return emailField;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getComfirmPasswordField() {
        return comfirmPasswordField;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getErrorMsg() {
        return errorMsg;
    }
    public void open(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
    public void enterNameField(String name){
        nameField.sendKeys(name);
    }
    public void enterEmailField(String email){
        emailField.sendKeys(email);
    }
    public void enterPasswordField(String password){
        passwordField.sendKeys(password);
    }
    public void enterConfirmPasswordField(String confirmPassword){
        comfirmPasswordField.sendKeys(confirmPassword);
    }

}
