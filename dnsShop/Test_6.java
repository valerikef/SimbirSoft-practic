package ru.dnsShop;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_6 extends ChromeDriverSettings implements List
{
    //Добавление двух разных товаров из одной категории в сравнение
    @Test
    public void Test() {
        //Проверка на сайт DNS
        WebElement element = chromeDriver.findElement(By.id("header-logo"));
        if (element != null) {
            System.out.println("Это сайт DNS");
        }
        //Выбор 1 элемента из каталога
        chromeDriver.findElement(By.className(catalog)).click();
        //Выбор 1 элемента из категорий
        chromeDriver.findElement(By.className(subcategory__item)).click();
        chromeDriver.findElement(By.className(subcategory__item)).click();
        chromeDriver.findElement(By.className(subcategory__item)).click();
        //Выбор 1 товара
        chromeDriver.findElement(By.className(catalog_product)).click();
        sleep();
        //Добавление в сравнение
        chromeDriver.findElement(By.className(ui_checkbox)).click();
        sleep();
        //Закрытие предупреждения
        chromeDriver.findElement(By.className(base_modal)).click();
        //Открытие 1 элемента из пути
        chromeDriver.findElement(By.className(breadcrumb)).click();
        //Выбор младшей субкатегории
        chromeDriver.findElement(By.className(subcategory__childs)).click();
        //Выбор 1 элемента из категорий
        chromeDriver.findElement(By.className(subcategory__item)).click();
        chromeDriver.findElement(By.className(subcategory__item)).click();
        chromeDriver.findElement(By.className(subcategory__item)).click();
        //Выбор дополнительного параметра к поиску
        chromeDriver.findElement(By.className(receipts__item)).click();
        //Выбор 1 товара
        chromeDriver.findElement(By.className(catalog_product)).click();
        sleep();
        //Добавление в сравнение
        chromeDriver.findElement(By.className(compare_checkbox)).click();
        sleep();
        //Открытие сравнения
        chromeDriver.findElement(By.className(compare)).click();
    }
}
