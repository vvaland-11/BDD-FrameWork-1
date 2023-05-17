package org.example;

import org.openqa.selenium.By;

public class EmailAFriendPage extends Utils {
    // Enter friend's email
    By _friendEmail = By.className("friend-email");
    // Type message
    By _writeMessage = By.id("PersonalMessage");
    // Click on send email button
    By _sendEmail = By.name("send-email");
    LoadProp loadProp = new LoadProp();


    public void userEnterEmailDetails() {
        //Enter Friend Email
        typeText(_friendEmail, loadProp.getProperty("friendEmail"));
        // please input message
        typeText(_writeMessage, loadProp.getProperty("writeMessage"));
        // Click on Send email button
        clickOnElement(_sendEmail);
    }
}
