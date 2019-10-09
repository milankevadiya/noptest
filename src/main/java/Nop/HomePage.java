package Nop;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class HomePage extends Utils {
    SoftAssert softAssert = new SoftAssert();

    public void userShouldBeClickOnRegosterlink(){

        clickElement(By.linkText("Register"));
        softAssert.assertEquals(getTextFromEement(By.xpath("//div[@class='page-title']")),"Register");
        softAssert.assertAll();

    }
}
