package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    private WebDriver chromeDriver;

    private WebElement sameWebElement;

    public LoginPage(WebDriver chromeDriver){
        this.chromeDriver = chromeDriver;
    }

    private By loginButtonLocator = By.cssSelector(".form-entry-with-password__main-button");



    public void setUsername(String username) {
        chromeDriver.findElement(getUsernameLocator()).sendKeys(username);
    }

    public void setPassword(String password) {
        chromeDriver.findElement(getPasswordLocator()).sendKeys(password);
    }

    public void clickSignInButton() {
        chromeDriver.findElement(loginButtonLocator).click();
    }

    public void openPopupWindow(){
        //определение всплывающего окна
        chromeDriver.findElement(By.cssSelector(".user-profile__login")).click();

        //определение кнопки "Войти" в всплывающем окне
        chromeDriver.findElement(By.cssSelector(".user-profile__wrapper .base-ui-button-v2_brand")).click();

        //определение кнопки "Войти с паролем" в всплывающем окне
        chromeDriver.findElement(By.cssSelector(".base-button-container.base-button-container_blue")).click();
    }

    private By getUsernameLocator() {
        chromeDriver.findElement(By.className("form-entry-with-password__input")).click();

        sameWebElement = chromeDriver.findElements(By.className("base-ui-input-row__label")).get(0);

        return By.id(sameWebElement.getAttribute("for"));
    }

    private By getPasswordLocator() {
        chromeDriver.findElement(By.className("form-entry-with-password__password")).click();

        sameWebElement = chromeDriver.findElements(By.className("base-ui-input-row__label")).get(1);

        return By.id(sameWebElement.getAttribute("for"));
    }
}