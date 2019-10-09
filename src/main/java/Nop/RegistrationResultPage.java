package Nop;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResultPage extends Utils {

    public void registrationsuccesfullmessage() {


        Assert.assertEquals(getTextFromEement(By.xpath("//div[@class='result']")), "Your registration completed");

    }
}
