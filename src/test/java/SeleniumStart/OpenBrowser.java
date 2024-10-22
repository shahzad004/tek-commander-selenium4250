package SeleniumStart;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowser {
    public static void main(String[] args) {


        ChromeDriver chromeDriver=new ChromeDriver();
        chromeDriver.get("https://www.facebook.com/");

        //closing browser or
       chromeDriver.quit();

        // close(); is used to close just one tab of browser
       // chromeDriver.close();


    }
}
