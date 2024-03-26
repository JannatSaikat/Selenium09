import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tab2 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://ebay.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());
    }
}
