import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EBaySearch {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Search for anything\"]")).sendKeys("notebook");
        driver.findElement(By.xpath("//input[@value=\"Search\"]")).click();

    }
}
