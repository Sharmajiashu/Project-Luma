package pageObjects2;

import org.openqa.selenium.By;

public class checkOut_PO {
	
public static By seeCart = (By.linkText("My Cart"));

public static By checkOutBtn = (By.id("id=\"top-cart-btn-checkout\""));

// Shipping Address =>
public static By firstName = (By.id("CXJ65EE"));

public static By lastName = (By.id("NRSUW3H"));

public static By comPany = (By.id("HCMATJ6"));

public static By streetAdr = (By.id("DND2K8Q"));

public static By streetAdr2 = (By.id("streetAdr"));

public static By ciTy = (By.id("PP8Q1CJ"));

public static By counTry = (By.id("KKCGFFO"));

public static By countryName = (By.xpath("//option[@value=\"IN\"]"));

public static By staTe = (By.id("CG8XHVP"));

public static By stateName = (By.xpath("//option[@value=\"553\"]"));

public static By zipCode = (By.id("T79QDK6"));

public static By phone = (By.id("EONDDR3"));

public static By next = (By.id("//span[@data-bind=\"i18n: 'Next'\"]"));
}
