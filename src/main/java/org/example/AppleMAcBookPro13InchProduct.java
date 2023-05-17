package org.example;
import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;

public class AppleMAcBookPro13InchProduct {
    //locator of email a friend
    By _emailAFriend = By.className("email-a-friend");



    public void emailAFriend() {
        // click on email a friend button
        clickOnElement(_emailAFriend);
    }
}
