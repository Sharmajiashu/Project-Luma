package testScenarios2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseFunctions2.addToCart;
import baseFunctions2.checkOut;
import baseFunctions2.logIn;
import baseFunctions2.seaRch;
import basicSuite2.basicSuiteClass;

public class logInTestNG {
	
	logIn li = new logIn();
	seaRch sh = new seaRch();
	addToCart atc = new addToCart();
	checkOut co = new checkOut();
	
	@BeforeSuite
	public void setup2()
	{
		li.initialize2();
	}
	
	@Test (dataProvider = "GetValue", dataProviderClass = basicSuiteClass.class, priority = 1)
    public void Login (String eMail, String passWord)
	{
		li.actionToBeDone2(eMail, passWord);
	}
	
	@Test (dataProvider = "GetValue", dataProviderClass = basicSuiteClass.class, priority = 2)
	public void Search(String seaRch)
	{
		sh.actionToBeDone3(seaRch);
	}
	
	@Test(dataProvider = "GetValue", dataProviderClass = basicSuiteClass.class, priority = 3)
	
	public void AddtoCart(String quanTity)
	{
		atc.actionToBeDone4(quanTity);
	}
	
	@Test(dataProvider = "GetValue", dataProviderClass = basicSuiteClass.class, priority = 4)
	
	public void CheckOut(String firstName, String lastName, String comPany, String strt1, String strt2, String city, String zip, String phone)
	{
		co.actionToBeDone5(firstName, lastName, comPany, strt1, strt2, city, zip, phone);	
	}

}

