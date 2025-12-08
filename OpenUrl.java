package Sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenUrl {
    @Test
    public void verifyTitle() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/");
        
        String actualTitle = driver.getTitle();
        String expectedTitle = "Selenium";  // Expected title
        
        Assert.assertTrue(actualTitle.contains(expectedTitle), "Title does not match!");
        
        driver.quit();
    }
}