package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2day3Activity {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        driver.findElement(By.cssSelector("a#signinLink")).click();
        driver.findElement(By.cssSelector("input#email")).sendKeys("khan@gmail.com");
        driver.findElement(By.cssSelector("input#password")).sendKeys("213123");
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("button[id='loginBtn']")).click();
        Thread.sleep(1000);



        driver.quit();
    }
}
