package com.zom.qa.pages;

import com.zom.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class homepage extends TestBase {

     @FindBy(xpath = "//td[contains(text(), 'User: sahil raza')]")
    WebElement sahil;

    @FindBy(xpath = "//a[contains(text(), 'Contacts')]")
    WebElement contacts;

    @FindBy(xpath = "//a[text()='Deals']")
    WebElement deals;

    @FindBy(xpath = "//a[contains(text(),'New Contact')]")
    WebElement newcon;





    public homepage() throws IOException {
        super();

        PageFactory.initElements(driver, this);

    }

    public String verifyPage(){
        return driver.getTitle();
    }

    public contactsPage clickcontact() throws IOException {

        contacts.click();

        return new contactsPage();
    }

    public dealsPage clickdeal() throws IOException {
        deals.click();

        return new dealsPage();
    }

    public void newContacts(){
        Actions action = new Actions(driver);
        action.moveToElement(contacts).build().perform();
        newcon.click();
    }

}
