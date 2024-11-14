package Week4.day1;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ScrollBar extends WebDriverSetup {

    public static void main(String[] args)   throws InterruptedException{


        webDriverSetup();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateToUrl("https://retail.tekschool-students.com/selenium/inputs");
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/selenium/inputs"));
        Actions act = new Actions(driver);


        WebElement scrollbar=driver.findElement(By.cssSelector("input[type='range']"));
        JavascriptExecutor js= (JavascriptExecutor) driver;



       // js.executeScript("arguments[0].value=15 ;", scrollbar);



        for(int i=0; i<=15; i++){
            js.executeScript("arguments[0].value='" + i +"';" , scrollbar);

            Thread.sleep(500);
        }



    }
}