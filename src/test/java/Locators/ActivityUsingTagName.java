package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityUsingTagName {
    public static void main(String[] args) {

        ChromeDriver driver=new ChromeDriver();

        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        // to search all the links in this page
        By tagLocator=By.tagName("a");
        List<WebElement> alltagElement=driver.findElements(tagLocator);

        for(WebElement element: alltagElement){
            System.out.println(element.getText());
        }

        driver.quit();

    }
}
