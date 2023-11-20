package com.zom.qa.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TestBase {

    public static WebDriver driver;
    public static Properties prop;


    public TestBase() throws IOException {

        prop = new Properties();
        FileInputStream ip = new FileInputStream("C://Users//user//IdeaProjects//POM_FRAMEWORK//src//main//java//com//zom//qa//config//config.properties");
        prop.load(ip);



    }

    public static void initialization(){
    String browsername = prop.getProperty("browser");
    if (browsername.equals("chrome")){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    } else if (browsername.equals("firefox")) {
        WebDriverManager.edgedriver().setup();
        driver = new EdgeDriver();
    }

    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.get(prop.getProperty("url"));

    }



    }
