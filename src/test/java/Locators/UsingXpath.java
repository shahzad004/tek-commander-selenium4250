package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingXpath {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[3]/div/div[2]/div/div[1]/div/div/div[2]/p")).click();

       WebElement ptext = driver.findElement(By.xpath("/html/body/div/div/div/div[3]/div/div[1]/p"));
        Thread.sleep(2000);
       System.out.println(ptext.getText());

       driver.quit();


    }
}
