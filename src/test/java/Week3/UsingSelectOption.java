package Week3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UsingSelectOption {
    public static void main(String[] args) {

        ChromeDriver driver =new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/selenium/dropdown");
        driver.manage().window().maximize();


       WebElement choice= driver.findElement(By.xpath("//select[@id='languageSelect']"));

        Select choices=new Select(choice);
        choices.selectByVisibleText("Pashto");

        List<WebElement> options=driver.findElements(By.xpath("//select[@id='languageSelect']"));

        for(WebElement list: options){
            System.out.println(list.getText());

        }


        driver.quit();




    }
}
