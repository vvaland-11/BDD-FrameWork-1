package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

import static org.example.Utils.getTextFromElement;

public class EmailAFriendResult {
    // Write xpath
    By _userGetMessage = By.xpath("//div[@class=\"result\"]");
    LoadProp loadProp = new LoadProp();

    public void userSendAEmailToFriendResult () {
        // Get result message
        Assert.assertEquals(getTextFromElement(_userGetMessage),loadProp.getProperty("expectedEmailMessageResult"));
    }
}
