package PracticeSelenium.AlertActions;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingAlertConfirm extends WebDriverSetup {
    public static void main(String[] args) {

        webDriverSetup();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(2));
        navigateToUrl("https://demoqa.com/alerts");
        Actions act=new Actions(driver);

        wait.until(ExpectedConditions.urlToBe("https://demoqa.com/alerts"));
        WebElement button= driver.findElement(By.cssSelector("button#confirmButton"));

        // for mouse action
        act.moveToElement(button).contextClick(button).click(button).perform();


        Alert popup=driver.switchTo().alert();
        System.out.println(popup.getText());

        popup.accept();


        closeTab();

        quitBrower();

    }

}
