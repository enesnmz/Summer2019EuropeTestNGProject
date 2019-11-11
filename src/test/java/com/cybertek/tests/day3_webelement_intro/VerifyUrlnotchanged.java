package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyUrlnotchanged {
    /**
     *
     Verify URL not changed
     open browser
     go to:http://practice.cybertekschool.com/forgot_passwordgo
     click on Retrieve password
     verify that url did not change

     */

    public static void main(String[] args) {

        //open chrome

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to:http://practice.cybertekschool.com/forgot_password

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //Save url to string variable
        String expectedUrl=driver.getCurrentUrl();

        //click on Retrieve password(New dataType which is WebElement
        //retrievePassword button is a WebElement which has the id of "form_submit" so I can do some action with it
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        //click();==>Clicking web element
        retrievePasswordButton.click();

        //Save url after clicking button
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        //close the browser
        driver.quit();

    }
}
