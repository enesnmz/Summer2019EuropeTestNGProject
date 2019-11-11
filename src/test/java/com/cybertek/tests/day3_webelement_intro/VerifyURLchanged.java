package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {
    /**
     * Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */

    public static void main(String[] args) throws InterruptedException {

        Faker faker=new Faker();

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");

        WebElement emailInput =driver.findElement(By.name("email"));//'name' is an unique attribute

        String name=faker.hobbit().character();
        String Name=name.toLowerCase();
        String[]s=Name.split(" ");




        //sendKeys()==>send keyboard actions to webelement/enters given text(I used Faker Class)
        emailInput.sendKeys(s[0]+"@tolkien.com");

        //locate password button
        WebElement retrievePasswordButton=driver.findElement(By.id("form_submit"));
        retrievePasswordButton.click();

        String expectedUrl="http://practice.cybertekschool.com/email_sent";
        String actualUrl=driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");

        }else{
            System.out.println("FAIL");
        }

        Thread.sleep(1000);
        driver.quit();
    }


}
