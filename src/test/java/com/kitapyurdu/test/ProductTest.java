package com.kitapyurdu.test;

import com.kitapyurdu.driver.BaseTest;
import com.kitapyurdu.pages.LoginPage;
import com.kitapyurdu.pages.ProductPage;
import org.junit.Test;

public class ProductTest extends BaseTest
{
    @Test
    public void productTest() {
        LoginPage loginPage = new LoginPage();
        ProductPage productPage = new ProductPage();

        loginPage.login();
        productPage.selectProduct();
    }

}
