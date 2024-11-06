package Week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAlertOption {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/javascript-alerts");
        driver.manage().window().maximize();

Thread.sleep(1500);
          WebElement confirmButton= driver.findElement(By.id("confirmBtn"));
          confirmButton.click();

        Alert alertButton= driver.switchTo().alert();
        Thread.sleep(1500);
        System.out.println(alertButton.getText());

        alertButton.accept();

        driver.close();
        driver.quit();





    }



}
