package org.example;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerButton = By.className("ico-register");
    private By _loginButton=By.className("ico-login");
    By _appleMacBookPro13Inch = By.linkText("Apple MacBook Pro 13-inch");



    public void clickOnRegisterButton() {
        //click on register button on homepage
        clickOnElement(_registerButton);
    }
    public void clickOnLoginButton(){
        //click on login button on homepage
        clickOnElement(_loginButton);
    }
    public void clickOnAppleMacBookPro13InchName(){
        //click on applemacbook product
        clickOnElement( _appleMacBookPro13Inch);
    }


}
