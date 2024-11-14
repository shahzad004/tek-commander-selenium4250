package Week4.day1;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Checkboxes extends WebDriverSetup {
    public static void main(String[] args) {

         webDriverSetup();
         navigateToUrl("https://retail.tekschool-students.com/selenium/checkbox");
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
        Actions act=new Actions(driver);

        WebElement label=driver.findElement(By.cssSelector("input#musicInput"));

        act.click(label).perform();

        if(label.isSelected()){
            System.out.println("selected");
            act.click(label).perform();
            System.out.println("unseleted now");
        }else{
            System.out.println("not selected");
        }


        System.out.println(label.getText());





    }
}
