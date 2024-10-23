package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ActivityUsingClassName {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromedriver=new ChromeDriver();

        chromedriver.get("https://retail.tekschool-students.com/");
        chromedriver.manage().window().maximize();

        By topNavLocator= By.className("top-nav__logo");
        WebElement topNavElement=chromedriver.findElement(topNavLocator);




        System.out.println(topNavElement.getText());
        Thread.sleep(2500);

        chromedriver.quit();

    }
}
