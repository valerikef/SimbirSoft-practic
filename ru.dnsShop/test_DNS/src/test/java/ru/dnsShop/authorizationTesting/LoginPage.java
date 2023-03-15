package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage implements cssLocatorsList{

    private final WebDriver chromeDriver;

    public LoginPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    public LoginPage inputUsername(String username) {
        chromeDriver.findElement(getUsernameLocator()).sendKeys(username);
        return this;
    }

    public LoginPage inputPassword(String password) {
        chromeDriver.findElement(getPasswordLocator()).sendKeys(password);
        return this;
    }

    public void clickSignInButton() {
        chromeDriver.findElement(By.cssSelector(loginButtonLocator)).click();
    }

    public LoginPage openPopupWindow(){
        chromeDriver.findElement(By.cssSelector(popupWindowButtonLocator)).click();
        chromeDriver.findElement(By.cssSelector(loginButtonInPopupWindow)).click();
        chromeDriver.findElement(By.cssSelector(loginButtonWithPasswordInPopupWindow)).click();

        return this;
    }

    private By getUsernameLocator() {
        chromeDriver.findElement(By.cssSelector(loginFieldLocator)).click();
        return By.id(chromeDriver.findElement(By.cssSelector(getIdLoginFieldLocator)).getAttribute("for"));
    }

    private By getPasswordLocator() {
        chromeDriver.findElement(By.cssSelector(passwordFieldLocator)).click();
        return By.id(chromeDriver.findElement(By.cssSelector(getIdPasswordFieldLocator)).getAttribute("for"));
    }
}