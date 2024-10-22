package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingIdLocators {
    public static void main(String[] args) {

        ChromeDriver driver =new ChromeDriver();

        //
        driver.get("https://retail.tekschool-students.com/");

        // to maximize the window
        driver.manage().window().maximize();

        //step to locate the element
        By signInLink =By.id("signinLink");

        //step 2 ask selenium to find the element
        WebElement signInElement = driver.findElement(signInLink);

        //step 3 perform the action
        signInElement.click();
    }
}
