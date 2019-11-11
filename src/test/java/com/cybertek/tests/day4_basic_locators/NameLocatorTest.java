package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {

    public static void main(String[] args) {
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cybertekschool.com/sign_up");

        //enter full name
        WebElement fullNameInput=driver.findElement(By.name("full_name"));
        fullNameInput.sendKeys("Mike Smith");

        //enter email
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("aragorn@tolkien.com");

        //click sign up button
        WebElement signUpButton=driver.findElement(By.name("wooden_spoon"));
        signUpButton.click();

        //Task
        //verify that you got "Thank you for signing up.Click the button below to return to home page"
        //if it is input box use getAttribute();

        //expected message
        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";

        //actual message
        WebElement message=driver.findElement(By.name("signup_message"));
        String actualMessage=message.getText();


        if(expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }

        WebElement homeButton=driver.findElement(By.id("wooden_spoon"));
        homeButton.click();

        driver.quit();
    }
}
