package org.example;

import org.openqa.selenium.By;

public class RegisterPage extends Utils {

    LoadProp loadProp=new LoadProp();
    By _firstname = By.id("FirstName");
    By _Lastname = By.id("LastName");
    By _DayOfBirth = By.name("DateOfBirthDay");
    By _MonthOfBirth = By.name("DateOfBirthMonth");
    By _YearOfBirth = By.name("DateOfBirthYear");
    By _Email = By.name("Email");
    By _Password = By.id("Password");
    By _reenterPassword = By.id("ConfirmPassword");
    By _RegisterButton = (By.id("register-button"));

    public void enterRegistrationDetailsWithTimestamp() {
        typeText(_firstname, loadProp.getProperty("firstname"));
        //type LastName
        typeText(_Lastname, loadProp.getProperty("lastname"));
        //enter date of birth
        selectOptionByValue(_DayOfBirth,loadProp.getProperty("birthDate") );
        selectOptionByIndex(_MonthOfBirth,Integer.parseInt(loadProp.getProperty("birthMonth")));
        selectOptionByText(_YearOfBirth,loadProp.getProperty("birthYear"));
        //type email id
        typeText(_Email, loadProp.getProperty("Email")+ timestamp()+ loadProp.getProperty("EmailDomain"));
        //type password
        typeText(_Password, loadProp.getProperty("Password"));
        //re-enter password
        typeText(_reenterPassword, loadProp.getProperty("reenterPassword"));
        clickOnElement(_RegisterButton);


    }
    public void enterRegistrationDetailsWithoutTimestamp () {
        typeText(_firstname, "FirstNameTest");
        //type LastName
        typeText(_Lastname, "LastNameTest");
        //enter date of birth
        selectOptionByValue(_DayOfBirth,loadProp.getProperty("birthDate") );
        selectOptionByIndex(_MonthOfBirth,Integer.parseInt(loadProp.getProperty("birthMonth")));
        selectOptionByText(_YearOfBirth,loadProp.getProperty("birthYear"));
        //type email id
        typeText(_Email, loadProp.getProperty("emailWithoutTimestamp"));
        //type password
        typeText(_Password, loadProp.getProperty("Password"));
        //re-enter password
        typeText(_reenterPassword,loadProp.getProperty("reenterPassword"));
        clickOnElement(_RegisterButton);
    }




    }
