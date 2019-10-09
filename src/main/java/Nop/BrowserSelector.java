package Nop;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class BrowserSelector extends Utils{
    LoadProbs loadProbs=new LoadProbs();

    public void setupBrowser(){

        String browser= loadProbs.getProperty("browser");
        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\Resource\\BrowserDriver\\chromedriver.exe");
            //open the browser
            driver = new ChromeDriver();
        }else if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver","src\\test\\Resource\\BrowserDriver\\geckodriver.exe");
            //open the browser
            driver = new FirefoxDriver();
        }else if (browser.equalsIgnoreCase("Ie")){
            System.setProperty("webdriver.ie.driver","src\\test\\Resource\\BrowserDriver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
        }else {
            System.out.println("Browser name is empty or typed wrong "+ browser);
        }
    }

}
