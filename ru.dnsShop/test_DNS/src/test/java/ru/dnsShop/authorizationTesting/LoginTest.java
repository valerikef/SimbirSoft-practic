package ru.dnsShop.authorizationTesting;

import org.junit.Assert;
import org.junit.Test;
import ru.dnsShop.ChromeDriverSettings;

import static com.google.common.base.Ascii.toUpperCase;

public class LoginTest extends ChromeDriverSettings {
    public static LoginPage loginPage;
    public static ProfilePage profilePage;

    private final String USERNAME = "Ibiu1abIBaowken1@yandex.ru";
    private final String PASSWORD = "(&g178QO_)j1-20Q_ZI";

    /**
     * тестовый метод для осуществления аутентификации
     */
    @Test
    public void loginTest() {

        loginPage = new LoginPage(chromeDriver);
        profilePage = new ProfilePage(chromeDriver);

        loginPage.openPopupWindow()
                .inputUsername(USERNAME)
                .inputPassword(PASSWORD)
                .clickSignInButton();

        Assert.assertEquals(toUpperCase(USERNAME), toUpperCase(profilePage.getUserName()));
    }
}