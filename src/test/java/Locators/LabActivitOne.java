package Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class LabActivitOne {

    public static void main(String[] args) throws InterruptedException {

        Scanner input=new Scanner(System.in);
        System.out.println("Which Browser you want to open?");
        System.out.println("1: Chrome");
        System.out.println("2: Edge");


        int choice=input.nextInt()
;       if(choice==1) {
            ChromeDriver  driver=new ChromeDriver();
            driver.get("https://dev.retail.tekschool-students.com/");
            driver.manage().window().maximize();

            String title= driver.getTitle();
            System.out.println(title);
            Thread.sleep(1000);
            driver.quit();

        }
        if(choice==2){
            EdgeDriver edgedriver=new EdgeDriver();
            edgedriver.get("https://dev.retail.tekschool-students.com/");
            edgedriver.manage().window().maximize();
            Thread.sleep(1000);
            String title2= edgedriver.getTitle();
            System.out.println(title2);

            edgedriver.quit();

        }






    }
}
