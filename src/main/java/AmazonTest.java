import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonTest {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://amazon.com");
        List<WebElement> links = driver.findElements(By.xpath("//a[@class=\"nav_a\"]"));

        for(WebElement a : links) {
            System.out.println(a.getText());
        }
    }
}
