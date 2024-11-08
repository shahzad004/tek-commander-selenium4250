package Week3;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;


public class OpeningTabs {

    public static void main(String[] args) throws InterruptedException {

        String firstUrl, secondUrl;
        firstUrl="https://www.google.com";
        secondUrl="https://www.facebook.com";

        WebDriver driver= new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/iframe");
        driver.manage().window().maximize();

        (( JavascriptExecutor ) driver).executeScript("window.open('https://www.google.com/', '_blank')");

        Thread.sleep(3000);

        (( JavascriptExecutor )driver).executeScript("window.open('https://www.facebook.com', '_blank')");

        Thread.sleep(3000);

        List<String> tabs= new ArrayList<>(driver.getWindowHandles());

        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
        driver.switchTo().window(tabs.get(2));


        for(String tab:tabs){
           driver.switchTo().window(tab);
            driver.close();
        }

        driver.quit();


    }
}
