package com.jrabidea.automation.BaseObjects;


 // Author Josh Rabideaux on 10/26/15.

import org.openqa.selenium.WebDriver;

public class BasePageObject {

    protected WebDriver driver;

    // Sets the Base Url for the site the tests are being run for.
    public String setBaseURL(String url){

        return url;
    }

    // Checks to see if the user is on the correct url
    public BasePageObject(WebDriver driver){
        this.driver = driver;
    }
}
