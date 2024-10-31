package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Activity {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("/html/body/div/div/div[1]/div[1]/div[1]/div[2]/div/input")).sendKeys("TV");

        driver.findElement(By.xpath("//button[@class='search__btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[1]/img")).click();
        Thread.sleep(1000);
   WebElement textElement= driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[3]/div/div[1]/div[2]/h1"));

  String headingtext= textElement.getText();

        System.out.println(headingtext);

        driver.quit();
    }
}
