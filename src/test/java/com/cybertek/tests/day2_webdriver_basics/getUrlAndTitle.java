package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getUrlAndTitle {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://practice.cybertekschool.com");

        String title=driver.getTitle();

        //getTitle();==>get you to title of the page
        //soutv
        System.out.println("title = " + title);

        //gets the current url of the page
        String currentUrl =driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        String pagesource=driver.getPageSource();

        System.out.println("pagesource = " + pagesource);

    }
}
