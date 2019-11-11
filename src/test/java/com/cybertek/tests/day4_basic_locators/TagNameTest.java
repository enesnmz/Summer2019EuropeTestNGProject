package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {

    //Be careful when you are using tagName locator because if there is more than one tag name sharing the same name with
    //the one that you are looking for(such as input).Thats why you have to check before U use it.

    public static void main(String[] args) {
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to URL
        driver.get("https://practice.cybertekschool.com/sign_up");

        //If there is no attribute such as:"id","name" in source code you can use tagName to locate the elements
        WebElement fullName=driver.findElement(By.tagName("input"));
        fullName.sendKeys("mikeShmidith");

        //Because selenium reads source code top to bottom.It will stop first time it sees the first tagName which is "input"
        //thats why it does not reads the second tag.So we use attribute name instead of tagName
        WebElement emailInput =driver.findElement(By.name("email"));
        emailInput.sendKeys("mike@gmail.com");

        WebElement signUpButton=driver.findElement(By.tagName("button"));
        signUpButton.click();

        WebElement Message=driver.findElement(By.tagName("h3"));
        String actualMessage=Message.getText();

        //another way of writing line 28 and 29.Writing them in a single line
        //driver.findElement(By.tagName("h3")).getText();

        driver.quit();

    }
}
