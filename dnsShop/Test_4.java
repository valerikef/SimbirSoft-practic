package ru.dnsShop;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Test_4 extends ChromeDriverSettings implements List
{
    //Добавление товара в сравнение и открытие сравнения
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
        //Открытие сравнения
        chromeDriver.findElement(By.className(compare)).click();
    }
}
