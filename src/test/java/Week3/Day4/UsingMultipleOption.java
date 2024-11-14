package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingMultipleOption extends WebDriverSetup {
    public static void main(String[] args) throws  InterruptedException{

        webDriverSetup();
        navigateToUrl("https://demoqa.com/automation-practice-form");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement options= driver.findElement(By.xpath("//div[@id='hobbiesWrapper']//div[@class='col-md-9 col-sm-12']"));
        wait.until(ExpectedConditions.visibilityOf(options));

        WebElement option=driver.findElement(By.xpath("//label[normalize-space()='Sports']"));
        wait.until(ExpectedConditions.elementToBeClickable(option));


        WebElement option1=driver.findElement(By.xpath("//label[normalize-space()='Reading']"));
        wait.until(ExpectedConditions.elementToBeClickable(option1));

       Actions act=new Actions(driver);


       act.click(option1).perform();
       act.click(option).perform();
       Thread.sleep(1500);



        closeTab();
        quitBrower();




    }
}
