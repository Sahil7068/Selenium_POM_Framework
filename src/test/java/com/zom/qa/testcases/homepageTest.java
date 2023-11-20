package com.zom.qa.testcases;

import com.zom.qa.base.TestBase;
import com.zom.qa.pages.contactsPage;
import com.zom.qa.pages.homepage;
import com.zom.qa.pages.loginPage;
import com.zom.qa.util.TestUtil;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class homepageTest extends TestBase {

    loginPage loginpage;
    homepage homePage;
    TestUtil testutil;
    contactsPage contactspage;


    public homepageTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException, InterruptedException {
        initialization();

        testutil = new TestUtil();
        loginpage = new loginPage();
        contactspage = new contactsPage();
        homePage = loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
    }

    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
        String homepageTitle = homePage.verifyPage();
        Assert.assertEquals(homepageTitle, "CRMPRO", "Hompe title not matched");
    }

    @Test(priority = 2)
    public void verifyContactsLink() throws IOException {
        testutil.switchFrame();
        contactspage = homePage.clickcontact();
    }





    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
