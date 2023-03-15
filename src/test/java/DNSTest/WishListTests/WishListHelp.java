package DNSTest.WishListTests;
public interface WishListHelp
{
        // Вспомогательные переменные для тестирования WishList
        String wishListLink = "wishlist-link-counter";
        String wishListTextClass = "profile-wishlist__empty-text";
        String emptyWishListText = "В списке пока нет ни одного избранного товара";
        String WishToDirectory = "//*[contains(@class, 'button-ui button-ui_brand profile-wishlist__empty-content-btn')]";
        String directoryClassCheck = "subcategory__page-title";
        String directoryCheck = "Каталог товаров";
        String catalog = "catalog-menu__root-item-title";
        String subcategory_item = "subcategory__item";
        String wish_btn = "wishlist-btn";
        String wish_buy = "buy-btn";
}