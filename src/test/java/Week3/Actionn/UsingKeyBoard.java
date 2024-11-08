package Week3.Actionn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UsingKeyBoard {
      public static WebDriver driver;

      public void browser(){
          driver=new ChromeDriver();
          driver.manage().window().maximize();
      }
      public void navigateTo(String url){
          driver.get(url);
      }
      public void closeTab(){
          driver.close();
      }
      public void quit(){
          driver.quit();
      }


    public static void main(String[] args) throws InterruptedException {
        var obj=new UsingKeyBoard();

        obj.browser();
        obj.navigateTo("https://www.facebook.com");
        Actions action=new Actions(driver);

        Thread.sleep(1000);
        WebElement userfield= driver.findElement(By.cssSelector("input[name='email']"));
        WebElement userpass=driver.findElement(By.cssSelector("input[name='pass']"));

        String text="Hello Mr Khan ";

        action.click(userfield).perform();

        for(char ch: text.toCharArray()){
            action.sendKeys(String.valueOf(ch));
            Thread.sleep(500);

        }

        action.keyDown(Keys.TAB).perform();

        for(char ch: text.toCharArray()){
            action.sendKeys(String.valueOf(ch));
            Thread.sleep(500);

        }

        action.keyDown(Keys.TAB).perform();

        action.keyDown(Keys.ENTER).perform();

        Thread.sleep(2000);



        obj.closeTab();





    }}
