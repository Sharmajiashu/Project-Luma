package baseFunctions2;

import pageObjects2.addToCart_PO;

public class addToCart extends BasicFunctions {

BasicFunctions base4 = new BasicFunctions();
	
public void actionToBeDone4(String quanTity)
{
	base4.action(addToCart_PO.selProduct);
	
	base4.action(addToCart_PO.selColour);
	
	base4.clearField(addToCart_PO.enterQuantity);
	
	base4.SetValue(addToCart_PO.enterQuantity, quanTity);
	
	base4.action(addToCart_PO.selSize);
	
	base4.action(addToCart_PO.addBtn);
}
	
}
