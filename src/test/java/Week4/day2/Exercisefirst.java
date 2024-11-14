package Week4.day2;

import Week3.WebDriver.WebDriverSetup;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Exercisefirst extends WebDriverSetup {
    public static void main(String[] args) throws InterruptedException {

        String urL="https://retail.tekschool-students.com/";

        webDriverSetup();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        Actions act=new Actions(driver);

      Random autoNumber=new Random();

        navigateToUrl(urL);
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/"));

        // sign in button first
       WebElement signInButton= driver.findElement(By.xpath("//a[@id='signinLink']"));
       act.click(signInButton).perform();

       wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/auth/login"));


       //  new account creation

       WebElement createAccount= driver.findElement(By.xpath("//a[@id='newAccountBtn']"));
       act.click(createAccount).perform();
        wait.until(ExpectedConditions.urlToBe("https://retail.tekschool-students.com/auth/sign-up"));

       // signup form

      WebElement enterName= driver.findElement(By.xpath("//input[@id='nameInput']")) ;
       act.click(enterName).perform();
       int no= autoNumber.nextInt(100);
       String userName="Khan";
       String email="khan1"+no+"@gmail.com";
       String password="Hello@12";


       act.keyDown(Keys.SHIFT).perform();
       for(char ch:userName.toCharArray()){

           act.sendKeys(String.valueOf(ch)).perform();
           Thread.sleep(100);
           act.keyUp(Keys.SHIFT).perform();
       }

       Thread.sleep(100);
        // to enter email
        WebElement emailInfo=driver.findElement(By.xpath("//input[@id='emailInput']"));
        act.click(enterName).perform();
        act.keyDown(Keys.TAB).perform();
        for(char ch:email.toCharArray()){
            act.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(100);
        }

        // To enter password
       // WebElement passw=driver.findElement(By.xpath("//input[@id='passwordInput']"));
        //  act.click(enterName).perform();

        act.keyDown(Keys.TAB).perform();
        for(char ch:password.toCharArray()){
            act.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(100);
        }

      //  WebElement emailInfo=driver.findElement(By.xpath("//input[@id='confirmPasswordInput']"));
        //  act.click(enterName).perform();

        act.keyDown(Keys.TAB).perform();
        for(char ch:password.toCharArray()){
            act.sendKeys(String.valueOf(ch)).perform();
            Thread.sleep(100);
        }


        // To click on sign in option:
       WebElement signupButton= driver.findElement(By.xpath("//button[@id='signupBtn']"));
        act.click(signupButton).perform();




        Thread.sleep(1000);


        WebElement updateName=driver.findElement(By.xpath("//input[@name='name']"));
        updateName.clear();
        act.click(updateName).perform();


        act.sendKeys("Khan Sahib").perform();
        Thread.sleep(4000);



        // To click on update
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='personalUpdateBtn']")));
        WebElement updateClick=driver.findElement(By.xpath("//button[@id='personalUpdateBtn']"));
        act.click(updateClick).perform();
        Thread.sleep(1000);



        // To choose Date and time Using Select
        WebElement month=driver.findElement(By.xpath("//select[@name='expirationMonth']"));
            Select select=new Select(month);
            select.selectByVisibleText("12");


        WebElement year=driver.findElement(By.xpath("//select[@name='expirationYear']"));
        Select option=new Select(year);
        option.selectByVisibleText("2025");
        Thread.sleep(5000);




        closeTab();
        quitBrower();
















    }
}
