package Nop;

import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class CheckOut extends Utils {

    LoadProbs loadProbs=new LoadProbs();

    private By _country = By.id("BillingNewAddress_CountryId");
    private By _city = By.id("BillingNewAddress_City");
    private By _address1 = By.name("BillingNewAddress.Address1");
    private By _zipcode = By.name("BillingNewAddress.ZipPostalCode");
    private By _phonenumber = By.name("BillingNewAddress.PhoneNumber");
    private By _CardholderName = By.id("CardholderName");
    private By _CardNumber =By.id("CardNumber");
    private By _ExpireMonth=By.id("ExpireMonth");
    private By _ExpireYear  = By.id("ExpireYear");
    private By _CardCode = By.name("CardCode");


    public  void userShouldBeAbleToCheckOutSuccessfully(){
        SoftAssert softAssert = new SoftAssert();
        selectVisibleText(_country,loadProbs.getProperty("country"));
        enterText(_city,loadProbs.getProperty("city"));
        enterText(_address1,loadProbs.getProperty("address1"));
        enterText(_zipcode,loadProbs.getProperty("zipcode"));
        enterText(_phonenumber,loadProbs.getProperty("phonenumber"));
        clickElement(By.xpath("//div[@id='checkout-step-billing']/div/input[@class='button-1 new-address-next-step-button']"));
        clickElement(By.xpath("//form[@id=\"co-shipping-method-form\"]/div[2]/input[@type=\"button\"]"));
        clickElement(By.xpath("//input[@id='paymentmethod_1']"));
        clickElement(By.xpath("//div[@id='checkout-step-payment-method']/div/input[@type=\"button\"]"));
        selectVisibleText(By.id("CreditCardType"),"Master card");
        enterText(_CardholderName,loadProbs.getProperty("cardholdername"));
        enterText(_CardNumber,loadProbs.getProperty("cardnumber"));
        selectbyIndex(_ExpireMonth, 1);
        selectbyIndex(_ExpireYear,3);
        enterText(_CardCode,loadProbs.getProperty("cardcode"));
        clickElement(By.xpath("//div[@id='checkout-step-payment-info']/div/input[@type='button']"));
        clickElement(By.xpath("//input[@class='button-1 confirm-order-next-step-button']"));
        softAssert.assertEquals(getTextFromEement(By.xpath("div[2]/div/div/strong")),"Your order has been successfully processed!");
        softAssert.assertAll();


    }

    }

