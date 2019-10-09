package Nop;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
    LoadProbs loadProbs = new LoadProbs();
    BrowserSelector browserSelector=new BrowserSelector();

    @BeforeMethod
    public void setUp() {
        browserSelector.setupBrowser();
        //open the browser
        driver.manage().window().fullscreen();
        //set implicity wait
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com");
        //loadProbs.getProperty("url");

    }

    @AfterMethod

    public void close()
    {
    //    driver.quit();
    }



}

