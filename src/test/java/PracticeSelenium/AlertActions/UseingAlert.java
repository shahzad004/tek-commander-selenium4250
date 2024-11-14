package PracticeSelenium.AlertActions;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UseingAlert extends WebDriverSetup {

    public static void main(String[] args) throws InterruptedException{

        webDriverSetup();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateToUrl("https://demoqa.com/alerts");
        Actions act=new Actions(driver);

        wait.until(ExpectedConditions.urlToBe("https://demoqa.com/alerts"));
        WebElement button= driver.findElement(By.cssSelector("button#alertButton"));
        // for practice lets have mouse actions as well
        // for Hover
        act.moveToElement(button).perform();
        Thread.sleep(1500);

        // for Rightclick on button
        act.contextClick(button).perform();
        Thread.sleep(1500);

        // To left click or simply click
        act.click(button).perform();

        // As we click pop up comes know access that pop you have to change the browser or jump in that window
        // lets first use Alert class
       Alert selection= driver.switchTo().alert();



       Thread.sleep(1500);
        selection.accept();


        closeTab();
        quitBrower();




    }}
