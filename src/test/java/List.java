import org.openqa.selenium.By;

public interface List
{
        String fillListCompare = "Сравнение товаров";
        String catalogItems = "Каталог товаров";
        String catalogLink = "subcategory__page-title";
        String emptyListCompare = "Список сравнения пуст";
        String compareLink = "compare-link-counter";
        String emptyCompareLink = "empty-page__content-title";
        String compareToMainPage = "//*[contains(@class, 'base-ui-button base-ui-button_white')]";
        String compareToCatalogPage = "//*[contains(@class, 'base-ui-button base-ui-button_brand')]";

        // Вспомогательные переменные для тестирования WishList
        String wishListLink = "wishlist-link-counter";
        String emptyWishList = "profile-wishlist__empty-text";
        String emptyWishCheck = "В списке пока нет ни одного избранного товара";
        String WishToCatalog = "//*[contains(@class, 'button-ui button-ui_brand profile-wishlist__empty-content-btn')]";
        String CatalogClassCheck = "subcategory__page-title";
        String CatalogCheck = "Каталог товаров";
        String catalog = "catalog-menu__root-item";
        String subcategory_item = "subcategory__item";
        String wish_btn = "wishlist-btn";
        String wish_buy = "buy-btn";

        // Вспомогательные переменные для тестирования Корзины
        String cartLink = "cart-link-counter";
        String emptyCart = "cart-title";
        String emptyCartCheck = "Корзина";
        String CartToCat = "//*[contains(@href, '/catalog/')]";
        String CartToMain = "empty-message-button";
        String CartBtn = "buy-btn";
        String CartRemove = "remove-button__title";
        String CartMake = "buy-button";
        String MainPageCheck = "DNS – интернет магазин цифровой и бытовой техники по доступным ценам.";
        String OrderTitleCheck = "Оформление заказа - DNS – интернет магазин цифровой и бытовой техники по доступным ценам.";
}