package PracticeSelenium;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Practice extends WebDriverSetup {

    public static void main(String[] args) throws InterruptedException {

        webDriverSetup();
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateToUrl("https://retail.tekschool-students.com/selenium/radio");
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/selenium/radio"));
        Actions act=new Actions(driver);


       List<WebElement> rbuttons= driver.findElements(By.xpath("//input[@name='tshirt']/following-sibling::label"));

       for(WebElement r:rbuttons){
           System.out.println(r.getText());
           Thread.sleep(500);
       }


    WebElement rbutton= driver.findElement(By.cssSelector("label[for='extra large']"));

       act.click(rbutton).perform();
        System.out.println(rbutton.getText());
        rbutton.click();

        System.out.println(rbutton.getText());


   

    }
}
