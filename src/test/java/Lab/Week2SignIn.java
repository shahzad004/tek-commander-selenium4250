package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2SignIn {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khan1@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Khan@123");
         Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(1000);

       boolean loginIn= driver.findElement(By.xpath("//button[@id='logoutBtn']")).isDisplayed();

        System.out.println(loginIn);

        driver.quit();




    }
}
