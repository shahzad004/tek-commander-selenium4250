package Week4.day1;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateAndScrollBar extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException {

        webDriverSetup();

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateToUrl("https://retail.tekschool-students.com/selenium/inputs");
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/selenium/inputs"));
        Actions act=new Actions(driver);


        WebElement dateButton=driver.findElement(By.cssSelector("input[type='date']"));

        act.click(dateButton).perform();

        act.sendKeys("01/01/2020").perform();
        Thread.sleep(1000);

        dateButton.clear();


        act.click(dateButton).perform();
        LocalDate today=LocalDate.now();
        String todayDate=today.format(DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        act.sendKeys(todayDate).perform();

        Thread.sleep(5000);

        dateButton.clear();
        Thread.sleep(1000);

        act.click(dateButton).perform();
        String newDate="01/01/2025";
        act.sendKeys(newDate).perform();


    quitBrower();


    }
}
