package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class LabActivitOne {

    public static void main(String[] args) throws InterruptedException {

        Scanner input=new Scanner(System.in);
        System.out.println("Which Browser you want to open?");
        System.out.println("1: Chrome");
        System.out.println("2: Edge");


        WebDriver driver=null;

        String choice=input.next();
        System.out.println(choice);
        // to check condition
;       if(choice.equals("1") || choice.equalsIgnoreCase("Chrome")) {
            driver= new ChromeDriver();}
         if(choice.equals("2") || choice.equalsIgnoreCase("Edge")){
        driver=new EdgeDriver();}



        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000);
        driver.quit();




    }
}
