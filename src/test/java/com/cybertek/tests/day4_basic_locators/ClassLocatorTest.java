package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class ClassLocatorTest {

    //Tag for link in an element is <a

    public static void main(String[] args) {
        //open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        //go to URL
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement homeLink=driver.findElement(By.className("nav-link"));
        homeLink.click();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        //Print multiple buttons
        //Because  tag is h3 and that is just one in the source code you can also use By.tagName("h3"); too
        //WebElement getTitle=driver.findElement(By.tagName("h3"));
        //String actualRes=getTitle.getText();
        //System.out.println("actualRes = " + actualRes);
        //OR

        //proper way
        WebElement multiple=driver.findElement(By.className("h3"));//===>Classname value is h3 do not confuse
        System.out.println(multiple.getText());

        //lazy way
        System.out.println(driver.findElement(By.className("h3")).getText());

        //NOTE!!!! ===> if there is a space in the class attribute value,we CANNOT use it.
        driver.quit();


    }
}
