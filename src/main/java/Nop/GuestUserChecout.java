package Nop;

import org.openqa.selenium.By;

public class GuestUserChecout extends Utils {
    LoadProbs loadProbs = new LoadProbs();
    CheckOut checkOut = new CheckOut();
    private By _firstname = By.id("BillingNewAddress_FirstName");
    private By _lastname = By.id("BillingNewAddress_LastName");
    private By _email = By.id("BillingNewAddress_Email");


    public void guestUserShouldAbleToCheckOutSucessfully(){
        enterText(_firstname,loadProbs.getProperty("firstname"));
        enterText(_lastname,loadProbs.getProperty("lastname"));
        enterText(_email,loadProbs.getProperty("email")+randomdate()+"@gmail.com");
        checkOut.userShouldBeAbleToCheckOutSuccessfully();

    }
}
