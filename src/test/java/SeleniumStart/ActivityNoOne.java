package SeleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityNoOne{
    public static void main(String[] args) {

        WebDriver chromedriver=new ChromeDriver();

        chromedriver.get("https://www.retail.tekschool-students.com/");

       By createAccount= By.id("newAccountBtn");

        WebElement createNewAccount= chromedriver.findElement(createAccount);

        // to close browser
        chromedriver.quit();
    }
}
