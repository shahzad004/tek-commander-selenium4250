package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RecapActivity {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        // get click on sign in
        driver.findElement(By.id("signinLink")).click();
        // to get enter data in input fields
        driver.findElement(By.name("email")).sendKeys("wrong12@gmail.com");
        driver.findElement(By.id("password")).sendKeys("324234");

        driver.findElement(By.id("loginBtn")).click();
        Thread.sleep(2500);
        WebElement errorElement =driver.findElement(By.className("error"));

        System.out.println(errorElement);

        Thread.sleep(2000);
        driver.quit();
    }
}
