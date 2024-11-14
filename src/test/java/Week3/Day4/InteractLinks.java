package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class InteractLinks extends WebDriverSetup {

    public static void sitelinks(){


       driver.findElement(By.xpath("//a[text()='new window with js']"));
        driver.findElement(By.xpath("//a[text()='new tab with html']"));
    }


    public static void clicktoLink(String xpath) throws InterruptedException {
       WebElement site= driver.findElement(By.xpath(xpath));
       site.click();
        Thread.sleep(1500);
        System.out.println( driver.getTitle());
        Thread.sleep(1500);

    }

    public static void main(String[] args) throws InterruptedException {

        String baseUrl="https://retail.tekschool-students.com/selenium/links";
        webDriverSetup();
        navigateToUrl("https://retail.tekschool-students.com/selenium/links");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));



        clicktoLink("//a[text()='new tab with html']");
        // clicktoLink("//a[text()='same tab']");
        Thread.sleep(1000);

        List<String> ids= new ArrayList<>(driver.getWindowHandles());



     //  clicktoLink("//a[text()='new window with js']");

        quitBrower();

    }
}
