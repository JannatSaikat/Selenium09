import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Wait1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        WebElement searchBox = driver.findElement(By.cssSelector("[aria-label=\"Search\"]"));

        searchBox.sendKeys("lapt");

//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        //Explicit
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sBQTL div:nth-of-type(1) span")));

        WebElement searchOption = driver.findElement(By.cssSelector("#sBQTL div:nth-of-type(1) span"));

        searchOption.click();
    }
}
