package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Week2day3Activity {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        // TO sycncronize so selenium speed with browser speed
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        WebDriverWait waitTime=new WebDriverWait(driver,Duration.ofSeconds(20));

        WebElement signInElement= waitTime.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("a#signinLink")));
                signInElement.click();


        WebElement emailElement=waitTime.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#email")));
        emailElement.sendKeys("khan1@gmail.com");


        WebElement passElement=waitTime.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("input#password")));
        passElement.sendKeys("Khan@123");



        WebElement loginElement= waitTime.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button[id='loginBtn']")));
        loginElement.click();


        WebElement accountElement= waitTime.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("a[id='accountLink']")));
        accountElement.click();



        WebElement phoneNoElement=waitTime.until(
                ExpectedConditions.presenceOfElementLocated(By.cssSelector("input[name='phoneNumber']")));
        phoneNoElement.sendKeys("4");

        WebElement updateElement= waitTime.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button#personalUpdateBtn")));
        updateElement.click();



        String message= driver.findElement(By.xpath("//div[text()='Personal Information Updated Successfully']")).getText();
        System.out.println(message);


        driver.quit();
    }
}
