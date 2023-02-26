package ru.dnsShop;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class CardTest extends ChromeDriverSettings implements List
{
    private void sleep()        //Задержка перед действием
    {
        try { TimeUnit.SECONDS.sleep(1); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
    private void Checking()
    {
        String emptyCard = chromeDriver.findElement(By.className(emptyCart)).getText();
        Assert.assertEquals(emptyCard, emptyCartCheck);
    }
    private void cartSet()     //Показываем куда нужно кликать
    {
        chromeDriver.findElement(By.className(cartLink)).click();
    }
    @Test
    public void cardOpen()     //Открыть "Корзину"
    {
        cartSet();
        Checking();
    }
    @Test
    public void CartToCatalog()     //Проверка кнопки "В каталог"
    {
        cartSet();
        chromeDriver.findElement(By.xpath(CartToCat)).click();
        String CatalCheck = chromeDriver.findElement(By.className(CatalogClassCheck)).getText();
        Assert.assertEquals(CatalCheck, CatalogCheck);
    }
    @Test
    public void CartToMain()     //Проверка кнопки "На главную"
    {
        cartSet();
        chromeDriver.findElement(By.className(CartToMain)).click();
        String MainCheck = chromeDriver.getTitle();
        Assert.assertEquals(MainCheck, MainPageCheck);
    }
    @Test
    public void cartAdd()     //Проверка добавления товара в "Корзину"
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(CartBtn)).click();
        sleep();
        cartSet();
        Checking();
    }
    @Test
    public void cartDel()     //Проверка добавления и удаление товара в "Корзину"
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(CartBtn)).click();
        sleep();
        cartSet();
        chromeDriver.findElement(By.className(CartRemove)).click();
        Checking();
    }
    @Test
    public void cartBuy()     //Проверка перехода к оформлению заказа
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(CartBtn)).click();
        sleep();
        cartSet();
        chromeDriver.findElement(By.className(CartMake)).click();
        sleep();
        String OrderCheck = chromeDriver.getTitle();
        Assert.assertEquals(OrderCheck, OrderTitleCheck);
    }
}
