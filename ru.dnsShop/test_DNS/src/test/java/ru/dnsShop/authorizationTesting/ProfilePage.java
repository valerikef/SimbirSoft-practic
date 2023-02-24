package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class ProfilePage {
    /**
     * конструктор класса, занимающийся инициализацией полей класса
     */
    private WebDriver chromeDriver;

    private final By usernameLocator = By.cssSelector(".input-row__input_valid[type = 'email']");

    public ProfilePage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public void openProfileDNS(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        chromeDriver.get("https://profile.dns-shop.ru/");
    }

    public String getUserName() {
        openProfileDNS();
        return chromeDriver.findElement(usernameLocator).getAttribute("value");
    }
}