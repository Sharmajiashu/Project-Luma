package pageObjects2;

import org.openqa.selenium.By;

public class addToCart_PO {
	
//public static By selProduct = (By.id("option-label-size-143-item-168"));

public static By selProduct = By.className("product-item-link");

public static By selColour = (By.id("option-label-color-93-item-52"));

public static By selSize = (By.xpath("html/body/div/main/div[2]/div/div/div[4]//div/div/div/div/div/div[3]"));

public static By enterQuantity = (By.id("qty"));

public static By addBtn = (By.xpath("//button[@title=\"Add to Cart\"]"));

}
