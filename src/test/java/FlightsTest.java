import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.TestExecutionListener;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.time.Duration;

public class FlightsTest implements TestExecutionListener {
    
    @Test
    @Attachment(value = "Page Screenshot", type = "image/png")
    public void testDateArrive22Aout() throws InterruptedException {
        // declaration and instantiation of objects/variables
        System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/travel/flights");
        //driver.manage().window().setSize(new Dimension(860, 712));
        driver.findElement(By.cssSelector(".e5F5td:nth-child(4) .cQnuXe .II2One")).click();
        driver.findElement(By.cssSelector(".ND6Vic:nth-child(1) > .II2One")).sendKeys("new y");
        Thread.sleep(3000);
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
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/c-wiz[2]/div/div[2]/c-wiz/div[1]/c-wiz/div[2]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div[2]/div/input"));
        System.out.println(element.getAttribute("value"));
        Allure.addAttachment("My test has failed",
                new ByteArrayInputStream(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
        Assertions.assertEquals("Tue, Aug 22",element.getAttribute("value"));
    }
}
