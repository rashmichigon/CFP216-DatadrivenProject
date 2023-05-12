package com.bridgelabz.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    @FindBy(id="session_key")
    WebElement emailID;

    @FindBy(id="session_password")
    WebElement password;

    @FindBy(xpath = "//button[contains(text(),'Sign in')]")
    WebElement signIn;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public void loginToLinkedinApplication() throws InterruptedException {
        emailID.sendKeys("testing@gmail.com");
        Thread.sleep(1000);
        password.sendKeys("testing123");
        Thread.sleep(1000);
        signIn.click();
        Thread.sleep(2000);
    }

    public String validateSuccessfullLogin()
    {
        String title = driver.getTitle();
        return title;
    }
}
