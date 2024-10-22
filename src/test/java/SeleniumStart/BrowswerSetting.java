package SeleniumStart;

import org.openqa.selenium.edge.EdgeDriver;

public class BrowswerSetting {

    public static void main(String[] args) {

        // create object of Class you want to access or use
        EdgeDriver driver = new EdgeDriver();
        // By using object then method to get the site you want to open
        driver.get("https://www.google.com/");

        // maximize browser
        driver.manage().window().maximize();
        // to get page title the method getTitle
        String pageTitle= driver.getTitle();

        System.out.println(pageTitle);
        driver.quit();



    }
}
