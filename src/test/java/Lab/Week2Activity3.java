package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Activity3 {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.findElement(By.id("//a[@id='signinLink']")).click();

        driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
        Thread.sleep(1000);

        driver.findElement(By.id("//button[@id='signupBtn'']")).click();

   String nametext=     driver.findElement(By.id("//div[@id='nameError']")).getText();
   Thread.sleep(1000);
        String emailtext=     driver.findElement(By.id( " //div[@id='emailError']")).getText();
        String passwordtext=     driver.findElement(By.id( " //div[@id='passwordError']")).getText();
        String confirmpasstext=     driver.findElement(By.id( " //div[@id='confirmPasswordError']")).getText();

        System.out.println(nametext+" "+ emailtext +" "+ passwordtext +" "+ confirmpasstext);

        driver.quit();

    }
}
