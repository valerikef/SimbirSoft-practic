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
    public void FirstloginTest() {
        //получение доступа к методам класса LoginPage и ProfilePage для взаимодействия с элементами страницы
        loginPage = new LoginPage(chromeDriver);
        profilePage = new ProfilePage(chromeDriver);
        //открываем всплывающее окно для ввода логина и пароля
        loginPage.openPopupWindow();
        //вводим логин
        loginPage.setUsername(USERNAME);
        //вводим пароль
        loginPage.setPassword(PASSWORD);
        //нажимаем кнопку входа
        loginPage.clickSignInButton();
        //получаем отображаемый логин
        String usernameInProfile = profilePage.getUserName();
        //сравниваем его с логином из файла настроек
        Assert.assertEquals(toUpperCase(USERNAME), toUpperCase(usernameInProfile));
    }
}