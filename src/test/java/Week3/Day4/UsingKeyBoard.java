package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingKeyBoard extends WebDriverSetup {






    public static void main(String[] args) throws InterruptedException{

        webDriverSetup();
        navigateToUrl("https://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        WebElement button=driver.findElement(By.xpath("//span[text()='Prime']"));
        wait.until(ExpectedConditions.visibilityOf(button));

        // For Hover
        Actions act=new Actions(driver);
        act.moveToElement(button).perform();
        Thread.sleep(1000);
        // for Right Click
        act.contextClick(button).perform();
        Thread.sleep(1000);


        //
        act.click(button).perform();
        Thread.sleep(1000);



        closeTab();
        quitBrower();




    }
}
