package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage implements List{

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
        chromeDriver.findElement(loginButtonLocator).click();
    }

    public LoginPage openPopupWindow(){
        chromeDriver.findElement(popupWindowButtonLocator).click();
        chromeDriver.findElement(loginButtonInPopupWindow).click();
        chromeDriver.findElement(loginButtonWithPasswordInPopupWindow).click();

        return this;
    }

    private By getUsernameLocator() {
        chromeDriver.findElement(loginFieldLocator).click();
        return By.id(chromeDriver.findElement(getIdLoginFieldLocator).getAttribute("for"));
    }

    private By getPasswordLocator() {
        chromeDriver.findElement(passwordFieldLocator).click();
        return By.id(chromeDriver.findElement(getIdPasswordFieldLocator).getAttribute("for"));
    }
}