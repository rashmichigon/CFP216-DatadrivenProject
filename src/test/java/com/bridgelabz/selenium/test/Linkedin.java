package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Baseclass;
import com.bridgelabz.selenium.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Linkedin extends Baseclass {

    LoginPage loginpage;

    @BeforeMethod
    public void setUP()
    {
        init();
         loginpage = new LoginPage(driver);

    }

    @Test
    public void loginToLinkedin() throws InterruptedException
    {
        loginpage.loginToLinkedinApplication();
        Thread.sleep(3000);
        String currentPageTitle = loginpage.validateSuccessfullLogin();
        Assert.assertEquals(currentPageTitle,"(1) LinkedIn");


    }

    @Test
    public void tearDown()
    {
        closeBrowser();
    }
}
