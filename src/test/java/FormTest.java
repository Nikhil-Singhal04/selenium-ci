import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FormTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.selenium.dev/selenium/web/web-form.html");

        driver.findElement(By.name("my-text")).sendKeys("Nikhil");

        WebElement submit = driver.findElement(By.id("submit"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", submit);

        Thread.sleep(1000);

        js.executeScript("arguments[0].click();", submit);

        System.out.println("Form Submitted Successfully");

        driver.quit();
    }
}