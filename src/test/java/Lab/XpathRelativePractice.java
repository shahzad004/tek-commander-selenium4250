package Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathRelativePractice {

    public static void main(String[] args) throws InterruptedException {

        ChromeDriver dri=new ChromeDriver();
        dri.get("https://dev.retail.tekschool-students.com/");
        dri.manage().window().maximize();

        dri.findElement(By.xpath("//a[contains(@placeholder='Sign in')]"));












      Thread.sleep(2000);

        dri.quit();
    }
}
