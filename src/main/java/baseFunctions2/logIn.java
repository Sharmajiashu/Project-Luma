package baseFunctions2;

import pageObjects2.logIn_PO;

public class logIn extends BasicFunctions 
{
	BasicFunctions base2 = new BasicFunctions();
	
	public void initialize2()
	{
		base2.GetDriver();
		driver.get("https://magento.softwaretestingboard.com/");
	}

	public void actionToBeDone2 (String eMail, String passWord)
	{
		base2.action(logIn_PO.signInBtn);
		
		base2.SetValue(logIn_PO.eMail, eMail);
		
		base2.SetValue(logIn_PO.passWord, passWord);
		
		base2.action(logIn_PO.logInBtn);
	}

}
