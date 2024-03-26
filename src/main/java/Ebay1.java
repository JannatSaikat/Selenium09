import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        WebElement fashion = driver.findElement(By.xpath("//li[@data-currenttabindex=\"2\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(fashion).perform();
        Thread.sleep(2000);


        Thread.sleep(2000);
        WebElement footwear = driver.findElement(By.cssSelector("[_sp=\"p4375194.m1381.l3251\"]"));

        footwear.click();

    }
}
