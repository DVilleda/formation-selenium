import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumBrowser {
    public static void main(String[] args) throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        // Launch website
        //driver.navigate().to("http://www.google.com/");

        // Click on the search text box and send value
        //driver.findElement(By.id("APjFqb")).sendKeys("weather montreal");

        // Click Enter to search for results
        //driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

        driver.navigate().to("https://www.google.com/travel/flights");
        //driver.manage().window().setSize(new Dimension(860, 712));
        driver.findElement(By.cssSelector(".e5F5td:nth-child(4) .cQnuXe .II2One")).click();
        driver.findElement(By.cssSelector(".ND6Vic:nth-child(1) > .II2One")).sendKeys("new y");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@class=\'CwL3Ec\']")).click();
        driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div[1]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[1]/div/input")).click();
        {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class=\'oB61Xb E0vWmf k8qXw\']")));
        }
        driver.findElement(By.cssSelector(".Bc6Ryd:nth-child(1) .yg1Os:nth-child(3) > .WhDFk:nth-child(3) .eoY5cb")).click();
        driver.findElement(By.cssSelector(".Bc6Ryd:nth-child(1) .yg1Os:nth-child(4) > .WhDFk:nth-child(3)")).click();
        driver.findElement(By.xpath("//*[@id=\"ow81\"]/div[2]/div/div[3]/div[3]/div")).click();
        driver.findElement(By.cssSelector(".TUT4y")).click();
    }
}
