package Week4.day3;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class Exercise extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException {

        String urL="https://www.amazon.com/";

        webDriverSetup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions act=new Actions(driver);



        navigateToUrl(urL);
        wait.until(ExpectedConditions.urlToBe("https://www.amazon.com/"));


        WebElement signIn=driver.findElement(By.xpath("//a//div[@class='nav-line-1-container']"));
        act.moveToElement(signIn).perform();

         WebElement buttonclick=driver.findElement(By.xpath("(//span[@class='nav-action-inner'][normalize-space()='Sign in'])[1]"));
        act.click(buttonclick).perform();
        Thread.sleep(1000);



        closeTab();
        quitBrower();


    }
}
