import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon2 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        WebElement amazonBacics = driver.findElement(By.cssSelector("[data-csa-c-content-id=\"nav_cs_customerservice\"]"));
        System.out.println(amazonBacics.isDisplayed());
    }
}
