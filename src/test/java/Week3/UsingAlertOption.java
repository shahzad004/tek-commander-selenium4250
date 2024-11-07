package Week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingAlertOption {

    public static void main(String[] args) throws InterruptedException {


        String baseUrl="https://retail.tekschool-students.com/selenium/javascript-alerts";

        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();

Thread.sleep(1500);
          WebElement confirmButton= driver.findElement(By.id("confirmBtn"));
          confirmButton.click();

        Alert alertButton= driver.switchTo().alert();

        System.out.println(alertButton.getText());
        Thread.sleep(1500);
        alertButton.dismiss();
        Thread.sleep(1500);
        driver.close();
        driver.quit();





    }



}
