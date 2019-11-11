package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyConfirmationMessage {

    /**
     *Test Case 3:(Verify confirmation message)
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * enter any email
     * verify that email is displayed in the input box
     * click on Retrieve password
     * verify that confirmation message says 'Your e-mail's been sent!'
     *
     */


    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        //enter any email
        WebElement emailInputbox=driver.findElement(By.name("email"));

        String expectedEmail="test@gmail.com";
        //send some email
        emailInputbox.sendKeys(expectedEmail);

        //verify that email is displayed in the input box
        //getting text from webelements (if you wanna get a text from web element for instance,"your message sent")
        //getText()-->get text from web element =====>If you get empty actual result use getAttribute method
        //getAttribute("value")->get value of attributes     **Input box keeping the e-mail you sent""
        String actualEmail=emailInputbox.getAttribute("value");

        if(expectedEmail.equals(actualEmail)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }

        //locating retrievePasswordButton using id attribute
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));

        //clicking webElement
        retrievePasswordButton.click();

        //verify that confirmation message says 'Your e-mail's been sent!'
        String expectedMessage="Your e-mail's been sent!";

        WebElement messageElement=driver.findElement(By.name("confirmation_message"));
        String actualMessage=messageElement.getText();
        System.out.println("actualMessage = " + actualMessage);

        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        driver.quit();
    }
}
