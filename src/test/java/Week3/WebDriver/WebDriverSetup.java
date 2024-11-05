package Week3.WebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSetup {


         public static WebDriver driver;

         public static void WebDriverSetup(){
             driver=new ChromeDriver();
             driver.manage().window().maximize();
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
