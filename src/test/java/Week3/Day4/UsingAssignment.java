package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingAssignment extends WebDriverSetup {
    public static void main(String[] args) {

        webDriverSetup();
        navigateToUrl("https://retail.tekschool-students.com/selenium/dropdown");

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));

       WebElement options= driver.findElement(By.xpath("//select[@id='languageSelect']"));
        wait.until(ExpectedConditions.elementToBeClickable(options));

        Select select = new Select(options);
        WebElement option=driver.findElement(By.cssSelector("option[value='German']"));
        wait.until(ExpectedConditions.visibilityOf(option));

        System.out.println(option.getText());


        closeTab();
        quitBrower();

    }
}
