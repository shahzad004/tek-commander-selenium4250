package Week3.Actionn;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingMonday extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException{


        webDriverSetup();
        navigateToUrl("https://demoqa.com/automation-practice-form");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions action=new Actions(driver);

        WebElement userFirst= driver.findElement(By.xpath("//input[@id='firstName']"));
        wait.until(ExpectedConditions.elementToBeClickable(userFirst));
         String text="Hi, Mr Khan";
        action.click(userFirst).perform();
        Thread.sleep(1000);
        action.sendKeys(text).perform();

        action.keyDown(Keys.TAB).click().release().perform();



        WebElement userLast= driver.findElement(By.xpath("//input[@id='lastName']"));
        wait.until(ExpectedConditions.elementToBeClickable(userLast));
        action.click(userLast).perform();
        Thread.sleep(1000);
        action.sendKeys(text).perform();




        closeTab();
            quitBrower();


    }
}
