import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegistrationTest {

    @Test
    public void validRegistration() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName"))
                .sendKeys("Nikhil");

        driver.findElement(By.id("lastName"))
                .sendKeys("Singhal");

        driver.findElement(By.id("userEmail"))
                .sendKeys("nikhil@gmail.com");

        driver.findElement(By.xpath("//label[text()='Male']"))
                .click();

        driver.findElement(By.id("userNumber"))
                .sendKeys("9876543210");

        Assert.assertTrue(
                driver.findElement(By.id("firstName"))
                        .isDisplayed()
        );

        driver.quit();
    }

    @Test
    public void invalidMobileNumber() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/automation-practice-form");

        driver.findElement(By.id("firstName"))
                .sendKeys("Nikhil");

        driver.findElement(By.id("lastName"))
                .sendKeys("Singhal");

        driver.findElement(By.id("userNumber"))
                .sendKeys("123");

        String value =
                driver.findElement(By.id("userNumber"))
                        .getAttribute("value");

        Assert.assertEquals(value.length(), 10);

        driver.quit();
    }
}