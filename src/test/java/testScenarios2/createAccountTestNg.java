package testScenarios2;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import baseFunctions2.createAccount;
import basicSuite2.basicSuiteClass;

public class createAccountTestNg {
	
	createAccount CA = new createAccount();

	@BeforeSuite
	public void setup()
	{
		CA.initialaize();
	}
	
	@Test (dataProvider = "GetValue", dataProviderClass = basicSuiteClass.class)
	
	public void CreateAccount (String firstName, String lastName, String eMail, String passWord, String cnfrmPassWord)
	{
		CA.fillDetails(firstName, lastName, passWord, cnfrmPassWord, eMail);
	}
}
