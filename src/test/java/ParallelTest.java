import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class ParallelTest {

    @Parameters("browser")
    @Test
    public void test(String browser){

        WebDriver driver;

        if(browser.equals("chrome"))
            driver = new ChromeDriver();
        else
            driver = new FirefoxDriver();

        driver.get("https://facebook.com");

//        System.out.println(browser);

        driver.quit();
    }
}