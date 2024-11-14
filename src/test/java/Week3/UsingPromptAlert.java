package Week3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingPromptAlert {

    public static void main(String[] args) throws InterruptedException {


        String baseUrl="https://retail.tekschool-students.com/selenium/javascript-alerts";
        WebDriver driver=new ChromeDriver();
        driver.get(baseUrl);
        driver.manage().window().maximize();


        WebElement promptButton=driver.findElement(By.xpath("//button[text()='Prompt']"));

       promptButton.click();

        Alert alertButton= driver.switchTo().alert();
        alertButton.sendKeys("khan k");

        System.out.println(alertButton.getText());
        Thread.sleep(1500);
        alertButton.accept();
        Thread.sleep(1500);
        driver.close();
        driver.quit();









    }
}
