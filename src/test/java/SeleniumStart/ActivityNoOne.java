package SeleniumStart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActivityNoOne{
    public static void main(String[] args) {

        WebDriver chromedriver=new ChromeDriver();

        chromedriver.get("https://retail.tekschool-students.com/");

        chromedriver.manage().window().maximize();

        By signIn = By.id("signinLink");
        WebElement signInButton = chromedriver.findElement(signIn);
        signInButton.click();

       By createAccount= By.id("newAccountBtn");

        WebElement createNewAccount= chromedriver.findElement(createAccount);
        createNewAccount.click();
        // to close browser
        chromedriver.quit();
    }
}
