package Week2.Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Random;

import static java.awt.SystemColor.text;

public class Activity2 {

    public static void main(String[] args) throws InterruptedException {


        ChromeDriver driver = new ChromeDriver();
        driver.navigate().to("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        // to Add implicity wait time for synccornization
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //explicit
        WebDriverWait waitTime=new WebDriverWait(driver, Duration.ofSeconds(15));

        methodClass selenium=new methodClass(waitTime);
        int num = (int)(Math.random() * 100);



        selenium.click(By.xpath("//a[contains(text(),'Sign in')]"));

        selenium.click(By.partialLinkText("register here"));


        selenium.sendKey(By.name("firstName"),"Shahzad");
        selenium.sendKey(By.name("lastName"),"Khan");
        selenium.sendKey(By.name("email"),"khan"+num+ "@gmail.com");
        selenium.sendKey(By.name("password"),"khan@123");
        selenium.sendKey(By.name("confirmPassword"),"khan@123");

        selenium.click(By.xpath("// button[@type='submit']/span"));
        

        selenium.click(By.xpath("//a[contains(text(),'Sign in')]"));

        selenium.sendKey(By.cssSelector("input#email"),"khan@gmail.com");
        selenium.sendKey(By.cssSelector("input#password"), "khan@123");


        selenium.click(By.xpath("//button[@type='submit']"));








    }


}
