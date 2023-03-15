package ru.dnsShop.authorizationTesting;

public interface cssLocatorsList {
    String loginButtonLocator = ".form-entry-with-password__main-button";
    String loginFieldLocator = ".form-entry-with-password__input";
    String passwordFieldLocator = ".form-entry-with-password__password";
    String getIdLoginFieldLocator = ".form-entry-with-password__input .base-ui-input-row__label";
    String getIdPasswordFieldLocator = ".form-entry-with-password__password .base-ui-input-row__label";
    String popupWindowButtonLocator = ".user-profile__login";
    String loginButtonInPopupWindow = ".user-profile__guest .base-ui-button_JKH";
    String loginButtonWithPasswordInPopupWindow = ".base-button-container.base-button-container_blue";

    String usernameLocator = ".input-row__input_valid[type = 'email']";
}
