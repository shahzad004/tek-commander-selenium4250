package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2SignIn {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id='signinLink']")).click();

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("khan1@gmail.com");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Khan@123");
         Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Login']")).click();

        Thread.sleep(1000);

       boolean loginIn= driver.findElement(By.xpath("//button[@id='logoutBtn']")).isDisplayed();

        System.out.println(loginIn);
        // it will show  serach for keyword keyboard (All)
        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("Keyboard");

        driver.findElement(By.xpath("//button[@class='search__btn']")).click();
        // will click on one at first
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='products__layout']/img")).click();


            Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@id='addToCartBtn']")).click();
        Thread.sleep(1000);




       WebElement cartElement= driver.findElement(By.xpath("//span[@id='cartQuantity']"));
        Thread.sleep(1000);
        String count= cartElement.getText();

        if(count.equals("0")){
            System.out.println("NO Element is added");
        }else{
            System.out.println(count + "added to Cart");
        }


/*
        boolean cartElement= driver.findElement(By.xpath("//span[@id='cartQuantity']")).isDisplayed();
        System.out.println(cartElement);
*/

        driver.quit();




    }
}
