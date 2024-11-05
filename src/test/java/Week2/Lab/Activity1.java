package Week2.Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity1 {
    public static void main(String[] args) {
/*down{name: "Quinn Turner",email: "quinn.turner@example.com",password: "password123",    }, */



        ChromeDriver driver = new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // to add explicit wait time

        WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(20));

        waitTime.until(ExpectedConditions.elementToBeClickable((By.xpath("//a[contains(text(),'Sign in')]")))).click();

        waitTime.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("input#email")))).sendKeys("quinn.turner@example.com");

        waitTime.until(ExpectedConditions.presenceOfElementLocated((By.cssSelector("input#password")))).sendKeys("password123");

        waitTime.until(ExpectedConditions.elementToBeClickable(By.xpath(("//button[@type='submit']")))).click();

        waitTime.until(ExpectedConditions.elementToBeClickable(By.xpath(("//div[@class='ant-space-item']/button")))).click();


        WebElement title =waitTime.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'Quinn Turner')]")));
        String titleName=title.getText();

        if(titleName.equals("Quinn Turner")){
            System.out.println("Text passed");
        }else{
            System.out.println("Name is different");
        }



        driver.quit();



    }
}
