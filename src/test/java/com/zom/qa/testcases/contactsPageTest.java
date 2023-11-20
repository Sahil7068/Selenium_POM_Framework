package com.zom.qa.testcases;

import com.zom.qa.base.TestBase;
import com.zom.qa.pages.contactsPage;
import com.zom.qa.pages.homepage;
import com.zom.qa.pages.loginPage;
import com.zom.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class contactsPageTest extends TestBase {

    loginPage loginpage;
    homepage homePage;
    TestUtil testutil;
    contactsPage contactspage;

    public contactsPageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();

        testutil = new TestUtil();
        loginpage = new loginPage();
        contactspage = new contactsPage();
        homePage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
        testutil.switchFrame();
        contactspage = homePage.clickcontact();
    }

    @Test(priority = 1)
    public void verifyContactsLabel(){
        Assert.assertTrue(contactspage.verifyContacts(), "contacts lavel is missing");
    }

    @Test(priority = 2)
    public void selectcheckbox(){
        contactspage.checkbox("jfghfh");
    }







    @Test(priority = 3)
    public void validateCreateNewContact(){
        homePage.newContacts();
        contactspage.createNewCon();
    }





    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
