import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automate {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://facebook.com");
        driver.findElement(By.xpath("//input[@name=\"email\"]")).sendKeys("email@gmail.com");
        driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("password");
        driver.findElement(By.xpath("//button[@name=\"login\"]")).click();
    }
}
