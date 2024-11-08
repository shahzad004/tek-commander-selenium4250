package Week3;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class Assignment extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException {

        String baseUrl="https://retail.tekschool-students.com/selenium/iframe ";

        WebDriverSetup();
        navigateToUrl(baseUrl);

        Thread.sleep(1000);

        (( JavascriptExecutor) driver ).executeScript("window.open('https://www.youtube.com','_blank')");
        Thread.sleep(1000);
        (( JavascriptExecutor) driver ).executeScript("window.open('https://www.google.com','_blank')");

        // in order to get title first lets have list to get window handles

       List<String> tabs=new ArrayList<>(driver.getWindowHandles());


       for(String tab:tabs){
           driver.switchTo().window(tab);
           System.out.println(driver.getTitle());
           driver.close();
                              }

       driver.switchTo().window(tabs.get(1));
       driver.quit();




    }
}
