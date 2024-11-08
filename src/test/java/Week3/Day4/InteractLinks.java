package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class InteractLinks extends WebDriverSetup {

    public static void clicktoLink(String xpath){
       WebElement site= driver.findElement(By.xpath(xpath));
       site.click();
        System.out.println( driver.getTitle());


    }


    public static void main(String[] args) {

String baseUrl="https://retail.tekschool-students.com/selenium/links";
        WebDriverSetup();
        navigateToUrl("https://retail.tekschool-students.com/selenium/links");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));

        navigateToUrl("https://retail.tekschool-students.com/selenium/links");
        wait.until(ExpectedConditions.urlToBe("baseUrl"));

      clicktoLink("//a[text()='same tab']");
      clicktoLink("//a[text()='new tab with html']");
        clicktoLink("//a[text()='new window with js']");


        quitBrower();

    }
}
