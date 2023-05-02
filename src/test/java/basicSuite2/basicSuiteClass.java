package basicSuite2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class basicSuiteClass {
	
	@DataProvider (name = "GetValue")
	public Object [][] dataSupplier (Method method) throws IOException
	{
		File Excel2 = new File(System.getProperty("user.dir")+ "/userData/UserData.xlsx");
		
		FileInputStream FIS2 = new FileInputStream(Excel2);
		
		XSSFWorkbook WB = new XSSFWorkbook(FIS2);
		
		XSSFSheet Sheet = WB.getSheet(method.getName());
		
		int rowcount = Sheet.getLastRowNum();
		
		System.out.println("no. of rows are:- "+rowcount);
		
		int colcount = Sheet.getRow(0).getLastCellNum();
		
		System.out.println("No. of columns are:- "+colcount);
		
		Object[][] data = new Object [rowcount][colcount];
		
		DataFormatter df = new DataFormatter();
		
		for(int i = 0; i < rowcount; i++)
		{
			for (int j = 0; j < colcount; j++)
			{
				Cell cell = Sheet.getRow(i+1).getCell(j);
				
				data[i][j] = df.formatCellValue(cell);
			}
		}
		
		return data;
	}

}
