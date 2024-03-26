import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Tab1 {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");

        System.out.println(driver.getTitle());

        WebElement openTab = driver.findElement(By.id("tabButton"));

        openTab.click();

        System.out.println(driver.getCurrentUrl());

        //ask current tab
        String currentTab = driver.getWindowHandle();

        //ask all tabs/windows
        Set<String> allTabs = driver.getWindowHandles();

        System.out.println("Before forloop");
        System.out.println(driver.getCurrentUrl());

        for (String a: allTabs) {
            if(a!=currentTab){
                driver.switchTo().window(a);
            }
        }

        System.out.println("after forloop");

        System.out.println(driver.getCurrentUrl());


        driver.quit();

    }
}
