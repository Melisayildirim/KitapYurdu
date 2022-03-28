package com.kitapyurdu.pages;

import com.kitapyurdu.methods.Methods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;

public class ProductPage
{
    Methods methods;
    Logger logger = LogManager.getLogger(ProductPage.class);

    public ProductPage()
    {
        methods = new Methods();
    }

    public void selectProduct()
    {
        methods.sendKeys(By.id("search-input"),"oyuncak");
        methods.click(By.cssSelector(".common-sprite.button-search"));
        //methods.click(By.cssSelector(".pr-img-link"));
        methods.waitBySeconds(2);
        //methods.scrollWithAction(By.id("review-reply-button"));
        //methods.scrollWithAction(By.xpath("//*[.='Küçük Hanımlar / Rana Oyuncak Bebeğiyle Oynuyor']"));
        //methods.scrollWithAction(By.cssSelector("Küçük.Hanımlar./.Rana.Oyuncak.Bebeğiyle.Oynuyor"));
        // 7. ürüne scroll
        //methods.scrollWithAction(By.id("product-565088"));
        methods.scrollWithAction(By.xpath("//div[@class='product-cr'][7]"));
        methods.waitBySeconds(2);
        // favorilerime 4 ürün ekleme
        methods.click(By.xpath("//*[@id='product-596239']//a[@class='add-to-favorites']"));
        methods.click(By.xpath("//*[@id='product-602280']//a[@class='add-to-favorites']"));
        methods.click(By.xpath("//*[@id='product-602282']//a[@class='add-to-favorites']"));
        methods.click(By.xpath("//*[@id='product-602284']//a[@class='add-to-favorites']"));
        methods.waitBySeconds(2);
        //methods.selectByText(By.cssSelector("select#review-sort-selection"),"Oylama (Düşük > Yüksek)");
        // Anasayfaya geri dönme
        methods.click(By.xpath("//div[@class='logo-text']/a"));
        methods.waitBySeconds(2);
        // Puan Kataloğuna gitme
        methods.click(By.xpath("//div[@class='lvl1catalog']//a[@class='common-sprite']"));
        methods.waitBySeconds(2);
        // Türk Klasikleri seçme
        methods.click(By.xpath("//img[@title='Puan Kataloğundaki Türk Klasikleri']"));
        methods.waitBySeconds(2);
        // Filtreleme yapma
        methods.selectByText(By.xpath("//div[@class='sort']/select"),"Yüksek Oylama");
        methods.waitBySeconds(2);
        // Tüm Kitaplar > Hobi
        methods.click(By.xpath("//span[contains(text(),'Tüm Kitaplar')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Hobi')]"));
        methods.waitBySeconds(2);
        // Sayfadan random ürün seçme
        methods.click(By.xpath("//a[@title='Bitki Zekası']"));
        methods.waitBySeconds(3);
        // Sepete ekleme
        methods.click(By.xpath("//a[@id='button-cart']//span[contains(text(),'Sepete Ekle')]"));
        methods.waitBySeconds(3);
        // Listelerim > Favorilerim
        methods.click(By.xpath("//a[contains(text(),'Listelerim')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[contains(text(),'Favorilerim')]"));
        methods.waitBySeconds(2);
        // Favori listesindeki 3. ürünü silme
        methods.click(By.xpath("//div[@class='product-cr'][3]//a[@data-title='Favorilerimden Sil']"));
        methods.waitBySeconds(2);
        // Sepetim
        methods.click(By.xpath("//h4[contains(text(),'Sepetim')]"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@id='js-cart']"));
        methods.waitBySeconds(2);
        methods.findElement(By.cssSelector("[name='quantity']")).clear();
        methods.findElement(By.cssSelector("[name='quantity']")).sendKeys("2");
        methods.waitBySeconds(2);
        methods.click(By.xpath("//i[@class='fa fa-refresh green-icon']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//div[@class='right']//a[@class='button red']"));
        methods.waitBySeconds(2);
        methods.click(By.xpath("//a[@href='#tab-shipping-new-adress']"));
        methods.sendKeys(By.id("address-firstname-companyname"),"Melisa");
        methods.waitBySeconds(2);
        methods.sendKeys(By.id("address-lastname-title"),"Yıldırım");
        methods.selectByText(By.id("address-zone-id"),"İstanbul");
        methods.waitBySeconds(2);
        methods.selectByText(By.id("address-county-id"),"AVCILAR");
        methods.sendKeys(By.id("district"),"Topselvi mah.");
        methods.sendKeys(By.id("address-address-text"),"Topselvi mah. Cumhuriyet cad. 3/3");
        methods.sendKeys(By.id("address-postcode"),"34010");
        methods.sendKeys(By.id("address-telephone"),"5423457659");
        methods.sendKeys(By.id("address-mobile-telephone"),"5073562798");
        methods.sendKeys(By.id("address-tax-id"),"11558691770");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(2);
        methods.sendKeys(By.xpath("//*[@id='credit-card-owner']"),"Melisa Yıldırım");
        methods.sendKeys(By.id("credit_card_number_1"),"1111");
        methods.sendKeys(By.id("credit_card_number_2"),"2222");
        methods.sendKeys(By.id("credit_card_number_3"),"3333");
        methods.sendKeys(By.id("credit_card_number_4"),"4444");
        methods.selectByText(By.id("credit-card-expire-date-month"),"01");
        methods.selectByText(By.id("credit-card-expire-date-year"),"2027");
        methods.sendKeys(By.id("credit-card-security-code"),"123");
        methods.waitBySeconds(2);
        methods.click(By.id("button-checkout-continue"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//*[@id='logo']/a"));
        methods.waitBySeconds(3);
        methods.scrollWithAction(By.xpath("//a[@class='common-sprite']//b"));
        methods.waitBySeconds(3);
        methods.click(By.xpath("//a[@href='https://www.kitapyurdu.com/index.php?route=account/logout']"));
        methods.waitBySeconds(3);
    }

}
