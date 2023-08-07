import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBrowser {
    public static void main(String[] args){
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // Launch website
        driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        driver.findElement(By.id("APjFqb")).sendKeys("weather montreal");

        // Click Enter to search for results
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
    }
}
