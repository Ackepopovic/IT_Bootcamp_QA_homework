package prviNacin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;
    private SignUpPage signUpPage;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovan\\Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
        signUpPage = new SignUpPage(driver, wait);
    }
    public WebDriver getDriver() {
        return driver;
    }
    public WebDriverWait getWait() {
        return wait;
    }
    public SignUpPage getSignUpPage() {
        return signUpPage;
    }
    @AfterClass
    public void cleanUp() {
        driver.close();
    }
}
