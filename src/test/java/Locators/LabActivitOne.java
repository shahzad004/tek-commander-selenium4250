package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LabActivitOne {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver  driver=new ChromeDriver();
        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000);
        driver.quit();

        EdgeDriver edgedriver=new EdgeDriver();
        edgedriver.get("https://dev.retail.tekschool-students.com/");
        edgedriver.manage().window().maximize();
        Thread.sleep(1000);
        String title2= edgedriver.getTitle();
        System.out.println(title2);



    }
}
