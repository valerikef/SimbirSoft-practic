import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class WishListTest extends ChromeDriverSettings implements List
{
    private void sleep()        //Задержка перед действием
    {
        try { TimeUnit.SECONDS.sleep(1); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
    private void wishlistSet()     //Показываем куда нужно кликать
    {
        chromeDriver.findElement(By.className(wishListLink)).click();
    }
    @Test
    public void wishlistOpen()     //Открыть "Избранное"
    {
        wishlistSet();
        WebElement emptyWish = chromeDriver.findElement(By.className(emptyWishList));
        emptyWish.equals(emptyWishCheck);
    }
    @Test
    public void wishlistInCatalog()     //Проверка кнопкпппппи "Перейти в каталог"
    {
        wishlistSet();
        chromeDriver.findElement(By.xpath(WishToCatalog)).click();
        WebElement Catalog = chromeDriver.findElement(By.className(CatalogClassCheck));
        Catalog.equals(CatalogCheck);
    }
    @Test
    public void wishlistAdd()     //Проверка добавления товара в "Избранное"
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(wish_btn)).click();
        chromeDriver.findElement(By.className(wishListLink)).click();
    }
    @Test
    public void wishlistDel()     //Проверка добавления и удаление товара в "Избранное"
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(wish_btn)).click();
        chromeDriver.findElement(By.className(wishListLink)).click();
        sleep();
        chromeDriver.findElement(By.className(wish_btn)).click();
    }
    @Test
    public void wishlistBuy()     //Проверка добавления товара в "Корзину" из "Избранное"
    {
        sleep();
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        sleep();
        chromeDriver.findElement(By.className(wish_btn)).click();
        chromeDriver.findElement(By.className(wishListLink)).click();
        sleep();
        chromeDriver.findElement(By.className(wish_buy)).click();
    }
}