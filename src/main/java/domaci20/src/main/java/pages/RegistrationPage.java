package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage{

    private By nameField = By.id("name");
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By comfirmPasswordField = By.id("confirmPassword");
    private By signMeButton = By.cssSelector("#app > div.v-application--wrap > main > div > div.container.container--fluid > div > div > div.flex.xs12.sm6.offset-sm3 > span > form > div > div.flex.text-xs-center.mt-5 > button > span");


    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void openPage(){
        getDriver().get("https://vue-demo.daniel-avellaneda.com/signup");
    }
    public void enterName(String text){
        getDriver().findElement(nameField).sendKeys(text);
    }
    public void enterEmail(String text){
        getDriver().findElement(emailField).sendKeys(text);
    }
    public void enterPassword(String text){
        getDriver().findElement(passwordField).sendKeys(text);
    }
    public void enterComfirmPassword(){
        getDriver().findElement(comfirmPasswordField).equals(passwordField);
    }
    public void setSignMeButton(){
        getDriver().findElement(signMeButton).click();
    }
}

