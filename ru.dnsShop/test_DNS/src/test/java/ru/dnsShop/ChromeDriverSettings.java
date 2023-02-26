package ru.dnsShop;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;

import java.util.concurrent.TimeUnit;

public class ChromeDriverSettings
{
    public ChromeDriver chromeDriver;

    //Настройка подключения к ChromeDriver. Начало тестов
    @Before
    public void connectingDriver()
    {
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://www.dns-shop.ru/");
        chromeDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //Закрытие браузера. Окончание тестов
    @After
    public void quitBrowser()
    {
        chromeDriver.quit();
    }
}
