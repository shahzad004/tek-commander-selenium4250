package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Week2Activity3 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(1000);

        driver.findElement(By.xpath("//button[@id='signupBtn']")).click();

        List<WebElement> errorText=driver.findElements(By.className("Error"));
        Thread.sleep(1000);
        for(WebElement etext: errorText){
            Thread.sleep(1000);
            System.out.println(etext);
        }





        driver.quit();

    }
}
