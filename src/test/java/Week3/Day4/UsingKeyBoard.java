package Week3.Day4;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingKeyBoard extends WebDriverSetup {
    public static void main(String[] args) {

        WebDriverSetup();
        navigateToUrl("https://www.amazon.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement button=driver.findElement(By.xpath("//span[text()='Prime']"));
        Actions act=new Actions(driver);
        act.moveToElement(button).perform();


        act.contextClick(button).perform();

        act.click(button).perform();



        closeTab();
        quitBrower();






    }
}
