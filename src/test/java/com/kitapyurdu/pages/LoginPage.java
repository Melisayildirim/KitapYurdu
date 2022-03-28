package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.logging.LogManager;

public class LoginPage
{
    Methods methods;

    public LoginPage()
    {
        methods = new Methods();
    }

    public void login()
    {
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".menu-top-button.login>a"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-email"),"melisa.yildirim@testinium.com");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("login-password"),"melisa123");
        methods.waitBySeconds(2);
        methods.click(By.cssSelector(".ky-btn.ky-btn-orange.w-100.ky-login-btn"));
        methods.waitBySeconds(2);
        Assert.assertTrue(methods.isElementVisible(By.cssSelector(".attention")));
        methods.waitBySeconds(2);
    }
}
