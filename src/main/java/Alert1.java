import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        WebElement alertButton =  driver.findElement(By.xpath("//button[@id=\"alertButton\"]"));
        alertButton.click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();

    }
}
