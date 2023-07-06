import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class RegistrationTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeClass
    public void setUp() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Jovan\\Desktop//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://vue-demo.daniel-avellaneda.com/signup");
        driver.manage().window().maximize();
    }

    @Test
    public void verifySignUpUrl() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("signup"));
    }

    @Test
    public void testEmailType() {
        WebElement enterEmail = driver.findElement(By.id("email"));
        Assert.assertTrue(enterEmail.getAttribute("type").equals("email"));
    }

    @Test
    public void testPasswordType() {
        WebElement enterPassword = driver.findElement(By.id("password"));
        Assert.assertTrue(enterPassword.getAttribute("type").equals("password"));
    }

    @Test
    public void testInvalidEmail() {
        WebElement enterEmail = driver.findElement(By.id("email"));
        enterEmail.sendKeys("wrongemail");
        WebElement errorElement = driver.findElement(By.xpath("//div[contains(text(),'Valid email is required')]"));
        String errorMsg = "Valid email is required";
        Assert.assertEquals(errorElement.getText(), errorMsg);
    }

    @Test
    public void testShortPassword() {
        WebElement enterPassword = driver.findElement(By.id("password"));
        enterPassword.sendKeys("123");
        WebElement errorElement = driver.findElement(By.xpath("//div[contains(text(),'This field must have no less than 5 characters')]"));
        String errorMsg = "This field must have no less than 5 characters";
        Assert.assertEquals(errorElement.getText(), errorMsg);
    }


    @Test
    public void testEmptyField() {
        WebElement signMeButton = driver.findElement(By.xpath("/html/body/div/div/main/div/div[2]/div/div/div[2]/span/form/div/div[5]/button/span"));
        signMeButton.click();
        WebElement errorElement = driver.findElement(By.xpath("//div[contains(text(),'This field is required')]"));
        String errorMsg = "This field is required";
        Assert.assertEquals(errorElement.getText(), errorMsg);
    }


    @AfterClass
    public void cleanUp(){
        driver.close();
    }
}



