package com.zom.qa.util;

import com.zom.qa.base.TestBase;

import java.io.IOException;

public class TestUtil extends TestBase {

    public TestUtil() throws IOException {
        super();
    }

    public void switchFrame(){
        driver.switchTo().frame("mainpanel");
    }
}
