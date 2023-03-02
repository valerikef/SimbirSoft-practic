package ru.dnsShop;

import java.util.concurrent.TimeUnit;

public interface List
{
    public default void sleep()
    {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    //Открытие каталога в меню
    String catalog = "catalog-menu__root-item";

    //Выбор первой дополнительной категории
    String subcategory__item = "subcategory__item";

    //Выбор из каталога первый продукт
    String catalog_product = "catalog-product__name";

    //Выбор чек-бокса
    String ui_checkbox = "ui-checkbox";

    //Выбор первого элемента из листа
    String breadcrumb = "breadcrumb-list__item";

    //Выбор младшей субкатегории
    String subcategory__childs = "subcategory__childs-item";

    //Выбор дополнительного параметра к поиску
    String receipts__item = "receipts__item";

    //Добавление в сравнение
    String compare_checkbox = "compare-checkbox";

    //Открытие сравнения
    String compare = "compare-link-counter";

    //Закрытие всплавающего окна об огранечении времени сохранения без авторизации
    String base_modal = "base-modal__header-close-icon";

    //Очистить поле
    String clear_app = "clear-app";
}
