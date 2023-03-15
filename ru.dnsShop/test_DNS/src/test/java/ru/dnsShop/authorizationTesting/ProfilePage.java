package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import java.util.concurrent.TimeUnit;

public class ProfilePage implements cssLocatorsList{

    private WebDriver chromeDriver;

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
        return chromeDriver.findElement(By.cssSelector(usernameLocator)).getAttribute("value");
    }
}