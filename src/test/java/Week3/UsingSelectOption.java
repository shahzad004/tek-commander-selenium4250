package Week3;

import Week3.WebDriver.WebDriverSetup;

import Week3.locators.LocateElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class UsingSelectOption extends WebDriverSetup {


    public static void main(String[] args) throws InterruptedException {
       var locateByName=new LocateElements();

         webDriverSetup();
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
