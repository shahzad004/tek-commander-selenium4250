package Week3.WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSetup {


         public static WebDriver driver;

         public static void webDriverSetup(){
             driver=new ChromeDriver();
             driver.manage().window().maximize();
         }

         public static void waitTime(String path){
             WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
             wait.until(ExpectedConditions.visibilityOf((WebElement) By.xpath(path)));
         }

         public static void navigateToUrl(String url){
             driver.get(url);
         }



         public static void closeTab(){
             driver.close();
         }

         public static void quitBrower(){
             driver.quit();
         }

}
