package Week3.Actionn;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingMonday extends WebDriverSetup {
    public static void main(String[] args) {


        WebDriverSetup();
        navigateToUrl("https://www.monday.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement login=driver.findElement(By.xpath("//div/a[text()='Log in']"));

    Actions act =new Actions(driver);
    act.click(login).perform();

        WebElement user=driver.findElement(By.id("user_email"));
            act.click(user).sendKeys("Welcom@gmail.com").perform();


            closeTab();
            quitBrower();


    }
}
