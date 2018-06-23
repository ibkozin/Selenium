package ibkozin.java_dt.litecart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests {
    private WebDriver driver;
    private WebDriver wait;

    @BeforeMethod
    public void start(){
        driver = new ChromeDriver();
    }

    @Test
    public void testLogin(){
        driver.navigate().to("http://localhost/litecart/admin/");
        type(By.name("username"), "admin");
        type(By.name("password"),"admin");
        driver.findElement(By.name("login")).click();

    }

    private void type(By locator, String text) {
        driver.findElement(locator).click();
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    @AfterMethod
    public void stop(){
        driver.quit();
        driver = null;

    }
}
