package Nop;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddtoCart extends Utils {

    public void userShouldbeAbletoPurchaseitem() {

        clickElement(By.linkText("Books"));
        //click on 'Add to cart' for product 1
        clickElement(By.xpath("//div[@data-productid=\"37\"]/div[2]/div[3]/div[2]//input[@value=\"Add to cart\"]"));
        //click on 'cancel' button of confirmation message
        clickElement(By.xpath("//span[@class='close']"));
        clickElement(By.linkText("Shopping cart"));
        clickElement(By.id("termsofservice"));
        clickElement(By.name("checkout"));
    }
}