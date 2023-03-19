package organ;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class Casse2 {
    static WebDriver driver;
    @BeforeClass
    public static void precondition() {
        System.setProperty("webdriver.chrome.driver", "/Users/TumblrGirl/Documents/selenium-java-4.8.1 (1)");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://saucedemo.com/");
    }
   @Test
    public void LogIn()
    {
        WebElement Login = driver.findElement(By.id("user-name_id"));
        Login.sendKeys("test");
        WebElement Pass=driver.findElement(By.xpath("//input[@name=password]"));
        Pass.sendKeys("test");
        WebElement button=driver.findElement(By.id("login-button_id"));
        button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void end()
    {
        driver.quit();
    }



}
