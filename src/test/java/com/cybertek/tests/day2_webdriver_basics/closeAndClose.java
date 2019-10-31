package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeAndClose {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.get("https://practice.cybertekschool.com");

        Thread.sleep(3000);

        //driver.close();==>closes the current tab

        driver.close();

        driver=new ChromeDriver();
       driver.get("https://practice.cybertekschool.com/open_new_tab");
       Thread.sleep(3000);

       //the difference btw driver.close() and driver.quit() is close only closes the page that is processed in selenium
       //but driver.quit() shuts down whole browser(chrome in this case)//driver.quit();
      // driver.close();
    }
}
