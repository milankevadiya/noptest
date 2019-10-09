package Nop;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationPage extends Utils{
    LoadProbs loadProbs = new LoadProbs();

    private  By _firstname = By.id("FirstName");
    private By _lastname = By.id("LastName");
    private  By _email = By.id("Email");
    private By _password=By.id("Password");
    private By _confirmPassword=By.id("ConfirmPassword");
    private  By _registerbutton = By.id("register-button");

    public void userEnterRegistrationDetails(){

    enterText(_firstname,loadProbs.getProperty("firstname"));
    enterText(_lastname,loadProbs.getProperty("lastname"));
    enterText(_email,loadProbs.getProperty("email")+randomdate()+"@gmail.com");
    enterText(_password,loadProbs.getProperty("password"));
    enterText(_confirmPassword,loadProbs.getProperty("confirmpassword"));
    clickElement(_registerbutton);


    }

}
