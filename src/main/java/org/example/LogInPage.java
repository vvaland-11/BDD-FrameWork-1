package org.example;
import org.openqa.selenium.By;

import static org.example.Utils.clickOnElement;
import static org.example.Utils.typeText;

public class LogInPage {
    //Click on email button on homepage
    By _email = By.id("Email");
    //Click on password button
    By _password = By.id("Password");
    //Click on login button
    By _login = By.xpath("//button[contains(@class,\"button-1 login-button\")]");
    LoadProp loadProp = new LoadProp();



    public void enterLoginAndPassword(){
        // Enter your email address
        typeText(_email, loadProp.getProperty("emailWithoutTimestamp"));
        // Enter Password
        typeText(_password, loadProp.getProperty("password"));
        // Click Log in button
        clickOnElement(_login);
    }
}
