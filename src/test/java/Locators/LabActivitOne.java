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

        int choice=input.nextInt()
;       if(choice==1) {
            driver= new ChromeDriver();}
         if(choice==2){
        driver=new EdgeDriver();}




        driver.get("https://dev.retail.tekschool-students.com/");
        driver.manage().window().maximize();

        String title= driver.getTitle();
        System.out.println(title);
        Thread.sleep(1000);
        driver.quit();




    }
}
