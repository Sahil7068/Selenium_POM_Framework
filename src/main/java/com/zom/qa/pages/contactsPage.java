package com.zom.qa.pages;

import com.zom.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class contactsPage extends TestBase {

    public contactsPage() throws IOException {
        super();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//td[contains(text(), 'Contacts')]")
    WebElement contactslabel;

    @FindBy(xpath = "//a[text()='jfghfh']//..//..//input")
    WebElement checkbox;

    @FindBy(xpath = "//input[@value='Save and Create Another (same company)']//..//input[2]")
    WebElement save;


    public Boolean verifyContacts(){
        return contactslabel.isDisplayed();
    }

    public void checkbox(String name){
        driver.findElement(By.xpath("//a[text()='"+name+"']//..//..//input")).click();
    }

    public void createNewCon(){
        driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("sahil");
        driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Raza");
        save.click();

    }


}
