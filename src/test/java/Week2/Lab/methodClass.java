package Week2.Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class methodClass {
      private  WebDriverWait waitTime;

     public methodClass(WebDriverWait waitTime){
         this.waitTime=waitTime;

     };



    // for  explicit wait time
    public void click(By locator){
         waitTime.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKey(By locator,String value){
         waitTime.until(ExpectedConditions.presenceOfElementLocated(locator))
                 .sendKeys(value);
    }


    public void getText(By locator){
         waitTime.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

}