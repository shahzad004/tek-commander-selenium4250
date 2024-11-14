package PracticeSelenium.AlertActions;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingAlertSendingkey extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException {
        webDriverSetup();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateToUrl("https://demoqa.com/alerts");
        Actions act=new Actions(driver);

        wait.until(ExpectedConditions.urlToBe("https://demoqa.com/alerts"));
        WebElement button= driver.findElement(By.cssSelector("button#promtButton"));

        // for mouse action
        act.moveToElement(button).contextClick(button).click(button).perform();

        Alert alertButton= driver.switchTo().alert();
        // Wait for the prompt alert to appear
        wait.until(ExpectedConditions.alertIsPresent());

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

            alert.sendKeys("JHKJHDFKJH");
        // Send keys to the prompt alert
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','Mr khan is here') ", alert );




        System.out.println(alertButton.getText());
        Thread.sleep(1500);
        alertButton.accept();
/*
        Alert popup=driver.switchTo().alert();
        Thread.sleep(1000);
       popup.sendKeys("Khan");

        Thread.sleep(1000);
        System.out.println(popup.getText());

        popup.accept();
*/

        closeTab();

        quitBrower();


    }
}
