package PracticeSelenium;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class NaviagtionMethods extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException{

            webDriverSetup();
                   driver.navigate().to("https://retail.tekschool-students.com/selenium/");
                   driver.navigate().to("https://retail.tekschool-students.com/selenium/inputs");

        Set<String> tabs = driver.getWindowHandles();

        List<String> tab=new ArrayList<>(tabs);





        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        Thread.sleep(2000);
            driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());




    }
}
