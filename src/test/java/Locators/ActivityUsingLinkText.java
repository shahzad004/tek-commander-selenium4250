package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityUsingLinkText {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver chromedriver=new ChromeDriver();

        chromedriver.get("https://www.bbc.com/");
        chromedriver.manage().window().maximize();

        By textLocator= By.linkText("Business");
        WebElement textElement=chromedriver.findElement(textLocator);
        textElement.click();

        // now after entering into business link we can get its title
        By titleLocator=By.className("juQBdA");
        WebElement titleElement= chromedriver.findElement(titleLocator);
        String businessText= titleElement.getText();

        System.out.println(businessText);


        chromedriver.quit();
    }
}
