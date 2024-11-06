package Week3.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements {
       static WebDriver driver;


      // to drop down

    public  WebElement locateByname(String name){

        return  driver.findElement(By.name(name));
    }








}
