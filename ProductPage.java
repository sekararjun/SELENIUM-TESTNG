package POM_MODEL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ProductPage {

    private WebDriver driver;

    // ✅ Constructor
    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    // 🎯 Locators
    private By productTitle = By.className("inventory_item_name");
    private By productDescription = By.className("inventory_item_desc");
    private By productPrice = By.className("inventory_item_price");
    private By addToCartButton = By.xpath("//button[contains(text(),'Add to cart')]");
    private By removeButton = By.xpath("//button[contains(text(),'Remove')]");
    private By cartIcon = By.id("shopping_cart_container");
    private By sortDropdown = By.className("product_sort_container");

    // 📌 Actions
    public List<WebElement> getAllProductTitles() {
        return driver.findElements(productTitle);
    }

    public List<WebElement> getAllProductDescriptions() {
        return driver.findElements(productDescription);
    }

    public List<WebElement> getAllProductPrices() {
        return driver.findElements(productPrice);
    }

    public void addProductToCart(String productName) {
        driver.findElement(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button")).click();
    }

    public void removeProductFromCart(String productName) {
        driver.findElement(By.xpath("//div[text()='" + productName + "']/ancestor::div[@class='inventory_item']//button[contains(text(),'Remove')]")).click();
    }

    public void openCart() {
        driver.findElement(cartIcon).click();
    }

    public void sortProducts(String optionText) {
        driver.findElement(sortDropdown).click();
        driver.findElement(By.xpath("//option[text()='" + optionText + "']")).click();
    }

    // 🧾 Utility
    public String getPageTitle() {
        return driver.getTitle();
    }
}
