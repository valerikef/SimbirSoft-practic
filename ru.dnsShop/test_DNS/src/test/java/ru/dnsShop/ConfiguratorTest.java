package ru.dnsShop;

import java.util.concurrent.TimeUnit;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;


public class ConfiguratorTest  extends ChromeDriverSettings {
    private void sleep()
    {
        try { TimeUnit.SECONDS.sleep(5); }
        catch (InterruptedException e) { throw new RuntimeException(e); }
    }
    @Test
    public void To_PC_Catalog() {
        chromeDriver.findElement(By.linkText("Комплектующие для ПК")).click();
    }
    @Test
    public void From_PC_Catalog_to_Configurator() {
        chromeDriver.findElement(By.linkText("Комплектующие для ПК")).click();
        chromeDriver.findElement(By.linkText("Собрать")).click();
        sleep();
    }
    @Test
    public void ConfiguratorFill() {
        chromeDriver.findElement(By.linkText("Комплектующие для ПК")).click();
        chromeDriver.findElement(By.linkText("Собрать")).click();
        sleep();
        chromeDriver.findElement(RelativeLocator.with(By.tagName("button")).
                toRightOf(By.tagName("span"))).click();
        sleep();
        chromeDriver.findElement(By.className("rsu-add-item-button")).click();
        sleep();

    }


}
