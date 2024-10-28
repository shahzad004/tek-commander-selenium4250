package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Activity3 {
    public static void main(String[] args) {

        WebDriver driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div/div/div/button")).click();

        driver.findElement(By.id("email")).sendKeys("wrongmail.com");
        driver.findElement(By.id("password")).sendKeys("12323");
         driver.quit();



    }
}
