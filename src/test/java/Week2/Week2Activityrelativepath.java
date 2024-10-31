package Week2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2Activityrelativepath {
    public static void main(String[] args) throws InterruptedException {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://retail.tekschool-students.com/");
        driver.manage().window().maximize();


        driver.findElement(By.xpath("//input[@class='search__input']")).sendKeys("Keyboard");

        driver.findElement(By.xpath("//button[@class='search__btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@class='products__layout']/img")).click();
        Thread.sleep(1000);
        WebElement textElement= driver.findElement(By.xpath("//div[@class='product__layout-column']/h1"));

        String headingtext= textElement.getText();

        System.out.println(headingtext);

        driver.quit();
    }
}
