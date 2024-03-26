import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
        WebElement alertButton = driver.findElement(By.cssSelector("[name=\"alert\"]"));
        alertButton.click();
        driver.switchTo().alert().accept();
    }
}
