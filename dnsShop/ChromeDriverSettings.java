package ru.dnsShop;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverSettings
{
    public ChromeDriver chromeDriver;

    //Настройка подключения к ChromeDriver. Начало тестов
    @Before
    public void connectingDriver()
    {
        chromeDriver = new ChromeDriver();
        //Открытие сайта DNS по адрессу
        chromeDriver.get("https://www.dns-shop.ru/");
            }
    @After
    public void quitBrowser()
    {
        //chromeDriver.quit();
    }
}
