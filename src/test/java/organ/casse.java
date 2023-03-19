package organ;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



public class casse {
    static WebDriver driver;
    @BeforeClass
    public static void precondition() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/TumblrGirl/Documents/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://saucedemo.com/");
        WebElement Login = driver.findElement(By.id("user-name_id"));
        Login.sendKeys("standard_user");
        WebElement Pass=driver.findElement(By.xpath("//input[@name=password]"));
        Pass.sendKeys("secret_sauce");
        WebElement button=driver.findElement(By.id("login-button_id"));
        button.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void kase() {

        WebElement button=driver.findElement(By.id("add-to-cart-sauce-labs-backpack_id"));
        button.click();
        WebElement shopping_cart_container=driver.findElement(By.cssSelector("div.id=shopping_cart_container class=shopping_cart_container><a class= shopping_cart_link></a>"));
        shopping_cart_container.click();
        WebElement checkout=driver.findElement(By.xpath("//name='checkout'"));
        checkout.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement FirstName=driver.findElement(By.id("firstName_id"));
        FirstName.sendKeys("standard_user");
        WebElement LastName=driver.findElement(By.id("lastName_id"));
        LastName.sendKeys("standard_user");
        WebElement ZipCode=driver.findElement(By.id("postal-code_id"));
        FirstName.sendKeys("123");
        WebElement continu=driver.findElement(By.xpath("//name='continue'"));
        continu.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement fin =driver.findElement(By.xpath("//name='finish'"));
        fin.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @AfterClass
    public static void end()
    {
        driver.quit();
    }



}





