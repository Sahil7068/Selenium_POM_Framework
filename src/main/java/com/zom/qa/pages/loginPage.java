package com.zom.qa.pages;

import com.zom.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class loginPage extends TestBase {


    //page factory

    @FindBy(name = "username")
    WebElement username;


    @FindBy (name = "password")
    WebElement password;

    @FindBy(xpath = "//input[@value='Login']")
    WebElement signup;


    // Initializing the page objects
    public loginPage() throws IOException {

        PageFactory.initElements(driver, this);


    }

    //Actions
    public String validateLogin(){
        return driver.getTitle();
    }

    public homepage login(String un, String pw) throws InterruptedException, IOException {
        username.sendKeys(un);

        password.sendKeys(pw);
        signup.click();
        return new homepage();







    }



}
