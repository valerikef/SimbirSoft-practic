package ru.dnsShop.authorizationTesting;

import org.openqa.selenium.By;

public interface List {
    By loginButtonLocator = By.cssSelector(".form-entry-with-password__main-button");
    By loginFieldLocator = By.cssSelector(".form-entry-with-password__input");
    By passwordFieldLocator = By.cssSelector(".form-entry-with-password__password");
    By getIdLoginFieldLocator = By.cssSelector(".form-entry-with-password__input .base-ui-input-row__label");
    By getIdPasswordFieldLocator = By.cssSelector(".form-entry-with-password__password .base-ui-input-row__label");
    By popupWindowButtonLocator = By.cssSelector(".user-profile__login");
    By loginButtonInPopupWindow = By.cssSelector(".user-profile__guest .base-ui-button_JKH");
    By loginButtonWithPasswordInPopupWindow = By.cssSelector(".base-button-container.base-button-container_blue");
}
