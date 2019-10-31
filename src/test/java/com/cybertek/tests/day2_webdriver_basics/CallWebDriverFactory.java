package com.cybertek.tests.day2_webdriver_basics;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CallWebDriverFactory {
    public static void main(String[] args) {

        WebDriverManager driver= new WebDriverFactory.getDriver("chrome");

    }
}
