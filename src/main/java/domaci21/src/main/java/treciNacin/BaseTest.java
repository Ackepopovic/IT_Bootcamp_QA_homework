package treciNacin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signUpPage;

    public WebDriver getDriver() {
        return driver;
    }

    public WebDriverWait getWait() {
        return wait;
    }

    public SignUpPage getSignUpPage() {
        return signUpPage;
    }
    @BeforeClass
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovan\\Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver,wait);
    }
    @AfterClass
    public void CleanUp(){
        driver.close();
    }
    public void assertVisibilityOfElement(WebElement element){
        getWait().until(ExpectedConditions.visibilityOf(element)).isDisplayed();
    }
}
