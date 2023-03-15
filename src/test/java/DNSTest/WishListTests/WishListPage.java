package DNSTest.WishListTests;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class WishListPage implements WishListHelp
{
    private final WebDriver chromeDriver;
    private WebElement element;
    public WishListPage(WebDriver chrDriver) {
        this.chromeDriver = chrDriver;
    }
    public void delay()        //Задержка перед действием
    {
        try { TimeUnit.SECONDS.sleep(1); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
    public void refreshPage() { chromeDriver.navigate().refresh(); }
    public void openWishList() {
        chromeDriver.findElement(By.className(wishListLink)).click();
    }
    public void EmptyWishListIsOpenChecking() {
        Assert.assertEquals(chromeDriver.findElement(By.className(wishListTextClass)).getText(), emptyWishListText);
    }
    public void clickOnBtnToDirectory() {
        chromeDriver.findElement(By.xpath(WishToDirectory)).click();
    }
    public void DirectoryIsOpenChecking() {
        Assert.assertEquals(chromeDriver.findElement(By.className(directoryClassCheck)).getText(), directoryCheck);
    }
    public void AddProductToWishList() {
        chromeDriver.findElement(By.className(catalog)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        chromeDriver.findElement(By.className(subcategory_item)).click();
        delay();
        chromeDriver.findElement(By.className(wish_btn)).click();
    }
    public void DeleteProductFromWishList() { chromeDriver.findElement(By.className(wish_btn)).click(); }
    public void WishListBuyBtn() { chromeDriver.findElement(By.className(wish_buy)).click(); }
}
