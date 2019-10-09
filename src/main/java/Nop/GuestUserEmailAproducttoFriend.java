package Nop;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

import static Nop.Utils.clickElement;
import static Nop.Utils.enterText;

public class GuestUserEmailAproducttoFriend extends Utils {

    LoadProbs loadProbs=new LoadProbs();
    private By _friendsemail = By.name("FriendEmail");
    private By _personalMessage = By.xpath("//textarea[@placeholder='Enter personal message (optional).']");
    private By _sendEmail = By.name("send-email");
    private By _Youremailaddress = By.id("YourEmailAddress");


    public void guestUserEnterDetailsForEmailAFriend(){

        SoftAssert softAssert=new SoftAssert();

        clickElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        clickElement(By.linkText("Apple MacBook Pro 13-inch"));
        //click on 'Email a friend' link
        clickElement(By.xpath("//input[@value='Email a friend']"));
        //Enter friend Email id
        enterText(_friendsemail,loadProbs.getProperty("friend'semail"));
        //Enter personal message
       enterText(_Youremailaddress,loadProbs.getProperty("YourEmailAddress")+randomdate()+"@gmail.com");
        enterText(_personalMessage,loadProbs.getProperty("personalmessage"));
        //click on send email
        clickElement(_sendEmail);
        softAssert.assertEquals(getTextFromEement(By.xpath("//div[@class='message-error validation-summary-errors']")),"Only registered customers can use email a friend feature");
        softAssert.assertAll();
    }

}


