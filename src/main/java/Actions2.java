import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Actions2 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement compInfo = driver.findElement(By.cssSelector("[_exsp='m571.l2933']"));
        WebElement policies = driver.findElement(By.cssSelector("[_sp='m571.l2910']"));
        WebElement fashion = driver.findElement(By.xpath("//li[@data-currenttabindex='2']/a"));
        WebElement womensShoes = driver.findElement(By.xpath("//a[@_sp=\"p4375194.m1381.l3251\"]"));

        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).build().perform();

//        Thread.sleep(20000);

//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20000));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(20000));
        wait.until(ExpectedConditions.visibilityOf(womensShoes));



        womensShoes.click();
    }
}
