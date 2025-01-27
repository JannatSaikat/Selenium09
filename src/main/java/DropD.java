import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropD {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        WebElement category = driver.findElement(By.cssSelector("#gh-cat"));
        Select select = new Select(category);

        select.selectByVisibleText("Books");
    }
}
