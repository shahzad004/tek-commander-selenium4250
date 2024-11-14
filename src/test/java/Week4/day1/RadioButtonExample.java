package Week4.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RadioButtonExample {
        public static WebDriver driver;

        public static void browser(){
            driver=new ChromeDriver();
            driver.manage().window().maximize();
        }

        public static void navigateTo(String urL){
             driver.get(urL);

        }

        public static void closetab(){
            driver.close();
        }

        public static void quitBrowser(){
            driver.quit();
        }




    public static void main(String[] args) throws InterruptedException {

            browser();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        navigateTo("https://retail.tekschool-students.com/selenium/radio");
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/selenium/radio"));
        Actions act = new Actions(driver);


        // selecting any option form div[1]

        WebElement button1 =driver.findElement(By.xpath("//input/following-sibling::label[@for='html']"));
        button1.click();
        Thread.sleep(1000);


// button from second option
        WebElement button2=driver.findElement(By.xpath("//input/following-sibling::label[@for='phone']"));
        act.click(button2).perform();
        Thread.sleep(1000);

      // Store third all in one list
    List<WebElement> buttonList= driver.findElements(By.xpath("//input[@name='tshirt']/following-sibling::label"));
        int i=1;
    for(WebElement op:buttonList){

        System.out.println("Option no" + i+ ":" +op.getText());
        i++ ;
    }


    Thread.sleep(1000);

    WebElement largeButton= driver.findElement(By.xpath("//input[@name='tshirt'][@value='lg']"));

    act.click(largeButton).perform();



        if ( largeButton.isSelected() ) System.out.println("yes, it's selected.");
        else System.out.println("No, it's not selected.");

        if ( largeButton.isEnabled() ) System.out.println("Yes, I can use this radioButton.");
        else System.out.println("No, I cannot use this radio button.");

Thread.sleep(1000);


quitBrowser();





        /*
         *
         * Navigate to "https://retail.tekschool-students.com/selenium/radio"
         * Locate and print the values of T-Shirt radio buttons
         * Store the text into a list of string
         * print each value into the console in a new line
         * Click on the "Large" radio button.
         *
         * */
    }
}
