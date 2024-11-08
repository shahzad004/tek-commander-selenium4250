package Week3.Actionn;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class UsingActionKeyboard {
            public static WebDriver driver;

    public static void driverSetup(){
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }

    public static void navigateToUrl(String url){
          driver.get(url);
    }

    public static void closetab(){
        driver.close();
    }

    public static void quitbroswer(){
        driver.quit();
    }


    public static void main(String[] args) throws InterruptedException {

        driverSetup();
       navigateToUrl("https://www.facebook.com");

        WebElement userfield= driver.findElement(By.cssSelector("input[name='email']"));
        WebElement userpass=driver.findElement(By.cssSelector("input[name='pass']"));


        String text="Hello Mr Khan ";
        String text2="Shahzad!";
        // to perform Action

        Actions action =new Actions(driver);
        action.click(userfield).perform();
        Thread.sleep(1000);

        action.keyDown(Keys.SHIFT).perform();

        for(char ch:text.toCharArray()){
            action.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(1000);
        }

        action.keyUp(Keys.SHIFT).perform();

        for(char chp: text2.toCharArray()){
            action.sendKeys(String.valueOf(chp)).perform();


        }


        closetab();
        quitbroswer();






    }
}
