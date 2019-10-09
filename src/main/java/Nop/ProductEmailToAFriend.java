package Nop;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import java.security.acl.LastOwnerException;

import static Nop.Utils.clickElement;

public class ProductEmailToAFriend extends Utils {
LoadProbs loadProbs=new LoadProbs();
private  By _friendsemail = By.name("FriendEmail");
private By _personalMessage = By.xpath("//textarea[@placeholder='Enter personal message (optional).']");
private By _sendEmail = By.name("send-email");
private By _Youremailaddress = By.id("YourEmailAddress");

public void enterDetailsForEmailAFriend(){

    SoftAssert softAssert=new SoftAssert();

    clickElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    clickElement(By.linkText("Apple MacBook Pro 13-inch"));
    //click on 'Email a friend' link
    clickElement(By.xpath("//input[@value='Email a friend']"));
    //Enter friend Email id
    String currenturl = driver.getCurrentUrl();
    softAssert.assertTrue(currenturl.contains("emailafriend"),"current url is right");
    enterText(_friendsemail,loadProbs.getProperty("friend'semail"));
    //Enter personal message
    enterText(_personalMessage,loadProbs.getProperty("personalmessage"));
    //click on send email
    clickElement(_sendEmail);
    //compare Actual value and Expected value
    softAssert.assertEquals(getTextFromEement(By.xpath("//div[@class=\"result\"]")),"Your message has been sent.");
    softAssert.assertAll();
}

}
