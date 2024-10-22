package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityUsingName {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromedriver=new ChromeDriver();

        chromedriver.get("https://www.facebook.com");
        chromedriver.manage().window().maximize();
Thread.sleep(2000);
       By emailLocator= By.name("email");
        WebElement emailElement=chromedriver.findElement(emailLocator);
        emailElement.sendKeys("khansahib@gamil.com");

        // for password
        By passLocator=By.name("pass");
        WebElement passElement= chromedriver.findElement(passLocator);
        passElement.sendKeys("3234234");

        // to click on login in
       By loginLocator =By.name("login");
       WebElement loginElement=chromedriver.findElement(loginLocator);

       loginElement.click();

       Thread.sleep(3000);

       chromedriver.quit();
    }
}
