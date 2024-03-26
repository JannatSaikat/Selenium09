import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Wait2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com");

        WebElement electronics = driver.findElement(By.cssSelector("[data-currenttabindex=\"1\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(electronics).perform();

        WebElement videoGames = driver.findElement(By.cssSelector("[_sp=\"p4375194.m1380.l3260\"]"));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        wait.until(ExpectedConditions.visibilityOf(videoGames));
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[_sp=\"p4375194.m1380.l3260\"]")));
        wait.until(ExpectedConditions.elementToBeClickable(videoGames));


        videoGames.click();
    }
}
