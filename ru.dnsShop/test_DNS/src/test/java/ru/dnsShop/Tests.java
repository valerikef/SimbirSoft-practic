package ru.dnsShop;

import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tests extends ChromeDriverSettings
{
    //Тест 1
    //Проверка названия сайта
    @Test
    public void titleTest()
    {
        //Открытие сайте
        chromeDriver.get("https://www.dns-shop.ru/");

        //Проверка названия
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("DNS – интернет магазин цифровой и бытовой техники по доступным ценам."));
    }

    //Тест 2
    //Проверка открытия списка желаний
    @Test
    public void wishlistTest()
    {
        //Открытие сайта
        chromeDriver.get("https://www.dns-shop.ru/");

        //Поиск элемента "Избранное"
        chromeDriver.findElement(By.className("wishlist-link-counter")).click();

        //Сравнение
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Избранное - DNS – интернет магазин цифровой и бытовой техники по доступным ценам."));
    }

    //Тест 3
    //Проверка открытия списка сравнений
    @Test
    public void compareTest()
    {
        //Открытие сайте
        chromeDriver.get("https://www.dns-shop.ru/");

        //Поиск элемента
        chromeDriver.findElement(By.className("compare-link-counter")).click();

        //Сравнение
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("Сравнение товаров в интернет магазине DNS"));
    }

    //Тест 4
    //Проверка открытия корзины
    @Test
    public void cartTest()
    {
        //Открытие сайте
        chromeDriver.get("https://www.dns-shop.ru/");

        //Поиск элемента
        chromeDriver.findElement(By.className("cart-button")).click();

        //Сравнение
        String title = chromeDriver.getTitle();
        Assert.assertTrue(title.equals("DNS – интернет магазин цифровой и бытовой техники по доступным ценам."));
    }

    //Тест 5
    //Авторизация
    @Test
    public void authorizationTest()
    {
        //Открытие сайте
        chromeDriver.get("https://www.dns-shop.ru/");

        //Поиск элемента
        chromeDriver.findElement(By.className("user-profile__login")).click();

        //chromeDriver.findElement(By.className("base-ui-button-v2_medium base-ui-button-v2_brand base-ui-button-v2_ico-none base-ui-button-v2")).click();
    }
}