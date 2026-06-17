import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.*;

import java.awt.*;

public class FileUploadTest {
    @Test
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/upload");

        driver.findElement(By.id("file-upload"))
                .sendKeys("C:\\Users\\nikhi\\OneDrive\\Desktop\\file.txt");

        driver.findElement(By.id("file-submit"))
                .click();
        System.out.println("File uploaded successfully");

        driver.quit();
    }
}