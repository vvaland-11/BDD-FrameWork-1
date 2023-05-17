package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class RegistrationResult extends Utils{
    By _getMessage = By.xpath("//div [@ class= \"result\"]");
    LoadProp loadProp = new LoadProp();


    public void RegistrationCompletionMessage(){

        Assert.assertEquals(getTextFromElement(_getMessage),loadProp.getProperty("expectedRegistrationCompletionMessage"));
    }

}
