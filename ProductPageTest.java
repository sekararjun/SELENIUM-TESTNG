package Pom_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import POM_MODEL.*;

public class ProductPageTest {
	@Test
	public void testAddProductToCart() {
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.saucedemo.com/");
	    
	    // Login first
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.login("standard_user", "secret_sauce");

	    // Products page actions
	    ProductPage productsPage = new ProductPage(driver);
	    productsPage.addProductToCart("Sauce Labs Backpack");
	    productsPage.openCart();

	    // Assertions
	    Assert.assertTrue(driver.getPageSource().contains("Sauce Labs Backpack"));

	  /*  productsPage.getAllProductPrices().forEach(priceElement -> {
	        String priceText = priceElement.getText();
	        Assert.assertTrue(priceText.startsWith("$"), "Price format is incorrect: " + priceText);
	    });*/
	    driver.quit();
	}

}

