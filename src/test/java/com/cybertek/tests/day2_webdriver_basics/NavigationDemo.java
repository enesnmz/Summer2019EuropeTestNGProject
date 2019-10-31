package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException {
        //seting up the driver
        WebDriverManager.chromedriver().setup();


        //Import class alt+enter
        //selenium object
        WebDriver driver = new ChromeDriver();

        //navigate to website
        driver.get("https://www.google.com");

        //another way of navigate
        driver.navigate().to("https://www.facebook.com");

        ////goes back to previous web page
        driver.navigate().back();

       //It waits 1 sec equals to 1000 milsec Thread.sleep(3000);

        //goes back where it was before writing navigate().back() OR :) clicks the forward button on the screen
        driver.navigate().forward();


    }
}
