package com.jrabidea.automation.BaseObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

  // Authored by jrabidea on 10/26/15.

public abstract class BaseTest {

   WebDriver driver;
    protected BasePageObject bsp = new BasePageObject(driver);

    // When using the @DataProvider annotation with the name selenium-firefox, the test method runs in Firefox.
    @DataProvider (name = "selenium-firefox")
    public Object firefoxDriver(){
        return new FirefoxDriver();
    }

    // When using the @DataProvider annotation with the name selenium-chrome, the test method runs in Chrome.
    @DataProvider (name = "selenium-chrome")
    public Object chromeDriver(){
        return new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    public void setupDriver(WebDriver driver, String url){
        this.driver = driver;
        BasePageObject basePageObject = new BasePageObject(driver);
        driver.get(bsp.setBaseURL(url));
    }
}
