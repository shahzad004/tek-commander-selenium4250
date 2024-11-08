package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingAssignment extends WebDriverSetup {
    public static void main(String[] args) {

        WebDriverSetup();
        navigateToUrl("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(20));

       WebElement countries= driver.findElement(By.cssSelector("select#countrySelect"));

        wait.until(ExpectedConditions.elementToBeClickable(countries));

        Select countryName=new Select(countries);
       countryName.selectByVisibleText("United States");


        System.out.println(countryName.getFirstSelectedOption().getText());

        closeTab();
        quitBrower();

    }
}
