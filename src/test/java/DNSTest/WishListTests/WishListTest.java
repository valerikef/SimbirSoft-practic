package DNSTest.WishListTests;

import DNSTest.ChromeDriverSettings;
import org.junit.Test;

public class WishListTest extends ChromeDriverSettings implements WishListHelp
{
    private final WishListPage wishListPage = new WishListPage(chromeDriver);

    @Test
    public void wishlistOpen()     //Открыть "Избранное"
    {
        wishListPage.openWishList();
        wishListPage.EmptyWishListIsOpenChecking();
    }
    @Test
    public void wishlistToCatalog()     //Проверка кнопки "Перейти в каталог" из "Избранное"
    {
        wishListPage.openWishList();
        wishListPage.clickOnBtnToDirectory();
        wishListPage.DirectoryIsOpenChecking();
    }
    @Test
    public void wishlistAdd()     //Проверка добавления товара в "Избранное"
    {
        wishListPage.AddProductToWishList();
        wishListPage.refreshPage();
        wishListPage.openWishList();
    }
    @Test
    public void wishlistDel()     //Проверка добавления и удаление товара в "Избранное"
    {
        wishlistAdd();
        wishListPage.delay();
        wishListPage.DeleteProductFromWishList();
    }
    @Test
    public void wishlistBuy()     //Проверка добавления товара в "Корзину" из "Избранное"
    {
        wishlistAdd();
        wishListPage.delay();
        wishListPage.WishListBuyBtn();
    }
}