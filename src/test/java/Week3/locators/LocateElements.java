package Week3.locators;

import Week3.UsingSelectOption;
import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateElements extends WebDriverSetup {




      // to drop down

    public static WebElement locateByname(String name){

        return  driver.findElement(By.name(name));
    }








}
