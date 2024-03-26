import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Google1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");


        //go ot specific frame
        driver.switchTo().frame("callout");

        WebElement singinText = driver.findElement(By.cssSelector("div.hXhhq"));

        String message = singinText.getText();

        System.out.println(message);

        //come back to regular webpage
        driver.switchTo().defaultContent();
    }
}
