package Nop;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestSuit extends BaseTest {
    SoftAssert softAssert = new SoftAssert();
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    ProductEmailToAFriend productEmailToAFriend = new ProductEmailToAFriend();
    GuestUserEmailAproducttoFriend guestUserEmailAproducttoFriend = new GuestUserEmailAproducttoFriend();
    AddtoCart addtoCart = new AddtoCart();
    CheckOut checkOut = new CheckOut();
    GuestUserChecout guestUserChecout = new GuestUserChecout();

    @Test
    public void userShouldBeAbleToRegisterSuccessfully() {
        homePage.userShouldBeClickOnRegosterlink();
        registrationPage.userEnterRegistrationDetails();
        registrationResultPage.registrationsuccesfullmessage();
    }

    @Test
    public void userShouldBeAbleToRefereAFriend() {
        userShouldBeAbleToRegisterSuccessfully();
        productEmailToAFriend.enterDetailsForEmailAFriend();
    }

    @Test
    public void nonRegisterUserShouldNotAbleToRefereAFriend() {
        guestUserEmailAproducttoFriend.guestUserEnterDetailsForEmailAFriend();
    }

    @Test
    public void userShouldBeAbleToPurchaseProductSucessfully(){
        userShouldBeAbleToRegisterSuccessfully();
        addtoCart.userShouldbeAbletoPurchaseitem();
        checkOut.userShouldBeAbleToCheckOutSuccessfully();
    }

    @Test
    public void  guestUserShouldBeableToPurchaseProductSucessfully(){
        addtoCart.userShouldbeAbletoPurchaseitem();
        clickElement(By.xpath("//input[@class='button-1 checkout-as-guest-button']"));
        guestUserChecout.guestUserShouldAbleToCheckOutSucessfully();
    }

}

