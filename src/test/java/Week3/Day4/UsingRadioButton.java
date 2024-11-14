package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingRadioButton extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException{

        webDriverSetup();
        navigateToUrl("https://demoqa.com/automation-practice-form");
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions act=new Actions(driver);

        WebElement button=driver.findElement(By.xpath("//label[normalize-space()='Male']"));
    act.click(button).perform();
    Thread.sleep(1000);


    closeTab();
    quitBrower();




    }
}
