package baseFunctions2;

import pageObjects2.addToCart_PO;
import pageObjects2.checkOut_PO;

public class checkOut extends BasicFunctions {
	
	BasicFunctions base5 = new BasicFunctions();
	
	public void actionToBeDone5(String firstName, String lastName, String comPany, String strt1, String strt2, String city, String zip, String phone)
	{
		base5.action(checkOut_PO.seeCart);
		
		base5.action(checkOut_PO.checkOutBtn);
		
		base5.clearField(checkOut_PO.firstName);
		
		base5.SetValue(checkOut_PO.firstName, firstName);
		
		base5.clearField(checkOut_PO.lastName);
		
		base5.SetValue(checkOut_PO.lastName, lastName);
		
		base5.SetValue(checkOut_PO.comPany, comPany);
		
		base5.SetValue(checkOut_PO.streetAdr, strt1);

		base5.SetValue(checkOut_PO.streetAdr2, strt2);

		base5.SetValue(checkOut_PO.ciTy, city);
		
		base5.action(checkOut_PO.counTry);

        base5.action(checkOut_PO.countryName);
        
        base5.action(checkOut_PO.staTe);
        
        base5.action(checkOut_PO.stateName);
        
		base5.SetValue(checkOut_PO.zipCode, zip);

		base5.SetValue(checkOut_PO.phone, phone);

        base5.action(checkOut_PO.next);

}
	
}

