package baseFunctions2;

import pageObjects2.createAccount_PO;

public class createAccount extends BasicFunctions 
{
	
	BasicFunctions base = new BasicFunctions();
	
	public void initialaize()
	{
		base.GetDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}	
	
	public void fillDetails (String firstName, String lastName, String passWord, String cnfrmPass, String eMail)
	{
		base.action(createAccount_PO.createAccBtn);
		
		base.SetValue(createAccount_PO.firstName,firstName);
		
		base.SetValue(createAccount_PO.lastName, lastName);
		
		base.SetValue(createAccount_PO.eMail, eMail);
		
		base.SetValue(createAccount_PO.passWord, passWord);
		
		base.SetValue(createAccount_PO.confirmPassword, cnfrmPass);
		
		base.action(createAccount_PO.signUp);
		
		if (base.checkPageTitle("My Account")) 
		{
			System.out.println("Signup is successfull with a message "+base.getText(createAccount_PO.succesMsg));
		}
		else if(base.checkPageTitle("Create New User Account"))
		{
			System.out.println("Signup failed with a message "+base.getText(createAccount_PO.errorMsg));
		}
	}

}
