package Week3;

import Week3.WebDriver.WebDriverSetup;

import Week3.locators.LocateElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class UsingSelectOption extends WebDriverSetup {


    public static void main(String[] args) throws InterruptedException {
       var locateByName=new LocateElements();

         WebDriverSetup();
         navigateToUrl("https://retail.tekschool-students.com/selenium/dropdown");



        Thread.sleep(1000);
       WebElement choice = driver.findElement(By.xpath("//select[@name='language']"));


        Thread.sleep(1000);
        Select choices=new Select(choice);
        choices.selectByVisibleText("Java");
        Thread.sleep(1000);



        closeTab();
        quitBrower();




    }
}
