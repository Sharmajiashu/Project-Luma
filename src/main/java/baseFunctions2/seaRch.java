package baseFunctions2;

import java.util.List;

import org.openqa.selenium.WebElement;

import pageObjects2.seaRch_PO;

public class seaRch extends BasicFunctions{

BasicFunctions base3 = new BasicFunctions();

public void actionToBeDone3 (String proDuct)
{
	if (base3.checkPageURL ("https://magento.softwaretestingboard.com/catalogsearch/result/"));
	{
		System.out.println("search result page is open");
	}
	base3.SetValue(seaRch_PO.searchText, proDuct);
	
	{
    List<WebElement> productName = base3.getList(3)
    		
    		for (WebElement pro : productName) {
    			if (pro.getText().contains(proDuct))
    		}
	}
	
	base3.action(seaRch_PO.productName);
	
	base3.action(seaRch_PO.product1);
	
	
}
	
}
