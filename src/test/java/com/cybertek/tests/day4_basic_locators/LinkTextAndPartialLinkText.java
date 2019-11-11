package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkTextAndPartialLinkText {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigate to
        driver.get("https://practice.cybertekschool.com/dynamic_loading");

       /* WebElement link3=driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
        link3.click();*/

        //lazy way of clicking home
        // driver.findElement(By.linkText("Home")).click();

        //partial link write unique part of the link and it will click.If there is multiple matches it will click the first one
         WebElement link6=driver.findElement(By.partialLinkText("Example 6"));
         //WebElement link6=driver.findElement(By.partialLinkText("6")); //if there is no 6 on the page
        // it means it is unique to the page
         link6.click();
    }
}
