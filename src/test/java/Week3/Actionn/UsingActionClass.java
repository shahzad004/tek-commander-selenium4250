package Week3.Actionn;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class UsingActionClass extends WebDriverSetup {

    public static void main(String[] args) throws InterruptedException {

        String baseUrl="https://retail.tekschool-students.com/selenium/drag-drop";

        webDriverSetup();
        navigateToUrl(baseUrl);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));




       WebElement source= driver.findElement(By.xpath("//div[text()='Payment should not accept invalid expiration date']"));
        WebElement target = driver.findElement(By.xpath("//div[@data-rbd-droppable-id='2']"));

        // Action class object in order to perform click operations
        Actions action=new Actions(driver);
        Thread.sleep(1000);

        //  to just see what option the button have or right click
       // action.contextClick(button).perform();


        // for hover use command movetoELment
        // action.movetoElement(button).perform();

        action.clickAndHold(source)
                .moveByOffset(0,10)
                .moveToElement(target)
                .release()
                .perform();













    }
}
