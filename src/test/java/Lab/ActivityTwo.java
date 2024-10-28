package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ActivityTwo {
    public static void main(String[] args) {


        WebDriver driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        WebElement searchtext = driver.findElement(By.id("searchinput"));
         searchtext.sendKeys("Apple");

         driver.findElement(By.className("ant-input-search-button")).click();

         List<WebElement> count= driver.findElements(By.className("ant-card-body"));

        driver.quit();







    }
}
