package pageObjects2;

import org.openqa.selenium.By;

public class logIn_PO 
{
	public static By signInBtn = (By.xpath("//li[@class=\"authorization-link\"]/a"));
	
	public static By eMail = By.id("email");
	
	public static By passWord = By.id("pass");
	
	public static By logInBtn = By.id("send2");

}
