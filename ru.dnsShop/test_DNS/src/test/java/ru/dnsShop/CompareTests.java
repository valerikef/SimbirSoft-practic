package ru.dnsShop;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CompareTests extends ChromeDriverSettings implements List
{
  private void compareSet()     //Показываем куда нужно кликать
  {
      chromeDriver.findElement(By.className(compareLink)).click();
  }
  @Test     //Открытие "Сравнение"
    public void compareOpen()
  {
      compareSet();
      WebElement emptyCompare = chromeDriver.findElement(By.className(emptyCompareLink));
      emptyCompare.equals(emptyListCompare);
  }
  @Test     //Проверка кнопки "На главную"
  public void backToMain()
  {
      compareSet();
      chromeDriver.findElement(By.xpath(compareToMainPage)).click();
  }
  @Test     //Проверка кнопки "В каталог"
  public void toCatalog()
  {
      compareSet();
      chromeDriver.findElement(By.xpath(compareToCatalogPage)).click();
      WebElement catalog = chromeDriver.findElement(By.className(catalogLink));
      catalog.equals(catalogItems);
  }
}