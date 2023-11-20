package com.zom.qa.testcases;

import com.zom.qa.base.TestBase;
import com.zom.qa.pages.loginPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginTest extends TestBase {
    loginPage loginpage;
    public LoginTest() throws IOException {
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {
        initialization();

        loginpage = new loginPage();
    }

    @Test(priority = 1)
    public void loginPageTitle(){
        String title = loginpage.validateLogin();
        System.out.println(title);
    }

    @Test(priority = 2)
    public void loginTest() throws InterruptedException, IOException {
        loginpage.login(prop.getProperty("email"), prop.getProperty("password"));
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
