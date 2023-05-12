package com.bridgelabz.selenium.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

    public static WebDriver driver;
    public void init()
    {
        driver = new ChromeDriver();
        driver.get("https://in.linkedin.com/");
        driver.manage().window().maximize();
    }

    public void closeBrowser()
    {
        driver.close();
    }
}
