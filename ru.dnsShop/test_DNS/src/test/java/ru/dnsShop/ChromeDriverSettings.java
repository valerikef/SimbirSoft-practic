package ru.dnsShop;

import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.After;
import org.junit.Before;

public class ChromeDriverSettings
{
    public ChromeDriver chromeDriver;

    //Настройка подключения к ChromeDriver. Начало тестов
    @Before
    public void connectingDriver()
    {
        chromeDriver = new ChromeDriver();
    }

    //Закрытие браузера. Окончание тестов
    @After
    public void quitBrowser()
    {
        chromeDriver.quit();
    }
}
